package com.hackerrank.paper;

import java.util.HashMap;

import static java.util.Objects.nonNull;

public class Flipkart {

    public static void main(String[] args) {

        System.out.println(programmerStrings("prrrrogxrammerprogrammer"));
        Flipkart c=new Flipkart();
        System.out.println(c.programmerStringFindIndices("prrrrrogxrammerprogrammer"));
    }
    public static String givenString= "programmer";
    static int programmerStrings(String s) {
        int l=s.length();

        int[] alpha=fillProgrammmer();
        int count=10;
        for(int i=0;i<l ;i++){
            int index=s.charAt(i)-'a';
            if(alpha[index]>0 && count>0){
                alpha[index]=alpha[index]-1;
                count=count-1;
            }
            if(count==0){
                alpha=fillProgrammmer();
                count=10;
                for(int j=l-1;j>i;j--)
                {
                    int inde=s.charAt(j)-'a';
                    if(alpha[inde]>0 && count>0){
                        alpha[inde]=alpha[inde]-1;
                        count=count-1;
                    }
                    if(count==0){
                        return j-i-1;
                    }
                }
            }
        }
        return 0;
    }

    static int[] fillProgrammmer(){

        int[] alpha = new int[26];
        int l=givenString.length();
        for(int i=0;i<l;i++){
            int index=givenString.charAt(i)-'a';
            alpha[index]+=1;
        }
        return alpha;
    }





   /// with hashmap only space complexcity is 10

    public int programmerStringFindIndices(String input){
        char[] charArray = input.toCharArray();
        int count=prg.length;
        int i,j;
        int inputlength = charArray.length;

        HashMap<Character, Integer> prgrammer = createHashTableOfPrgrammer();
        for (i=0; count!=0 && i< inputlength ; i++){
            Integer cnt = prgrammer.get(charArray[i]);
            if (nonNull(cnt) && cnt>0){
                count--;
                prgrammer.put(charArray[i],cnt-1);
            }
        }
        prgrammer = createHashTableOfPrgrammer();
        count=prg.length;
        i=i-1;
        for (j=inputlength-1;j>i && count!=0;j--){
            Integer cnt = prgrammer.get(charArray[j]);
            if (nonNull(cnt) && cnt>0){
                count--;
                prgrammer.put(charArray[j],cnt-1);
            }

        }
        int result=0;
        if (count==0){
            result=j-i;
        }
        return result;

    }
    private static char[] prg={'p','r','o','g','r','a','m','m','e','r'};
    private HashMap<Character,Integer> createHashTableOfPrgrammer() {
        HashMap<Character,Integer> programmer=new HashMap<>(prg.length);
        for (int i=0;i<prg.length;i++){
            Integer integer = programmer.get(prg[i]);
            if (integer!=null){
                programmer.put(prg[i],programmer.get(prg[i])+1);
            }else {
                programmer.put(prg[i],1);
            }
        }
        return programmer;
    }
}
