package com.geeksforgeeks.practice;

import com.geeksforgeeks.practice.linkedlist.Node;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class LinkedList {

    Node prev = null;
    Node t;
    boolean flag = false;
    Node tempp;
    boolean fg = true;
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addHead(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
        }
    }

    public void createLoop() {
        head.next.next.next.next = head;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();

        }
        System.out.println("");
    }

    public void show(Node temp) {
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();

        }
        System.out.println("");
    }

    private int lenthOfList(Node node) {
        if (node == null) return 0;
        return 1 + lenthOfList(node.next);
    }

    public int getLenthOfList() {
        return lenthOfList(head);
    }

    public boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (val != temp.getData())
                temp = temp.next;
            else
                return TRUE;
        }
        return FALSE;

    }

    public int middleElement() {
        Node temp = head;
        Node temp2 = head;
        while (temp2 != null && temp2.next != null) {
            temp = temp.next;
            temp2 = temp2.next.next;
        }
        return temp.getData();
    }

    public void reverse() {

        Node temp = null;
        Node next;

        while (head != null) {
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        head = temp;
    }

    private Node reversefun(Node head) {
        if (nonNull(head)) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            reversefun(temp);
        } else {
            t = prev;
        }
        return t;
    }

    public boolean loop(Node slow, Node fast) {
        if (fast == null || fast.next == null) {
            return false;
        }
        if (slow.equals(fast)) {
            return true;
        }
        return loop(slow.next, fast.next.next);
    }

    public boolean loop() {
        return loop(head, head.next);
    }

    public void reverseRecursive() {
        Node reversefun = reversefun(head);
        show(reversefun);
    }

    private Node insertElement(Node list, Node element) {
        Node prev = list;
        Node current = list;

        if (current == null || current.data >= element.data) {
            element.next = current;
            list = element;
        } else {
            while (current != null && current.data < element.data) {
                prev = current;
                current = current.next;
            }
            element.next = current;
            prev.next = element;
        }
        return list;
    }

    public void insert(int val) {
        Node node = insertElement(head, new Node(val));
        head = node;
        show();
    }

    public boolean pal(Node h) {
        tempp = head;
        if (h == null) {
            return false;
        }
        pal(h.next);
        if (fg && h.data == tempp.data) {
            tempp = tempp.next;
            return true;
        } else {
            tempp = tempp.next;
            fg = false;
            return false;
        }
    }

    public void checkPal() {
        boolean pal = pal(head);
        System.out.println(pal);
    }

    public void removeDup(Node current) {
        if (current == null) {
            return;
        }
        Node prev = current;
        if (current.next != null && current.data == current.next.data) {
            current = current.next.next;
            prev.next = current;
        } else {
            current = current.next;
        }
        removeDup(current);
    }

    public void removeDuplicate(Node current) {
        Node list = current;
        Node prev;
        while (current != null) {
            prev = current;
            if (current.next != null && current.data == current.next.data) {
                current = current.next.next;
                prev.next = current;
            } else {
                current = current.next;
            }
        }
    }

    public void removeDup() {
        removeDup(head);
        show();
    }

    public Node delAlternate() {
        Node current = head;
        Node next;
        if (isNull(current) || isNull(current.next)) {
            return current;
        }
        while (!isNull(current) && !isNull(current.next)) {
            current.next = current.next.next;
            current = current.next;
        }
        return head;
    }

    public void splitTwoLinkedList() {
        Node current = head;
        if (!isNull(current) && !isNull(current.next)) {
            Node list1 = current;
            Node list2 = current.next;
            Node h1 = list1;
            Node h2 = list2;
            while (!isNull(list1) && !isNull(list2)) {
                list1.next = list1.next.next;
                list1 = list1.next;
                if (!isNull(list2.next)) {
                    list2.next = list2.next.next;
                    list2 = list2.next;
                }
            }
            show(h1);
            show(h2);
        }
    }

    public void delRight() {
        Node current = head;
        Node prev = new Node();
        Node next = current.next;
        boolean flag = true;
        while (!isNull(next)) {
            if (current.data < next.data) {
                current = next;
                next = next.next;
                prev.next = current;
            } else {
                prev = current;
                current = next;
                next = next.next;
            }
            if (flag) {
                head = prev;
                flag = false;
            }

        }
    }

    public void segEvenAndOdd() {
        Node current = head;
        Node prev = new Node();
        Node tail = null;
        Node tempPrev = prev;

        while (current != null) {
            if (current.data % 2 != 0) {
                prev.next = current.next;
                Node temp = current;
                current = current.next;
                tail = createTail(temp, tail);
            } else {
                prev = current;
                current = current.next;
            }
        }
        prev.next = tail;
        head=tempPrev.next;
    }

    private Node createTail(Node newNode, Node tail) {
        newNode.next = tail;
        tail = newNode;
        return tail;
    }

    public void reverseAltKthINode(int k,int l){
        Node curren=head;
        Node last=new Node();
        boolean flags=true;
        while (curren!=null){
        int t=k;
       Node first=curren;
            Node prev=null;
            Node next=null;
            while (curren!=null && t>0){
                next=curren.next;
                curren.next=prev;
                prev=curren;
                curren=next;
                t--;
            }
            if(head!=null && flags){
                head=prev;
                flags=false;
            }
            last.next=prev;
            first.next=curren;
            t=l;
            while (curren!=null&& t>0){
                last=curren;
                curren=curren.next;
                t--;
            }
        }

    }
}

