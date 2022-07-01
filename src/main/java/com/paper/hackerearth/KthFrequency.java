package com.paper.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class KthFrequency {

    public static void main(String[] args) throws Exception {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt( br.readLine());

        List<String> strings=new ArrayList<>(N);
        List<Integer> kths=new ArrayList<>(N);
        for (int i=0;i<N;i++){
           strings.add( br.readLine());
           kths.add(Integer.parseInt(br.readLine()));
        }


        for (int j=0;j<N;j++) {
            String input = strings.get(j);
            int kth=kths.get(j);

            int[] index = new int[26];
            for (int i = 0; i < input.length(); i++) {
                index[input.charAt(i) - 97] += 1;
            }
            String output = "-1";
            for (int i = 0; i < 26; i++) {
                if (index[i] >= kth) {
                    output = String.valueOf((char) (i + 97));
                    break;
                }
            }
            System.out.println(output);
        }



    }

    public void  kthFrequency(String input,int kth){

        int[] index=new int[26];
        int length = input.length();
        for (int i=0;i<length;i++){
            index[input.charAt(i) -97]+=1;
        }
        String output="-1";
        for (int i=0;i<26;i++){
            
            if (index[i]>=kth){
              output=String.valueOf((char)(i + 97));
            }
        }
        System.out.println(output);
    }
}
