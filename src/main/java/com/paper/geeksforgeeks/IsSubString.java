package com.paper.geeksforgeeks;

/**
 * Created by ankit on 27/1/16.
 */
public class IsSubString {
    public static void main(String[] args) {
        IsSubString s = new IsSubString();
        System.out.println(s.subString("akash","g"));
    }
    public boolean subString(String s, String sub){
        char[] st = s.toCharArray();
        System.out.println(s.charAt(4));
           int i=0;
            int j=0;
           while (j<sub.length() && i <= s.length()-sub.length()){
               if (s.charAt(i+j)==sub.charAt(j)){
                   j++;
               }else{
                   i++;
                   j=0;
               }
           }
            if(j==sub.length()){
                return true;
            }
       return false;
    }
}
