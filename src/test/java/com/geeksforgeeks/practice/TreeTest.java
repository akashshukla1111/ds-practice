package com.geeksforgeeks.practice;

import com.geeksforgeeks.practice.Tree;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static javax.script.ScriptEngine.FILENAME;

/**
 * Created by akasshukla on 5/22/17.
 */
public class TreeTest {
    @Test
    public void printBoundary() throws Exception {
        tree.printBoundary(getTree());
    }

    Node bstTree;
    Node sTree;
    Tree tree;
    @Before
    public void setUp(){
        sTree = createTree();
        tree= new Tree();
        createBST();
    }

    private Node createTree() {
        Node node = new Node(2);
        node.left = new Node(4);
        node.right = new Node(5);
        node.left.left = new Node(8);
        node.left.right = new Node(1);
        node.right.left = new Node(3);
        node.right.right = new Node(9);
        node.left.left.left = new Node(18);
        node.left.left.right = new Node(14);
        node.left.left.right.left = new Node(11);
        node.left.left.right.left.right = new Node(12);
        return node;
    }

    private void createBST() {
        bstTree = new Node(10);
        bstTree.left=new Node(7);
        bstTree.right=new Node(12);
        bstTree.left.left=new Node(3);
        bstTree.left.right=new Node(9);
        bstTree.left.right.left=new Node(8);
        bstTree.left.left.right=new Node(4);
        bstTree.right.left=new Node(11);
        bstTree.right.left.left=new Node(10);
        bstTree.right.left.left.left=new Node(10);
        bstTree.right.left.left.left.left=new Node(10);
        bstTree.right.left.left.left.left.left=new Node(10);
        bstTree.right.right=new Node(14);
        bstTree.right.right.right=new Node(14);
        bstTree.right.right.right.right=new Node(14);
        bstTree.right.right.right.right.right=new Node(14);
        bstTree.right.right.right.right.right.right=new Node(14);
    }

    @Test
    public void toPrint() throws Exception {
        System.out.println("print all bstTree preorder");
        tree.toPrint(bstTree);
    }

    @Test
    public void heightWithRecursion() throws Exception {
        System.out.println("\n" + "height of tree Recursion : " + tree.heightWithRecursion(bstTree));
    }

    @Test
    public void height() throws Exception {
        System.out.println("height of tree withoutRecursion");
        System.out.println(tree.height(sTree));
        System.out.println(tree.deepestOddLevelNode(sTree,1));
        System.out.println(tree.deepestLeftLevelNode(sTree,1,true));
    }

    @Test
    public void levelOrderWithOutRecursion() throws Exception {
        System.out.println("print level order bstTree");
        tree.levelOrderWithOutRecursion(bstTree);
    }

    @Test
    public void spiralLevelOrderWithOutRecursion() throws Exception {
        System.out.println("print level order bstTree");
        tree.spiralOrderLevelOrder(bstTree);
    }

    @Test
    public void inOrderRecursive() throws Exception {
        System.out.println("InOrder traverse");
        tree.inOrderRecursive(bstTree);
    }

    @Test
    public void inorderTraversalWithOutRecursion() throws Exception {
        tree.inorderTraversalWithOutRecursion(bstTree);
    }

    @Test
    public void leafCount() throws Exception {
        System.out.println("leaf Count" + tree.leafCount(bstTree));
    }

    @Test
    public void findSuccessor() throws Exception {
        System.out.println(tree.findSuccessor(bstTree, 9).data);
    }

    @Test
    public void printRootToLeaf() throws Exception {
        tree.printRootToLeaf(bstTree,new Integer[10],0);
    }

    @Test
    public void printRootToLeafWithString() throws Exception {
        tree.printRootToLeaf(bstTree,"");
    }

    @Test
    public void sumFromRootToLeaf() throws Exception {
//        Node tempToLeafSum(bstTree,0,34);
    }

    @Test
    public void maxLeafToRootSum() throws Exception {
        System.out.println(tree.maxSumFromLeafToRoot(bstTree,0));
    }

    @Test
    public void diameter() throws Exception {
        System.out.println(tree.diameter(bstTree));
    }

    @Test
    public void childSum() throws Exception {
        System.out.println(tree.childSumProperties(getTree()));
    }

    @Test
    public void treeSumProp() throws Exception {
        Node temp = getTree();
        System.out.println(tree.isTreeSum(temp));
    }

    private Node getTree() {
        Node temp = new Node(26);
        temp.left = new Node(10);
        temp.right = new Node(3);
        temp.left.left = new Node(6);
        temp.left.right = new Node(3);
        temp.right.left = new Node(3);
        temp.right.left.left = new Node(3);
        return temp;
    }

    @Test
    public void verticalSum() throws Exception {
        HashMap<Integer, Integer> map = new HashMap<>();
        tree.verticalSum(getTree(), map,0);
        System.out.println(map);

    }


    @Test
    public void ancestor() throws Exception {
            tree.ancestort(sTree,14," ");
    }

    @Test
    public void checkCompleteBinaryTree() throws Exception {
        Node t = getTree();
        tree.checkCompleteBinaryTree(t);
    }

    @Test
    public void possibleInterpretations() throws Exception {
        int[] arr= {9,1,8,4,3,8,2,7};
        tree.possibleInterpretations(arr,0);

    }
}