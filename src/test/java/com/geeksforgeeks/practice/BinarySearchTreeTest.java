package com.geeksforgeeks.practice;

import com.geeksforgeeks.practice.tree.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by akasshukla on 7/7/17.
 */
public class BinarySearchTreeTest {

	BinarySearchTree bst;

	@Before
	public void setUp(){
		bst=new BinarySearchTree();
		int[] vals= {20,2,34,12,45,7,5};
		for (int val:vals) {
			bst.inseart(val);
		}
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

	@Test
	public void kthSmallest() throws Exception {
		Node rootNode = bst.getRootNode();
		bst.kthSmallestTemp(rootNode,1);
		System.out.println(bst.kthSmallestElement(rootNode,1));
		System.out.println(bst.getKthSmallestElement().data);
	}

	@Test
	public void removeKeys() throws Exception {
		Node removeKeys = bst.removeKeys(bst.getRootNode(), 12, 55);
		Tree.toPrint(removeKeys);
	}

	@Test @Ignore
	public void kthLargestElement() throws Exception {
		Node rootNode = bst.getRootNode();
		System.out.println(bst.kthLargestElement(rootNode,6));
	}
}