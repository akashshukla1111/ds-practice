package com.collection.practicejava;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by akasshukla on 5/20/17.
 */
public class TreeHight {


    public static void main(String[] args) {
//        Node node = new Node(2);
//        node.left = new Node(4);
//        node.right = new Node(5);
//        node.left.left = new Node(8);
//        node.left.right = new Node(1);
//        node.right.left = new Node(3);
//        node.right.right = new Node(9);
//        node.left.left.left = new Node(18);
//        node.left.left.right = new Node(14);
//        node.left.left.right.left = new Node(11);
        Node node= new Node(10);
        node.left=new Node(7);
        node.right=new Node(12);
        node.left.left=new Node(3);
        node.left.right=new Node(9);
        node.left.right.left=new Node(8);
        node.left.left.right=new Node(4);
        node.right.left=new Node(11);
        node.right.right=new Node(14);

        TreeHight treeHight = new TreeHight();
        System.out.println("print all node preorder");
        treeHight.toPrint(node);
        System.out.println("\n" + "height of tree Recursion : " + treeHight.heightWithRecursion(node));
        System.out.println("height of tree withoutRecursion");
        System.out.println(treeHight.height(node));
        System.out.println("print level order node");
        treeHight.levelOrderWithOutRecursion(node);
        System.out.println("InOrder traverse");
        treeHight.inOrderRecursive(node);
        System.out.println("leaf Count" + treeHight.leafCount(node));

        System.out.println(treeHight.find(node,5));
        System.out.println(treeHight.findSuccessor(node, 9).data);

    }

    public void toPrint(Node n) {
        if (n == null)
            return;
        System.out.print(n.data);
        System.out.print(" ");
        toPrint(n.left);
        toPrint(n.right);
    }

    public int heightWithRecursion(Node n) {
        if (n == null)
            return 0;
        return 1 + Math.max(heightWithRecursion(n.left), heightWithRecursion(n.right));
    }

    public int height(Node n) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(n);
        int height = 0;
        while (!queue.isEmpty()) {
            height++;
            int size = queue.size();
            while (size > 0) {
                Node temp = queue.poll();
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                size--;
            }
        }
        return height;
    }

    public void levelOrderWithOutRecursion(Node n) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node temp = queue.poll();
                System.out.print(temp.data + " ");
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                size--;
            }
            System.out.print("\n");
        }
    }

    public void inOrderRecursive(Node n){
        if(n==null) return;
        inOrderRecursive(n.left);
        System.out.print(n.data+" ");
        inOrderRecursive(n.right);
    }

    public int leafCount(Node n){
        if (n==null) return 0;
        if (n.left==null && n.right == null) {
            return 1;
        }
        return leafCount(n.left)+
            leafCount(n.right);

    }

    public Node findSuccessor(Node n , int data){

        Node successorNode = find(n, data);
        if(successorNode.right !=null){
            return findMin(successorNode.right);
        }else {
            Node successor=null;
            Node ancestor = n;
            while (successorNode != ancestor){
            if (ancestor.data>successorNode.data){
                successor=ancestor;
                ancestor=ancestor.left;
            }else{
                ancestor=ancestor.right;
            }
            }
            return successor;
        }
    }

    private Node findMin(Node node) {
        while (node!=null&& node.left!=null){
                node = node.left;
        }
        return node;
    }

    private Node find(Node n, int data){

        Node temp=n;
        while (temp!=null){

            if(temp.data==data){
                return temp;
            }else if(temp.data>data){
                temp=temp.left;
            }else {
                temp=temp.right;
            }

        }
        return temp;
    }

}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

