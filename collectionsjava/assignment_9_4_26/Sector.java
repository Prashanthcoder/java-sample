package assignment_9_4_26;
import java.util.*;
public class Sector {
	static void area(Collection c1, Collection c2) {
		for(int i =0;i<c1.size();i++) {
			Vector v1 = (Vector)c1;
			Vector v2 = (Vector)c2;
			double r = (int)v1.get(i);
			double theta = (double)v2.get(i);
			double A = 0.5*r*r*theta;
			System.out.println("the area of sector for radius "+r+" and theta "+theta+ " is "+A+"\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector radius = new Vector();
		radius.add(7);
		radius.add(12);
		radius.add(15);
		Vector theta = new Vector();
		theta.add(3.14/2);
		theta.add(3.14);
		theta.add(3.14/4);
		
		area(radius, theta);
	}

}
