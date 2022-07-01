package com.practice.geeksforgeeks;

import java.util.Scanner;
import java.util.Stack;

public class PesticideProblem {
    static Stack<Integer> aStack = new Stack<Integer>();
    static Stack<Integer> bStack = new Stack<Integer>();

    static int printDays(Stack aStack){
        int objectsRemoved=-1;
        int countLoops=0;

        while(objectsRemoved!=0) {

            objectsRemoved=0;

            int prevValue=0;
            int curValue=0;

            while(!aStack.isEmpty()) {

                curValue = (int)aStack.pop();

                if(!aStack.isEmpty()){
                    int tempValue = (int)aStack.pop();
                    if(curValue<=tempValue){
                        bStack.push(curValue);
                    }
                    else{
                        objectsRemoved++;
                        //System.out.println("Removed " + curValue);
                    }
                    aStack.push(tempValue);
                }
                else{
                    bStack.push(curValue);
                }

            }


            while(!bStack.isEmpty()) {
                aStack.push(bStack.pop());
            }

            if(objectsRemoved!=0){
                countLoops++;
            }

        }

        return countLoops;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named PesticideProblem. */
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            aStack.push(in.nextInt());

        }

        System.out.println(printDays(aStack));
    }
}