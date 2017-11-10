package com.geeksforgeeks.practice;

import com.geeksforgeeks.practice.tree.Node;

import java.util.*;
import java.util.LinkedList;


/**
 * Created by akasshukla on 5/20/17.
 */
public class Tree {


    static int max = 0;
    private boolean right;
    private boolean left;

    public static void  toPrint(Node n) {
        if (n == null)
            return;
        toPrint(n.left);
        System.out.print(n.data);
        System.out.print(" ");
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

    public void spiralOrderLevelOrder(Node n) {
        Queue<Node> queue = new LinkedList<>();
        boolean flip = false;
        queue.add(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            String val = "";
            while (size > 0) {
                Node temp = queue.poll();
                val = val + temp.data + " ";
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                size--;
            }
            if (flip)
                System.out.print(val);
            else {
                String[] split = val.trim().split(" ");
                String result = "";
                for (int i = split.length - 1; i >= 0; i--) {
                    result = result + split[i] + " ";
                }
                System.out.print(result);
            }
            flip = !flip;

        }
    }

    public void checkCompleteBinaryTree(Node n) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(n);
        boolean check=true;
        while (!queue.isEmpty() && check) {
            int size = queue.size();
            while (size > 0) {
                Node temp = queue.poll();
                if (!isFullNode(temp)){
                check = isNotFullNodeWithLeftLeafNode(temp);
                }
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                size--;
            }
        }
        System.out.println( "this is "+ check +" complete");
    }

    private boolean isNotFullNodeWithLeftLeafNode(Node temp) {
        return temp!=null && (isLeafNode(temp)? true : (temp.left!=null && isLeafNode(temp.left)));

    }

