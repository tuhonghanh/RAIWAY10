package com.vti.backend.ex2;

import java.util.Random;

public class Exercise3 {
	public void ex3Question1() {
		System.out.println("Question 1: In ngẫu nhiên ra 1 số nguyên");
			Random random = new Random();
			int n = random.nextInt();
			System.out.println("Số ngẫu nhiên: " + n);
		}	
		
		public void ex3Question2() {
			System.out.println("Question 2: In ngẫu nhiên ra 1 số thực");
			Random random = new Random();
			float f = random.nextFloat();
			System.out.println("Số ngẫu nhiên: " + f);
		}

}