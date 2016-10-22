package com.geeksforgeeks.paper;

/**
 * Created by akash on 18/02/16.
 */
public class TestProb{
    public static void main(String[] args) {
        TestProb t = new TestProb();
        //System.out.println(t.replacefun("this is a book m this is not mine", "tho"));
        System.out.println(t.checkBracket("akash shula "));
    }
    public String replacefun(String st, String ch){
        StringBuffer b = new StringBuffer();
        int i=0;
        while (st.length()>i){
            int j;
           for( j=0; j< ch.length();j++){
               if(st.charAt(i) != ch.charAt(j))
                   continue;
               else
                   break;

           }
            if(j == ch.length()){
                b.append(st.charAt(i));
            }
            i++;
        }
        return b.toString();
    }

    public boolean checkBracket(String sh){
        int count=0;
        for(int i=0;i<sh.length();i++){
            if(sh.charAt(i) == '('){
                count++;
            }
            if(sh.charAt(i) == ')'){
                count--;
            }
            if(count <0){
                break;
            }
        }
        if(count != 0 ){
            return false;
        }
            return true;
    }

}
