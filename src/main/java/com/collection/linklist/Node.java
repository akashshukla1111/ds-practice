package com.collection.linklist;

public class Node implements INode {

	protected int data;
	protected Node next;

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public int getdata() {

		return data;
	}

	@Override
	public Node getNext() {

		return next;
	}

	@Override
	public void setdata(int data) {
		this.data = data;

	}

	@Override
	public void setNext(Node next) {
		this.next = next;

	}



}
