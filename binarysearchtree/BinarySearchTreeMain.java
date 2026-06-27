package binarysearchtree;


class BinaryNode{
	int value;
	BinaryNode left , right;
}

class BinarySearchTree{
	BinaryNode root;
	public BinaryNode bstCreation(BinaryNode cn, int value) {
		if(cn==null) {
			BinaryNode node = new BinaryNode();
			node.value = value;
			System.out.print(node.value+" ");
			return node;
		}
		if(value>cn.value) {
			cn.right = bstCreation(cn.right, value);
			return cn;
		}else {
			cn.left = bstCreation(cn.left, value);
			return cn;
		}
	}

	public void insertValue(int value) {
		root = bstCreation(root, value);
	}
	
	public void searchBst(BinaryNode node, int key) {
		if(node==null) {
			System.out.println("value not found");
			return;
		}
		if(key==node.value) {
			System.out.println("value found at "+node);
		}
		else if(key>node.value){
			searchBst(node.right, key);
		}else {
			searchBst(node.left, key);
		}
	}
	
	public void inorderTraverse(BinaryNode root) {
		if(root!=null) {
			inorderTraverse(root.left);
			System.out.print(root.value+" ");
			inorderTraverse(root.right);
		}
	}
	
}
public class BinarySearchTreeMain {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertValue(3);
		bst.insertValue(7);
		bst.insertValue(10);
		bst.insertValue(11);
		bst.insertValue(71);
		bst.insertValue(5);System.out.println();
		bst.searchBst(bst.root, 7);
		bst.inorderTraverse(bst.root);
		
	}
}
