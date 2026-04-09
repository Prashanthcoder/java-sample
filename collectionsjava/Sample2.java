package collectionsjava;

import java.util.Vector;
import java.util.ArrayList;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector l1 = new Vector();
		l1.add(20);
		l1.add(39);
		l1.add(49);
		l1.add(20);
		System.out.println("l1 vector list -> "+l1);
		System.out.println();
		ArrayList l2 = new ArrayList(l1);
		System.out.println("l2 array list -> "+l2);	
		
	}

}
