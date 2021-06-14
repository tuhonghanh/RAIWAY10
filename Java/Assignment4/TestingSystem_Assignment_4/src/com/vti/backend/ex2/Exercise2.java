package com.vti.backend.ex2;

import java.util.Locale;

public class Exercise2 {
	public void ex2Question1() {
		System.out.println("Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó");
		int i = 5;
		System.out.printf("%d%n", i);
	}
	
	public void ex2Question2() {	
		System.out.println("Question 2:Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó ");
		int i = 100000000;
		System.out.printf(Locale.US, "%,d%n", i);
	}
		
}
