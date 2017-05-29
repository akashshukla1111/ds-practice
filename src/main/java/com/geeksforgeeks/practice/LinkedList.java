package com.geeksforgeeks.practice;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class LinkedList {

    INode prev = null;
    INode t;
    boolean flag = false;
    INode tempp;
    boolean fg = true;
    private INode head;

    public LinkedList() {
        this.head = null;
    }

    public void addHead(int value) {
        if (head == null) {
            head = new INode(value);
        } else {
            INode temp = new INode(value);
            temp.next = head;
            head = temp;
        }
    }

    public void createLoop() {
        head.next.next.next.next = head;
    }

    public void show() {
        INode temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();

        }
        System.out.println("");
    }

    public void show(INode temp) {
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();

        }
        System.out.println("");
    }

    private int lenthOfList(INode node) {
        if (node == null) return 0;
        return 1 + lenthOfList(node.next);
    }

    public int getLenthOfList() {
        return lenthOfList(head);
    }

    public boolean search(int val) {
        INode temp = head;
        while (temp != null) {
            if (val != temp.getData())
                temp = temp.next;
            else
                return TRUE;
        }
        return FALSE;

    }

    public int middleElement() {
        INode temp = head;
        INode temp2 = head;
        while (temp2 != null && temp2.next != null) {
            temp = temp.next;
            temp2 = temp2.next.next;
        }
        return temp.getData();
    }

    public void reverse() {

        INode temp = null;
        INode next;

        while (head != null) {
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        head = temp;
    }

    private INode reversefun(INode head) {
        if (nonNull(head)) {
            INode temp = head.next;
            head.next = prev;
            prev = head;
            reversefun(temp);
        } else {
            t = prev;
        }
        return t;
    }

    public boolean loop(INode slow, INode fast) {
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
        INode reversefun = reversefun(head);
        show(reversefun);
    }

    private INode insertElement(INode list, INode element) {
        INode prev = list;
        INode current = list;

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
        INode node = insertElement(head, new INode(val));
        head = node;
        show();
    }

    public boolean pal(INode h) {
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

    public void removeDup(INode current) {
        if (current == null) {
            return;
        }
        INode prev = current;
        if (current.next != null && current.data == current.next.data) {
            current = current.next.next;
            prev.next = current;
        } else {
            current = current.next;
        }
        removeDup(current);
    }

    public void removeDuplicate(INode current) {
        INode list = current;
        INode prev;
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

    public INode delAlternate() {
        INode current = head;
        INode next;
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
        INode current = head;
        if (!isNull(current) && !isNull(current.next)) {
            INode list1 = current;
            INode list2 = current.next;
            INode h1 = list1;
            INode h2 = list2;
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
        INode current = head;
        INode prev = new INode();
        INode next = current.next;
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
        INode current = head;
        INode prev = new INode();
        INode tail = null;
        INode tempPrev = prev;

        while (current != null) {
            if (current.data % 2 != 0) {
                prev.next = current.next;
                INode temp = current;
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

    private INode createTail(INode newINode, INode tail) {
        newINode.next = tail;
        tail = newINode;
        return tail;
    }

    public void reverseAltKthINode(int k,int l){
        INode curren=head;
        INode last=new INode();
        boolean flags=true;
        while (curren!=null){
        int t=k;
       INode first=curren;
            INode prev=null;
            INode next=null;
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

class INode {
    Integer data;
    INode next;

    public INode() {
        this.data = null;
        this.next = null;
    }

    public INode(int data) {
        this.data = data;
        this.next = null;
    }

    public Integer getData() {
        return data;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
