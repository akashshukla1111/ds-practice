package com.geeksforgeeks.practice.tree;

/**
 * Created by akasshukla on 7/7/17.
 */
public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}
