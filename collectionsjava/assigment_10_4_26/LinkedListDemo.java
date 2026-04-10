package assigment_10_4_26;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList p1 = new LinkedList();
		p1.add(2);
		p1.add(1);
		p1.add(89);
		p1.add(70);
		System.out.println(p1);
		LinkedList p2 = new LinkedList();
		p2.add(3);
		p2.add(2);
		p1.addAll(p2);
		System.out.println(p1);
//		p1.addAll(p2);
		p1.addAll(2, p2);
		System.out.println(p1);
		p1.remove(3);//we cant pass integer cause it has overloaded method with object and int indices for the linked list operation so we go for the int index only since 
		System.out.println(p1);
		p1.remove(2);
		System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		p1.removeAll(p2);
		System.out.println(p1);
		p2.add(70);
		System.out.println(p2);
		p1.retainAll(p2);
		System.out.println(p1);
		System.out.println(p2.size());
		System.out.println(p1.get(0));
		System.out.println(p2.get(p2.size()-1));
	}

}
