package com.prashanth.jsoup_scraper;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.TrustManager;
import javax.net.ssl.*;
import java.security.cert.X509Certificate;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RemoteOkScraper {
	public List<Job> scrape() {
	List<Job> jobs = new ArrayList();
	try {
		disableSSLVerification();
		  System.out.println("🔍 Scraping RemoteOK...");

          Document doc = Jsoup.connect("https://remoteok.com/remote-java-jobs")
                  .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
                  .header("Accept-Language", "en-US,en;q=0.9")
                  .timeout(30000)
                  .get();

          Elements rows = doc.select("tr.job");

          for (Element row : rows) {
              String title   = row.select("h2[itemprop=title]").text().trim();
              String company = row.select("h3[itemprop=name]").text().trim();
              String location = row.select("div.location").text().trim();
              String url     = "https://remoteok.com" + row.select("a.preventLink").attr("href");

              if (title.isEmpty()) continue;
              if (location.isEmpty()) location = "Remote";

              jobs.add(new Job(title, company, location, "Not disclosed", url, "RemoteOK"));
          }

          System.out.println("✅ RemoteOK: " + jobs.size() + " jobs found");

      } catch (Exception e) {
          System.err.println("❌ RemoteOK error: " + e.getMessage());
      }
      return jobs;
  }
	
	
private void disableSSLVerification() throws Exception {
    TrustManager[] trustAll = new TrustManager[]{
        new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() { return null; }
            public void checkClientTrusted(X509Certificate[] c, String a) {}
            public void checkServerTrusted(X509Certificate[] c, String a) {}
        }
    };
    SSLContext sc = SSLContext.getInstance("SSL");
    sc.init(null, trustAll, new java.security.SecureRandom());
    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
}
	}

