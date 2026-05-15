package collectionsjava;

import java.util.ArrayList;
import java.util.Collection;

public class Mainclass {
	static void calculateArea(Collection c) {
		for(int i =0;i<c.size();i++) {
			ArrayList l1 = (ArrayList)c;
			int r = (int)l1.get(i);
			final double pi = 3.14;
			double area = pi*r*r;
			System.out.println(area);
		}
	}
public static void main(String[] args) {
	ArrayList l1 = new ArrayList();
	l1.add(5);
	l1.add(8);
	l1.add(983);
	l1.add(7);
	calculateArea(l1);
}
}
