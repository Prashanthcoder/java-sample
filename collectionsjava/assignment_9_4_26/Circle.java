package assignment_9_4_26;
import java.util.*;
public class Circle {
	static void area(Collection c1) {
		for(int i =0;i<c1.size();i++) {
			Vector v1 = (Vector)c1;
			final double pi = 3.142;
			double r = (int)v1.get(i);
			double A = pi*r*r;
			System.out.println("the area of circle for radius "+r+"  is "+A+"\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector radius = new Vector();
		radius.add(7);
		radius.add(21);
		radius.add(14);
		area(radius);
	}

}
