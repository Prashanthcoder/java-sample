package linkedlist.single_linkedlist;

class Node{
	int value;
	Node next;
}

class SingleLinkedList{
	Node head, tail;
	public void creation(int data) {
		head = new Node();
		Node node = new Node();
		node.value = data;
		node.next = null;
		head = tail = node;
		System.out.println(head.value);
		System.out.println(head);
		System.out.println(tail);
	}
	
	public void insertion(int index, int data) {
		Node node = new Node();
		node.value = data;
		if(index == 0) {
			node.next = head;
			head = node;
		}
		else {
			node.next = null;
			tail.next = tail = node;
		}
	}
	
	public void traverse() {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.value + " ");
			curr = curr.next;
		}
	}
}
public class SingleLinkedListMain {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.creation(10);
		System.out.println("after creation \n\n-------------------------");
		sll.insertion(0, 20);
		sll.insertion(1, 80);
		sll.traverse();
	}
}
