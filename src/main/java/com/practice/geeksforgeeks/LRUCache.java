package com.practice.geeksforgeeks;

/**
 * Created by akash on 21/02/16.
 */

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final int cacheSize;
    private DoublyLinkedList pageList;
    private Map<Integer, LNode> pageMap;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        pageList = new DoublyLinkedList(cacheSize);
        pageMap = new HashMap<Integer, LNode>();
    }

    public static void main(String[] args) {
        int cacheSize = 4;
        LRUCache cache = new LRUCache(cacheSize);
        cache.accessPage(4);
        cache.printCacheState();
        cache.accessPage(2);
        cache.printCacheState();
        cache.accessPage(1);
        cache.printCacheState();
        cache.accessPage(1);
        cache.printCacheState();
        cache.accessPage(4);
        cache.printCacheState();
        cache.accessPage(3);
        cache.printCacheState();
        cache.accessPage(7);
        cache.printCacheState();
        cache.accessPage(8);
        cache.printCacheState();
        cache.accessPage(3);
        cache.printCacheState();
    }

    public void accessPage(int pageNumber) {
        LNode pageNode = null;
        if (pageMap.containsKey(pageNumber)) {
            // If page is present in the cache, move the page to the start of list
            pageNode = pageMap.get(pageNumber);
            pageList.movePageToHead(pageNode);
        } else {
            // If the page is not present in the cache, add the page to the cache
            if (pageList.getCurrSize() == pageList.getSize()) {
                // If cache is full, we will remove the tail from the cache pageList
                // Remove it from map too
                pageMap.remove(pageList.getTail().getPageNumber());
            }
            pageNode = pageList.addPageToList(pageNumber);
            pageMap.put(pageNumber, pageNode);
        }
    }

    public void printCacheState() {
        pageList.printList();
        System.out.println();
    }
}

class DoublyLinkedList {

    private final int size;
    private int currSize;
    private LNode head;
    private LNode tail;

    public DoublyLinkedList(int size) {
        this.size = size;
        currSize = 0;
    }

    public LNode getTail() {
        return tail;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        LNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp);
            tmp = tmp.getNext();
        }
    }

    public LNode addPageToList(int pageNumber) {
        LNode pageNode = new LNode(pageNumber);
        if (head == null) {
            head = pageNode;
            tail = pageNode;
            currSize = 1;
            return pageNode;
        } else if (currSize < size) {
            currSize++;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        pageNode.setNext(head);
        head.setPrev(pageNode);
        head = pageNode;
        return pageNode;
    }

    public void movePageToHead(LNode pageNode) {
        if (pageNode == null || pageNode == head) {
            return;
        }

        if (pageNode == tail) {
            tail = tail.getPrev();
            tail.setNext(null);
        }

        LNode prev = pageNode.getPrev();
        LNode next = pageNode.getNext();
        prev.setNext(next);

        if (next != null) {
            next.setPrev(prev);
        }

        pageNode.setPrev(null);
        pageNode.setNext(head);
        head.setPrev(pageNode);
        head = pageNode;
    }

    public int getCurrSize() {
        return currSize;
    }

    public void setCurrSize(int currSize) {
        this.currSize = currSize;
    }

    public LNode getHead() {
        return head;
    }

    public void setHead(LNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }
}

class LNode {

    private int pageNumber;
    private LNode prev;
    private LNode next;

    public LNode(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int data) {
        this.pageNumber = data;
    }

    public LNode getPrev() {
        return prev;
    }

    public void setPrev(LNode prev) {
        this.prev = prev;
    }

    public LNode getNext() {
        return next;
    }

    public void setNext(LNode next) {
        this.next = next;
    }

    public String toString() {
        return pageNumber + "  ";
    }
}
