package com.collection.practicejava;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by akasshukla on 5/20/17.
 */
public class Tree {


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

    public void inOrderRecursive(Node n) {
        if (n == null) return;
        inOrderRecursive(n.left);
        System.out.print(n.data + " ");
        inOrderRecursive(n.right);
    }

    public int leafCount(Node n) {
        if (n == null) return 0;
        if (n.left == null && n.right == null) {
            return 1;
        }
        return leafCount(n.left) +
                leafCount(n.right);

    }

    public Node findSuccessor(Node n, int data) {

        Node successorNode = find(n, data);
        if (successorNode.right != null) {
            return findMin(successorNode.right);
        } else {
            Node successor = null;
            Node ancestor = n;
            while (successorNode != ancestor) {
                if (ancestor.data > successorNode.data) {
                    successor = ancestor;
                    ancestor = ancestor.left;
                } else {
                    ancestor = ancestor.right;
                }
            }
            return successor;
        }
    }

    private Node findMin(Node node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    private Node find(Node n, int data) {

        Node temp = n;
        while (temp != null) {

            if (temp.data == data) {
                return temp;
            } else if (temp.data > data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }

        }
        return temp;
    }

    public void printRootToLeaf(Node n, Integer[] list, int p) {
        if (n == null) return;
        list[p] = n.data;
        if (n.left == null && n.right == null) {
            int i = 0;
            while (i <= p) {
                System.out.print(list[i++] + " ");
            }
            System.out.println("");
        }
        printRootToLeaf(n.left, list, p + 1);
        printRootToLeaf(n.right, list, p + 1);

    }

    public void printRootToLeaf(Node n, String list) {
        if (n == null) return;
        list = list + n.data + " ";
        if (n.left == null && n.right == null) {
            System.out.println(list);
        }
        printRootToLeaf(n.left, list);
        printRootToLeaf(n.right, list);

    }

    public void rootToLeafSum(Node n,int sum,int givenSum){
        if (n==null) return;
        sum=sum+n.data;
        if (n.left==null && n.right ==null){
            if (sum==givenSum) System.out.println("true");
        }
        rootToLeafSum(n.left,sum,givenSum);
        rootToLeafSum(n.right,sum,givenSum);
    }

    public int maxSumFromLeafToRoot(Node n, int sum){
        if (n==null) return 0;
        sum=sum+n.data;
        if (n.left==null && n.right ==null){
            return sum;
        }
       return Math.max( maxSumFromLeafToRoot(n.left,sum),
        maxSumFromLeafToRoot(n.right,sum));

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

