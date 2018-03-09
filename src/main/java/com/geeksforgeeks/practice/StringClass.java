package com.geeksforgeeks.practice;

public class StringClass {

    public static void main(String[] args) {
        StringClass stringClass=new StringClass();
        stringClass.equalSumStringSum("153803");
    }

    public  void equalSumStringSum(String input){

        int l = input.length();
        int[][] sumTable= new int[l][l];

        for (int i=0;i<l;i++){
            sumTable[i][i]=input.charAt(i)-'0';
        }
        int maxlen=0;

        for (int ll=2;ll<=l;ll++){

            for (int i=0;i<l-ll+1;i++){

                int j= ll-1+i;
                int k=ll/2;
                sumTable[i][j]= sumTable[i][j-k]+sumTable[j-k+1][j];

                if (ll % 2 == 0 && sumTable[i][j - k] == sumTable[j - k + 1][j] && maxlen<ll){
                    maxlen=ll;
                }

            }
        }

        System.out.println(maxlen);

        for (int i=0;i<l;i++)
        {
            for (int j=0;j<l;j++){
                System.out.print(sumTable[i][j]+"");
            }
            System.out.println();
        }



    }

}
