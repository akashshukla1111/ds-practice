package com.practice.geeksforgeeks;

public class BST {
	private Node head;

	public BST() {
		this.head = null;
	}

	public void add(int value) {

		if (head != null) {
			Node node = head;
			Node prev = head;
			Node temp = new Node(value);
			while (node != null) {
				if (temp.data <= node.data) {
					prev = node;
					node = node.getLeft();
				} else {
					prev = node;
					node = node.getRight();
				}
			}
			if (temp.data <= prev.data) {
				prev.setLeft(temp);
			} else {
				prev.setRight(temp);
			}
		} else {
			head = new Node(value);
		}

	}
	public void inOrder() throws Exception {
		Node node = head;
		StackClass<Node> stc = new StackClass<Node>();
		while (node != null) {
			while (node != null) {
				stc.push(node);
				node = node.getLeft();
			}
			node = stc.peek();
			System.out.println(node.data);
			if (node.getRight() == null) {
				stc.pop();
				node = stc.peek();
				System.out.println(node.data);
			}
			node = node.getRight();
		}

	}
	public boolean search(int searchVal) throws Exception {
		if (head != null) {
			Node node = head;
			while (node != null) {
				if (node.data == searchVal) {
					return true;
				} else if (searchVal >= node.data) {
					node = node.getRight();
				} else {
					node = node.getLeft();
				}
			}
		} else {
			throw new Exception("input atleast one element");
		}
		return false;
	}

	public class Node {
		private int data;
		private Node left;
		private Node right;

		private Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}

		public Node getLeft() {
			return left;
		}
		public Node getRight() {
			return right;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}

}
