package assignment_9_4_26;
import java.util.*;
public class VectorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector(5);
		System.out.println(v1.size());
		v1.add(10);
		v1.add("hello");
		v1.add('A');
		v1.add(true);
		v1.add(20.49);
		System.out.println("before the anymethods except add \n"+v1);
		
		System.out.println();
		Vector v2 = new Vector();
		v2.add('I');
		v2.add('M');
		v2.add("great");
		v2.add("ofcourse");
		System.out.println("v2 -> "+v2);
			v1.add(2, "hi");
		System.out.println("add() 2 arguments \nv1 -> "+v1);
		System.out.println("add all methods ");
		v1.addAll(v2);
		System.out.println("to v1, v2 content is added -> \n"+v1);
		
		System.out.println("addall() 2 arguments");
		v1.addAll(1, v2);
		System.out.println("after putting v2 contents to v1 at  index 1 \nv1 -> "+v1);
		
		System.out.println();
		v1.remove("hi");
		System.out.println("remove method hi gone \nv1->"+v1);
		System.out.println();
		v1.removeAll(v2);
		System.out.println("removing all the v2 content from the v1 \nv1->"+v1);
		
		System.out.println("\n retaining all common thing in both");
		Vector v3 = new Vector();
		v3.add("great");
		v3.add("ofcourse");
		v2.retainAll(v3);
		System.out.println("v2 - > "+v2);
		
		System.out.println("size method ");
		System.out.println("v1 size "+v1.size());
		System.out.println("v2 size "+v2.size());
		System.out.println("v3 size "+v3.size());
		
	}

}
