package assignment_9_4_26;
import java.util.*;
public class Rectangle {

	static void area(Collection c1, Collection c2) {
		for(int i =0;i<c1.size();i++) {
//			in this time of coding i'm gonna downcast it
//			the reason behind downcasting is because Collection type doesn't have get method which is present in the subclass to get the subclass properties we go for downcasting
			Vector v1 = (Vector)c1;
			Vector v2 = (Vector)c2;
			int l = (int)v1.get(i);
			int b = (int)v2.get(i);
			double A = l*b;
			System.out.println("The area for length "+l+ " and breadth "+b+ " is "+A);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector l1 = new Vector();
		l1.add(4);
		l1.add(5);
		l1.add(7);
		Vector b2 = new Vector();
		b2.add(20);
		b2.add(30);
		b2.add(40);
		area(l1, b2);
	}

}
