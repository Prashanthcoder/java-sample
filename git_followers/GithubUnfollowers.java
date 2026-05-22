package git_followers;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.*;
import com.google.gson.*;

public class GithubUnfollowers {

    // ── CONFIG ──────────────────────────────────────────────────────────────
    static final String USERNAME = "username";
    static final String TOKEN    = "api_token"
    		+ ""; // needs read:user scope
    // ────────────────────────────────────────────────────────────────────────

    static final String BASE_URL = "https://api.github.com";
    static final HttpClient client = HttpClient.newHttpClient();
    static final Gson gson = new Gson();

    public static void main(String[] args) throws Exception {
        System.out.println("Fetching data for @" + USERNAME + " …\n");

        Set<String> following = getAllUsers("/users/" + USERNAME + "/following");
        Set<String> followers = getAllUsers("/users/" + USERNAME + "/followers");

        following.removeAll(followers); // following - followers
        List<String> notFollowingBack = new ArrayList<>(following);
        Collections.sort(notFollowingBack);

        if (notFollowingBack.isEmpty()) {
            System.out.println("✅ Everyone you follow also follows you back!");
        } else {
            System.out.println("🔍 " + notFollowingBack.size() + " people you follow who don't follow you back:\n");
            for (int i = 0; i < notFollowingBack.size(); i++) {
                System.out.printf("  %3d. https://github.com/%s%n", i + 1, notFollowingBack.get(i));
            }
        }
    }

    static Set<String> getAllUsers(String path) throws IOException, InterruptedException {
        Set<String> users = new HashSet<>();
        String url = BASE_URL + path + "?per_page=100";

        while (url != null) {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "token " + TOKEN)
                .header("Accept", "application/vnd.github+json")
                .GET()
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new RuntimeException("GitHub API error: " + response.statusCode() + " " + response.body());
            }

            // Parse JSON array and extract logins
            JsonArray jsonArray = gson.fromJson(response.body(), JsonArray.class);
            for (JsonElement element : jsonArray) {
                users.add(element.getAsJsonObject().get("login").getAsString());
            }

            // Follow pagination via Link header
            url = extractNextUrl(response.headers().firstValue("Link").orElse(""));
        }

        return users;
    }

    static String extractNextUrl(String linkHeader) {
        if (linkHeader == null || linkHeader.isEmpty()) return null;
        for (String part : linkHeader.split(",")) {
            if (part.contains("rel=\"next\"")) {
                return part.trim().split(";")[0].trim().replaceAll("[<>]", "");
            }
        }
        return null;
    }
}
