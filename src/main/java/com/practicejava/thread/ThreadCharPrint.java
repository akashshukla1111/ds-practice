package com.practicejava.thread;

public class ThreadCharPrint {
	char[] arr= {'a','b','c','d'};
	static ThreadCharPrint t;
	char show;
	public static void main(String[] args) {
		t = new ThreadCharPrint();
		t.callPC();
	}
	public void callPC(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					t.getP();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					t.getShow();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}
	private synchronized void getP() throws InterruptedException {
		int j =0;
		while (j<arr.length){
			show=arr[j];
			t.wait();
			j++;
			t.notify();
		}
	}
	private synchronized void getShow() throws InterruptedException {
		int i=0;
		while (i<arr.length){
			System.out.println(show);
			t.notify();
			i++;
			Thread.sleep(2000);
			System.out.println("show :");
			t.wait();
		}
	}
}
