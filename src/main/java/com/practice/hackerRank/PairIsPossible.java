package com.practice.hackerRank;



import java.util.LinkedList;

public class PairIsPossible {

    public static void main(String[] args) {
//        System.out.println(isPossible(1,4,5,9));
        System.out.println(isPos(1,3,5,6));
    }

    static LinkedList<javafx.util.Pair<Integer,Integer>> pairs = new LinkedList<javafx.util.Pair<Integer, Integer>>();

    public static String isPossible(Integer a, Integer b, Integer c, Integer d){
        pairs.addLast(new javafx.util.Pair<Integer, Integer>(a,b));
        while (!pairs.isEmpty()){
            javafx.util.Pair<Integer,Integer> pair = pairs.poll();
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("key :" +key);
            System.out.println("value :" +value);
            if(key.equals(a) &&
                    value.equals(b)){
                return "Yes";
            }
            int sum=key+value;
            if (sum<=c){
                pairs.addLast(new javafx.util.Pair<Integer, Integer>(sum,value));
            }
            if (sum<=d){
                pairs.addLast(new javafx.util.Pair<Integer, Integer>(key,sum));
            }

        }

        return "No";
    }


    public static boolean isPos(int a,int b, int c, int d){

        if (a>c || b>d){
            return false;
        }
        if (a==c && b==d){
            return true;
        }
        int sum=a+b;
        if (sum<=c)
            return isPos(sum,b,c,d);
        if(sum<=d)
            return isPos(a,sum,c,d);

        return false;
    }
}
