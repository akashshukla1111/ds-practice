package com.geeksforgeeks.practice;

public class LinkedList {

	private Node head;
	public LinkedList() {
		this.head = null;
	}
	public void addHead(int value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node temp = new Node(value);
			temp.setNext(head);
			head = temp;
		}
	}
	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();

		}
	}

}

class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
