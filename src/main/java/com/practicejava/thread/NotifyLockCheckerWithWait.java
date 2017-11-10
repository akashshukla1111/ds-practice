package com.practicejava.thread;

import java.util.Scanner;

/*

 NOTE :
 Wait is immediately releasing the lock to other thread
 like t1 thread calling wait() - means other thread use object
 Notify :  Notify is release lock either synchronized block endup or again we are calling the wait method
 like t2 thread is calling notify() and still few work is pending in the synchronized block so call wait or wait to
 finish the block
 */


public class NotifyLockCheckerWithWait {

	public static void main(String[] args) {
		Processor processor=new Processor();

		Thread t1 = new Thread(() -> {
			try {
				processor.getProduced();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				processor.getConsumed();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}
}

class Processor{

	public void getProduced() throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		synchronized (this){
			System.out.println("produced");
			wait();
			System.out.println("producer : thread is again in producer area");
			scanner.nextLine();
			notify();
			System.out.println("producer : press key to notify consumer area");
			scanner.nextLine();
			System.out.println("producer : ended");

		}
	}

	public void getConsumed() throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		Thread.sleep(1);
		synchronized (this){
			System.out.println("consumer : presss enter key");
			scanner.nextLine();
			System.out.println("consumer : pressed enter key to start notify");
			notify();
			scanner.nextLine();
			System.out.println("consumer : enter key pressed to notify producer");
			wait();
			System.out.println("consumer : this is call when producer press enter key");
			System.out.println("consumer : ended");
		}

	}
}

