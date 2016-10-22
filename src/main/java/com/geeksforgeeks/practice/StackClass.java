package com.geeksforgeeks.practice;

public class StackClass<E> {

	private Stack<E> st;
	private int capacity;
	private int top;

	public StackClass() {
		this(10);
	}
	public StackClass(int capacity) {
		if (capacity > 0) {
			st = new Stack<E>(capacity);
			this.capacity = capacity;
		}
	}

	public void push(E value) {
		if (!isFull()) {
			E[] array = st.getArr();
			top = st.getTop();
			array[++top] = value;
			st.setTop(top);
		}
	}
	public void pop() {
		if (!isEmpty()) {
			top = st.getTop();
			st.setTop(--top);
		}
	}
	public E peek() throws Exception {
		if (!isEmpty()) {
			E[] arr = st.getArr();
			return arr[st.getTop()];
		} else {
			throw new Exception("no element in the stack please input");
		}
	}
	private boolean isFull() {
		return top == capacity;
	}
	private boolean isEmpty() {
		return top == -1;
	}

	@SuppressWarnings("hiding")
	class Stack<E> {
		private int top;
		private E[] arr;

		@SuppressWarnings("unchecked")
		private Stack(int capacity) {
			top = -1;
			arr = (E[]) new Object[capacity];

		}
		private int getTop() {
			return top;
		}
		private E[] getArr() {
			return arr;
		}
		private void setTop(int top) {
			this.top = top;
		}

	}
}
