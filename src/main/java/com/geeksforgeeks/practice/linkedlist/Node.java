package com.geeksforgeeks.practice.linkedlist;

/**
 * Created by akasshukla on 7/7/17.
 */
public class Node {
   public int data;
    public Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Integer getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
