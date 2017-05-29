package com.collection.practicejava.linklist;

public class LinkList implements ILinkList {

	protected Node start;
	protected Node end;
	int size;

	public LinkList() {
		start = null;
		end = null;
		size = 0;
	}

	@Override
	public void insertAtStart(int value) {
		Node inode = new Node(value, null);
		if (isEmpty()) {
			start = inode;
			end = start;
		} else {
			inode.setNext(start);
			start = inode;
		}
		size++;
	}

	@Override
	public void insertAtEnd(int value) {
		Node inode = new Node(value, null);
		if (isEmpty()) {
			end = inode;
			start = end;
		} else {
			end.setNext(inode);
			end = inode;
		}
		size++;
	}

	@Override
	public void insertAtPos(int value, int pos) {
		
		if (isEmpty()) {
			System.out.println("please insert atleast one node");
		} else {
			if (pos == 1) {
				Node inode = new Node(value, null);
				inode.setNext(start);
				start = inode;
			} else {
				Node inode = new Node(value, null);
				int i=1;
				Node temp=start;
				while ( i != pos && pos<=i) {
					temp = start.getNext();
					++i;
				}
				inode.setNext(temp);
			}
			size++;
		}
		
	}

	@Override
	public void deleteAtStart() {
		if(isEmpty()){
			System.out.println("No node is created");
		}
		else
		{
			
			start = start.getNext();
			
		}
	}

	@Override
	public void deleteAtEnd() {
		if(isEmpty())
			System.out.println("no node is avalable");
		
			
	}

	@Override
	public void display() {

	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

}
