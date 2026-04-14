package maps;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
public class Maps {
	public static void main(String[] args) {
	HashMap<String, Integer> m1= new HashMap<String, Integer>();
	m1.put("zack", 900);
	m1.put("god", 700);
	m1.put("add", 345);
	m1.put("beku", 392);
	m1.put("meow", 1234);
	m1.put("add", 783);
//	System.out.println(m1);
	for(Entry e1:m1.entrySet()) {
		System.out.println(e1.getKey()+" "+e1.getValue());
	}
}
}