package com.practice.mics.concurrencyinjava.thread;

public class ThreadCharPrint {
	char[] arr = { 'a', 'b', 'c', 'd' };
	static ThreadCharPrint t;
	char show;

	public static void main(String[] args) {
		t = new ThreadCharPrint();
		t.callPC();
	}

	public void callPC() {
		new Thread(() -> {
			try {
				getP();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				getShow();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();

	}

	private void getP() throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < arr.length; i++) {
				show = arr[i];
				wait();
				notify();
			}
		}
	}

	private void getShow() throws InterruptedException {
		Thread.sleep(1);
		synchronized (this) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(show);
				notify();
				wait();
			}
		}
	}
}
