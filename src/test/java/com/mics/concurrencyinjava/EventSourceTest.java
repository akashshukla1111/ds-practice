package com.mics.concurrencyinjava;

import com.practice.mics.concurrencyinjava.EventSource;
import com.practice.mics.concurrencyinjava.ThisEscape;
import org.junit.jupiter.api.Test;
import java.beans.Customizer;

public class EventSourceTest {

//	@Test
	public void eventTest() throws Exception {
		EventSource es = new EventSource();
		es.start();
		int c=13;
		Thread.sleep(200);
		while(true) {
			new ThisEscape(es);
		}
	}

	@Test
	public void name() throws Exception {
		System.out.println(Customizer.class.getClassLoader());
		long mb = 1024*1024;
		Runtime r = Runtime.getRuntime();
		System.out.println(System.out);
		System.out.println(r.maxMemory()/mb);
		System.out.println(r.freeMemory()/mb);
		System.out.println(r.totalMemory()/mb);
	}
}