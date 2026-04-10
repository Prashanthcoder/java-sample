package assignment_9_4_26;

import java.util.Collection;
import java.util.Vector;

public class Parallelogram {

	static void area(Collection a1, Collection b1, Collection h1) {
		for(int i =0;i<a1.size();i++) {
			Vector v1 = (Vector)a1;
			Vector v2 = (Vector)b1;
			Vector v3 = (Vector)h1;
			int a = (int)v1.get(i);
			int b = (int)v2.get(i);
			int h = (int)v3.get(i);
			
			double A = 0.5*(a+b)*h;
			System.out.println("the area for parallelogram a = "+a+" b = "+b+" c = "+h+" is "+A);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a1 = new Vector();
		a1.add(3);
		a1.add(5);
		a1.add(7);
		Vector a2 = new Vector();
		a2.add(89);
		a2.add(70);
		a2.add(90);
		Vector a3 = new Vector();
		a3.add(9);
		a3.add(70);
		a3.add(17);
		
		area(a1, a2, a3);
	}

}
