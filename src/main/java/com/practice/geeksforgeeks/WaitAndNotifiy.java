package com.geeksforgeeks.practice;

/**
 * Created by akashshukla on 19/01/16.
 */
public class WaitAndNotifiy {

    public static void main(String[] args) throws InterruptedException {
      String  n = new String("akash");
        Mythread t = new Mythread();
        t.start();
        synchronized (t){
            for (int i =0 ;i<10;i++){
                System.out.println("main"+i);
                n.wait();
                n.notify();
            }
        }
    }
}
class Mythread extends Thread{
    String s = new String();
    public void run(){
        s.notify();
        for(int i =0;i<10;i++){
            System.out.println("child"+i);
            try {
                s.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}