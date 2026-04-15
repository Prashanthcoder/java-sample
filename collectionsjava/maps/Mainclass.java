package maps;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> t1 = new TreeMap<String, Integer>();
		t1.put("hello", 777);
		t1.put("meow", 9830);
		t1.put("dawg", 67);
		t1.put("hello",302);
		t1.put("ahha", 69);
		for(Entry e1: t1.entrySet()) {
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
	}

}
