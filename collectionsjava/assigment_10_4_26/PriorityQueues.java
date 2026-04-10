package assigment_10_4_26;
import java.util.PriorityQueue;
public class PriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p1 = new PriorityQueue();
		p1.add(2);
		p1.add(1);
		p1.add(89);
		p1.add(70);
		System.out.println(p1);
		PriorityQueue p2 = new PriorityQueue();
		p2.add(3);
		p2.add(2);
		p1.addAll(p2);
		System.out.println(p1);
		p1.addAll(p2);
		System.out.println(p1);
		p1.remove(89);
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
	}

}
