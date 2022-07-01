package com.practice.geeksforgeeks;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by akasshukla on 5/18/17.
 */
public class BitwiseAddtion {

    public static int add(int a, int b){
        if(b == 0) return a;
        return add(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args) {
//        System.out.println(add(1,11));
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(21);
        list.addFirst(4);
        list.addFirst(67);
        list.addFirst(18);
        list.addFirst(15);
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        System.out.print(iterator.next());
    }



}
