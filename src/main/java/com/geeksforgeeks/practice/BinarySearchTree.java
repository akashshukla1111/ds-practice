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

}
