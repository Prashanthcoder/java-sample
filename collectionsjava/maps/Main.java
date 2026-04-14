package maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		l1.put("s1", 2881);
		l1.put("prem", 233);
		l1.put("prajwal",777);
		l1.put("sharath", 897);
		l1.put("Nandish", 234);
		System.out.println(l1);
		for(Entry e1: l1.entrySet()) {
			System.out.println(e1.getKey()+ " " +e1.getValue());
		}
	}

}
