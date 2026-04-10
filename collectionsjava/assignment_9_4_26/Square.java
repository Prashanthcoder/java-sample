package assignment_9_4_26;
import java.util.*;
public class Square {
	static void area(Collection c1) {
		for(int i =0;i<c1.size();i++) {
			Vector v1 = (Vector)c1;
			int s = (int)v1.get(i);
			double A = s*s;
			System.out.println("the area of square for the side "+s+"  is "+A+"\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector side = new Vector();
		side.add(3);
		side.add(5);
		side.add(6);
		area(side);
		}

}
