package com.collection.practicejava;

public class MyList {

	private Node head;

	public MyList() {
		head = null;
	}

	public void add(int value) {

		if (head == null) {
			Node newNode = new Node(value);
			head = newNode;
		} else {
			Node newNode = new Node(value);
			newNode.next = head;
			head = newNode;
		}
	}
	
	public Node getIterate(){
		return head;
	}

	public void Display(Node head) {
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}

	public Node reverse(Node head) {

		Node prev = null;
		Node fwd = head;
		while (fwd != null) {
			fwd = head.next;
			head.next = prev;
			prev = head;
			head = fwd;
		}

		return prev;
	}

	 class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}

	}
}