    private boolean isFullNode(Node temp) {
        if(temp!=null && temp.left!=null && temp.right!=null)
            return true;
        return false;
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
            return findLeft(successorNode.right);
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

    private Node findLeft(Node node) {
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

    public void rootToLeafSum(Node n, int sum, int givenSum) {
        if (n == null) return;
        sum = sum + n.data;
        if (n.left == null && n.right == null) {
            if (sum == givenSum) System.out.println("true");
        }
        rootToLeafSum(n.left, sum, givenSum);
        rootToLeafSum(n.right, sum, givenSum);
    }

    public int maxSumFromLeafToRoot(Node n, int sum) {
        if (n == null) return 0;
        sum = sum + n.data;
        if (n.left == null && n.right == null) {
            return sum;
        }
        return Math.max(maxSumFromLeafToRoot(n.left, sum),
                maxSumFromLeafToRoot(n.right, sum));
    }

    public void inorderTraversalWithOutRecursion(Node n) {
        Stack<Node> stack = new Stack<>();
        findLeft(n, stack);
        while (!stack.isEmpty()) {
            Node peek = stack.pop();
            System.out.print(peek.data + " ");
            if (peek.right != null) {
                findLeft(peek.right, stack);
            }
        }
    }

    private void findLeft(Node n, Stack stack) {
        stack.push(n);
        while (n != null && n.left != null) {
            stack.push(n.left);
            n = n.left;
        }
    }

    public int diameter(Node n) {
        if (n == null) return 0;
        int dia = heightWithRecursion(n.left) + heightWithRecursion(n.right) + 1;
        max = Math.max(dia, max);
        int l = diameter(n.left);
        int r = diameter(n.right);
        return max;
    }

    public boolean childSumProperties(Node n) {

        if (n == null) {
            return true;
        }
        if (n.left == null && n.right == null)
            return true;
        boolean l = childSumProperties(n.left);
        boolean r = childSumProperties(n.right);
        boolean flag = false;
        if (n.left != null && n.data == n.left.data)
            flag = true;
        else if (n.right != null && n.data == n.right.data)
            flag = true;
        else if (n.left != null && n.right != null && n.data == n.left.data + n.right.data)
            flag = true;
        return l & r & flag;
    }

    private boolean isLeafNode(Node n) {
        if (n != null && n.left == null && n.right == null) {
            return true;
        }
        return false;
    }

    public boolean isTreeSum(Node n) {
        int flag = treeSumProp(n);
        if (flag == 1) return true;
        return false;
    }

    private int treeSumProp(Node n) {

        if (n == null) {
            return 1;
        }
        if (isLeafNode(n)) {
            return 1;
        }
        int ls = treeSumProp(n.left);
        int rs = treeSumProp(n.right);

        if (ls != 0 && rs != 0) {
            if (n.left == null) {
                ls = 0;
            } else if (isLeafNode(n.left)) {
                ls = n.left.data;
            } else {
                ls = 2 * n.left.data;
            }

            if (n.right == null) {
                rs = 0;
            } else if (isLeafNode(n.right)) {
                rs = n.right.data;
            } else {
                rs = 2 * n.right.data;
            }

            if (n.data == ls + rs) {
                return 1;
            }
        }
        return 0;
    }

    // TODO : need to complete this question
    public int hightBal(Node n) {
        if (n == null)
            return 0;
        int l = hightBal(n.left);
        int r = hightBal(n.right);
        if (l - r <= 1)
            return 1 + Math.max(l, r);
        else
            return 0;

    }

    public void printLeft(Node n, int height, boolean flag) {
        if (n == null) return;
        printLeft(n.left, height--, flag);
        if (flag) {
            System.out.print(n.data + " ");
            flag = false;
        }
        printLeft(n.right, height--, flag);
    }

    public void verticalSum(Node n, HashMap<Integer, Integer> map, int count) {
        if (n == null) return;

        map.put(count, n.data + (map.get(count) == null ? 0 : map.get(count)));
        verticalSum(n.left, map, count + 1);
        verticalSum(n.right, map, count - 1);

    }

    public void printBoundary(Node n) {
        printLeft(n);
        printLeaves(n);
        printRight(n.right);
    }

    private void printRight(Node n) {
        if (n != null) {
            if (n.right != null) {
                printRight(n.right);
                System.out.println(n.data + " ");
            } else if (n.left != null) {
                printRight(n.left);
                System.out.println(n.data + " ");
            }
        }
    }

    private void printLeaves(Node n) {
        if (n == null) return;
        printLeaves(n.left);
        if (n.left == null && n.right == null)
            System.out.println(n.data + " ");
        printLeaves(n.right);
    }

    private void printLeft(Node n) {
        if (n != null) {
            if (n.left != null) {
                System.out.println(n.data + " ");
                printLeft(n.left);

            } else if (n.right != null) {
                System.out.println(n.data + " ");
                printLeft(n.right);
            }
        }
    }

    public boolean ancestor(Node n, int target) {

        if (n == null) return false;

        if (n.data == target) {
            return true;
        }
        boolean left = ancestor(n.left, target);
        boolean right = ancestor(n.right, target);
        if (left || right) {
            System.out.print(n.data + " ");
            return true;
        }
        return false;
    }

    public void ancestort(Node n, int target, String s) {

        if (n == null) return;
        if(n.data==target){
            System.out.println(s);
        }
        ancestort(n.left, target, s+n.data+" ");
        ancestort(n.right, target, s+n.data+" ");
    }

    /*Consider a coding system for alphabets to integers where ‘a’ is represented as 1, ‘b’ as 2, .. ‘z’ as 26.
    Given an array of digits (1 to 9) as input, write a function that prints all valid interpretations of input array.
    Input: {1, 1}
    Output: ("aa", 'k")
            [2 interpretations: aa(1, 1), k(11)]

    Input: {1, 2, 1}
    Output: ("aba", "au", "la")
            [3 interpretations: aba(1,2,1), au(1,21), la(12,1)]

    Input: {9, 1, 8}
    Output: {"iah", "ir"}
    [2 interpretations: iah(9,1,8), ir(9,18)]*/
    
    char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public void possibleInterpretations(int[] arr, int start){

        if (start >= arr.length-1) {
            for (int i=0; i< arr.length ; i++){
                System.out.print( ch[arr[i]-1]+ " " );
            }
                System.out.println();
            return;
        }

        int ix=start;
        if (arr[ix]<=26){
           arr[ix] = arr[ix];
           possibleInterpretations(arr,ix+1);
       }

       int[] temp=new int[arr.length-1];
       if (ix+1<=temp.length && arr[ix]*10+arr[ix+1]<=26) {
               boolean flag=false;
           for (int j = 0; j < temp.length; j++) {
               if (j == ix) {
                   temp[j] = arr[ix]*10 + arr[ix + 1];
                    flag=true;
               } else if(flag){
                   temp[j] = arr[j+1];
               } else{
                   temp[j] = arr[j];
               }
           }
//           System.out.println(temp);
           possibleInterpretations(temp, ix + 1);
       }
    }

    public int deepestOddLevelNode(Node n , int level){
        if (n==null) return 0;
        if (n.left==null && n.right==null && (level%2!=0)){
            return level;
        }
        return Math.max(deepestOddLevelNode(n.left,level+1),deepestOddLevelNode(n.right, level+1));
    }

    public int deepestLeftLevelNode(Node n ,int level, boolean isLeft){
        if (n==null) return 0;
        if (n.left==null && n.right==null && isLeft){
            return level;
        }
        return Math.max(deepestLeftLevelNode(n.left,level+1,true),deepestLeftLevelNode(n.right, level+1,false));
    }

    int dis = 0;
    public Node lowestCommonAncestorWithDistanceBtwNodes(
            Node n , int n1, int n2,int cnt){
        if (n==null) return null;


        Node left = lowestCommonAncestorWithDistanceBtwNodes(n.left,n1,n2,cnt+1);
        Node right = lowestCommonAncestorWithDistanceBtwNodes(n.right,n1,n2, cnt+1);

        if (n.data==n1 || n.data==n2){
            dis = dis + cnt;
            return n;
        }
        if (left!=null && right!=null){
            dis = dis-2*cnt;
//            System.out.println(dis);
            return n;
        }
        return left!=null ? left: right;
    }

    public int getDis() {
        return dis;
    }

    HashMap<Integer, Node> map = new HashMap<>();
    Map<Integer, Node> disMap = new TreeMap<Integer, Node>(map);
    HashMap<Node,Integer> hightMap = new HashMap<>();
    public void topView(Node n , int dis,int cnt){
        if (n==null) return;
        hightMap.put(n,cnt);
        if (disMap.get(dis)!=null){
//            Note if you change this condition from greater to lesser then bottom view of binary tree will be print
            if (hightMap.get(disMap.get(dis))>cnt){
//                update the map
                disMap.put(dis,n);
            }
        }else {
            disMap.put(dis,n);
        }
        topView(n.left,dis-1,cnt+1);
        topView(n.right,dis+1,cnt+1);
    }
    public Map getDisMap(){
        return disMap;
    }

    public int sumOfAllLeftTreeNodes(Node n, boolean isLeft){

        if (n==null) return 0;
        int left =sumOfAllLeftTreeNodes(n.left,true);
        int right=sumOfAllLeftTreeNodes(n.right,false);
        int res=left+right+n.data;
        if (isLeft){
            n.data=n.data+left;
        }
        return res;
    }

}


