package com.geeksforgeeks.practice;

import com.geeksforgeeks.practice.tree.Node;

/**
 * Created by akasshukla on 7/7/17.
 */
public class BinarySearchTree {

	private Node node;

	public Node getRootNode() {
		return node;
	}

	public void inseart(int val) {
		if (node == null) {
			node = new Node(val);
		}
		else {
			add(node, val);
		}
	}

	private Node add(Node node, int val) {
		if (node == null) {
			return new Node(val);
		}
		if (node.data > val) {
			node.left = add(node.left, val);
		}
		else {
			node.right = add(node.right, val);
		}
		return node;
	}

	public boolean search(int val){
		return searchT(node,val);
	}

	public boolean searchT(Node node,int val){

		if (node==null) return false;

		if (node.data==val) return true;

		if (node.data>val) {
			return searchT(node.left,val);
		}
		else {
			return searchT(node.right,val);
		}
	}

	public boolean isBST(Node n){
		if (n==null) return true;
		boolean left=isBST(n.left);
		if (left && n.left!=null && n.left.data>n.data){
			left=false;
		}
		boolean right=isBST(n.right);
		if (right && n.right!=null && n.right.data<n.data){
			right=false;
		}
		return left&&right;
	}

	Node nd=null;
	public int kthSmallestTemp(Node n,int k){
		if (n==null) return k;
		k= kthSmallestTemp(n.left,k);
		if (k>0){
		nd=n;
		}
		k=k-1;
		k= kthSmallestTemp(n.right,k);
		if (k>0){
		 	nd=n;
		}
		return k;
	}
	public Node getKthSmallestElement(){
		return nd;
	}

	private int k=0;
	public Integer kthSmallestElement(Node n,int k){
		this.k =k;
		Node node = kthSmallestE(n);
		return node!=null ? node.data : null;
	}

	private Node kthSmallestE(Node n){
		Node nodeVal=null;
		if (n.left==null) return n;
		if (this.k > 0){
			nodeVal=kthSmallestE(n.left);

		}
		this.k = this.k-1;
		if (this.k > 0){
			nodeVal=kthSmallestE(n.right);
		}
		return nodeVal;
	}

	public Integer kthLargestElement(Node n,int k){
		this.k =k;
		Node node = kthLargestE(n);
		return node!=null ? node.data : null;
	}

	private Node kthLargestE(Node n){
		Node nodeVal=null;
		if (n!=null && n.right==null) return n;

		if (this.k > 0){
			nodeVal=kthLargestE(n.right);

		}
		this.k = this.k-1;
		if (this.k > 0){
			nodeVal=kthLargestE(n.left);
		}
		return nodeVal;
	}

	public Node removeKeys(Node n , int k1, int k2){
		if (n==null) return n;

		Node ls=removeKeys(n.left,k1,k2);
		Node rs=removeKeys(n.right,k1,k2);
		if (k1<n.data && n.data<k2){
			n.left=ls;
			n.right=rs;
			return n;
		}
		if (k1>=n.data) return rs;
		return ls;
	}

	public void findPairInBST(Node l, Node r , int val){
		if (l==null || r==null){
			return;
		}

		findPairInBST(l.left,r.right,val);
		
	}


}
