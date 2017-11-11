package com.practicejava.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		PCProcessor pcProcessor = new PCProcessor();
		new Thread(() -> {
			try {
				pcProcessor.produced();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				pcProcessor.consumed();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
	}
}

class PCProcessor {

	private int capacity;
	private Integer[] queue;

	public PCProcessor() {
		this(5);
	}

	public PCProcessor(int size) {
		queue = new Integer[size];
		capacity = 0;

	}

	public void produced() throws InterruptedException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("in produce");
		int count = 1;
		while (true) {
			synchronized (queue) {
				if (capacity >= queue.length) {
					queue.wait();
					queue.notify();
				}
				else {
					if (capacity >= 0) {
						queue[capacity] = count;
						System.out.println("Enter " + (capacity + 1) + " value : " + count);
						Thread.sleep(500);
						 count++;
					}
					capacity++;
				}
			}
		}

	}

	public void consumed() throws InterruptedException {
		int in = 0;
		while (true) {
			synchronized (queue) {
				if (capacity <= 0) {
					queue.notify();
					queue.wait();
					in = 0;
				}
				else {
					if (capacity <= queue.length) {
						System.out.println("consumed values : " + queue[in++]);
						Thread.sleep(500);
					}
					capacity--;
				}
			}
		}
	}
}
