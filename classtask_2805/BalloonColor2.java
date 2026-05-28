package classtask_2805;
import java.util.LinkedHashMap;
import java.util.Map;

public class BalloonColor2 {
public static void main(String[] args) {
	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	char[] colors = {'r', 'r', 'r', 'r', 'e', 'e', 'e', 'e'};
	boolean foundOdd = false;
	for(char ch: colors) {
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
	map.forEach((k, v)->{
		
		if(v%2==1)
		System.out.println(k);
	});
	
	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() % 2 != 0) {
            System.out.println(entry.getKey());
            foundOdd = true;
            break; // Keeps only the first odd element. Remove this if you want ALL odd elements in order.
        }
    }
    
    if (!foundOdd) {
        System.out.println("All are even");
    }
	
//	if()
}
}
