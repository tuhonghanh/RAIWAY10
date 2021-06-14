package com.vti.backend.ex4;

import com.vti.entity.ex4.Student;

public class Exercise4 {
	public void printStudent() {
		Student st1 = new Student("Hanh", "Ha Noi");
		st1.setScore(3f);
		st1.plusScore(5f);
		Student st2 = new Student("Thinh", "Hai Phong");
		st1.setScore(5f);
		st2.plusScore(7f);
		System.out.println(st1);
		System.out.println(st2);
		
	}
}
