package com.geeksforgeeks.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by akash on 22/02/16.
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
       BinaryTree b = new BinaryTree();
        b.root = new TNode(2);
        b.root.left = new TNode(5);
        b.root.right = new TNode(6);
        b.root.left.left = new TNode(7);
        b.root.left.right = new TNode(8);
        //b.levelOrderTraverse(b.root);
        b.preOrder(b.root);
    }

}
 class BinaryTree{

     TNode root;
     BinaryTree(){
         root=null;
     }

     public void levelOrderTraverse(TNode node){

         Queue<TNode> q = new LinkedList<>();
         q.add(node);
         while (!q.isEmpty()){
             TNode temp = q.poll();
             System.out.print(temp.value);
             if(temp.left != null){
                 q.add(temp.left);
                 if(temp.right !=null){
                     q.add(temp.right);
                 }
             }
         }
     }
     public void preOrder(TNode node){
         if(node == null){
             return;
         }
         preOrder(node.left);
         System.out.println(node.value);
         preOrder(node.right);
     }

 }

  class  TNode {
    int value;
     TNode left;
     TNode right;

     TNode(int value){
         this.value=value;
         left=null;
         right=null;
     }
}