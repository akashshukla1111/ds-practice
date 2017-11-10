// code is written by ak

package com.practicejava;

class Linklist {

	int val;
	Linklist next = null;

	public void add(int val) {
		Linklist node = makeNode(val);
		if (next == null) {
			setNode(node);
		} else {
			Linklist temp = next;
			next = node;
			node.next = temp;
		}
	}

	public Linklist makeNode(int val) {
		Linklist li = new Linklist();
		li.val = val;
		li.next = null;
		return li;
	}

	public void setNode(Linklist next) {
		this.next = next;
	}

	public Linklist it() {
		return next;
	}
	public Linklist next() {
		next = next.next;
		return next;
	}
	public Linklist reverse(Linklist l){
		Linklist head = l.it();
		//System.out.println(head.next.val);
		while(head.next != null){
			System.out.println(head.val);
			Linklist temp = head.next.next;
			head.next.next = head;
			head.next = temp;
			head = head.next;
			
		}
		return head;
	}
	
	public static void main(String[] args) {

		Linklist l = new Linklist();

		l.add(20);
		l.add(45);
		l.add(23);
		l.add(67);
		Linklist ll = l.reverse(l);
		while (ll.it() != null) {
			System.out.println(ll.it().val);
			ll.next();
		}
	}

}
