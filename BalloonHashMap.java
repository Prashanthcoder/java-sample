import java.util.LinkedHashMap;
import java.util.Map;

public class BalloonColor2 {
public static void main(String[] args) {
	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	char[] colors = {r, r, r, e, e};
	for(char ch: colors) {
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
	map.forEach((k, v)->{
		System.out.println(k+" "+v);
	})
}
}
