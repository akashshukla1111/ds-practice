package com.geeksforgeeks.practice;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akasshukla on 3/27/17.
 */
public class LinkedListTest {
    @Test
    public void addHead() throws Exception {

        LinkedList list = new LinkedList();
        list.addHead(3);
        list.addHead(2);
        list.addHead(6);
        list.addHead(5);
        list.addHead(11);
        list.addHead(10);
        list.addHead(12);
        list.addHead(15);
//        list.addHead(9);
        list.show();
//        System.out.println(list.getLenthOfList());
//        System.out.println(list.search(6));
//        System.out.println(list.middleElement());
//        list.reverseRecursive();
//        list.createLoop();
//        list.loop();
//        list.insert(4);
//        list.checkPal();
//        NodeN node = list.delAlternate();
//        list.show(node);
        list.reverseAltKthINode(3,0);
        list.show();
    }



}