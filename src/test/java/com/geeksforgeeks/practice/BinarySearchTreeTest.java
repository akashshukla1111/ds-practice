package com.geeksforgeeks.practice;

import com.geeksforgeeks.practice.tree.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akasshukla on 7/7/17.
 */
public class BinarySearchTreeTest {

	BinarySearchTree bst;

	@Before
	public void setUp(){
		bst=new BinarySearchTree();
		bst.inseart(20);
		bst.inseart(2);
		bst.inseart(34);
		bst.inseart(12);
		bst.inseart(45);
		bst.inseart(7);
		bst.inseart(5);
	}
	@Test
	public void inseartTest() throws Exception {
		Tree.toPrint(bst.getRootNode());
	}

	@Test
	public void searchTest() throws Exception {
		Assert.assertTrue(bst.search(5));
		Assert.assertTrue(bst.search(20));
	}

	@Test
	public void isBSTTest() throws Exception {
		Node rootNode = bst.getRootNode();
		rootNode.left.left=new Node(1);
		Assert.assertTrue(bst.isBST(bst.getRootNode()));
	}

}