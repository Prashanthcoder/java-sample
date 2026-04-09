package assignment_9_4_26;
import java.util.*;
public class Triangle{

	static void area(Collection c1, Collection c2) {
		for(int i =0;i<c1.size();i++) {
//			in this time of coding i'm gonna downcast it
//			the reason behind downcasting is because Collection type doesn't have get method which is present in the subclass to get the subclass properties we go for downcasting
			Vector v1 = (Vector)c1;
			Vector v2 = (Vector)c2;
			int b = (int)v1.get(i);
			int h = (int)v2.get(i);
			double A = 0.5*b*h;
			System.out.println("The area for breadth "+b+ " and height "+h+ " is "+A);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector b1 = new Vector();
		b1.add(4);
		b1.add(5);
		b1.add(7);
		Vector h2 = new Vector();
		h2.add(20);
		h2.add(30);
		h2.add(40);
		area(b1, h2);
	}

}
