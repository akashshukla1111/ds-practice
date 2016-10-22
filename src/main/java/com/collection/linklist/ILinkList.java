package com.collection.linklist;

public interface ILinkList {

	public void insertAtStart(int value);

	public void insertAtEnd(int value);

	public void insertAtPos(int value, int pos);

	public void deleteAtStart();

	public void deleteAtEnd();

	public void display();

	public boolean isEmpty();
}
