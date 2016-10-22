package com.hackerearth.paper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Question3 {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.now();
		System.out.println(Date.from(
				LocalDateTime.of(d1.getYear(), d1.getMonth(), d1.getDayOfYear(), 18, 25).atZone(ZoneId.systemDefault()).toInstant()));
	}

}
