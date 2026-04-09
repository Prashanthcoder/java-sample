package collectionsjava;
import java.util.*;
public class Sample1 {
	
	
	static void area(Collection c) {
		for(int i =0;i<c.size();i++) {
		Vector a1 = (Vector)c;
		final double pi = 3.142;
		int r = (int)a1.get(i);
		double res = pi*r*r;
		System.out.println("area for the radius "+r+" is "+res);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector l1 = new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(39);
		l1.add(441);
		area(l1);
	}

}
