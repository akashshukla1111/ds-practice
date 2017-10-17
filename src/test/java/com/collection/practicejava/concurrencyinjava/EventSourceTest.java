package com.collection.practicejava.concurrencyinjava;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventSourceTest {
	@Test
	public void eventTest() throws Exception {
		EventSource es = new EventSource();
		es.start();
		int c=13;
		Thread.sleep(20000);
		while(true) {
			new ThisEscape(es);
		}
	}
}