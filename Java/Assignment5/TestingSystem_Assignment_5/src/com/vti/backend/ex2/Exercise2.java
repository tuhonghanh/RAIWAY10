package com.vti.backend.ex2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.vti.entity.ex2.Student;

public class Exercise2 {
	Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	private static ArrayList<Student> listStudent;
	
	public void Question1() {
		System.out.println("------------ * * * -------------------------");
		
		int idChucnang = 0;
		while (idChucnang != 5) {
			System.out.println("1. Tạo danh sách sinh viên");
			System.out.println("2. Kêu gọi cả lớp điểm danh");
			System.out.println("3. Gọi nhóm 1 đi học bài");
			System.out.println("4. Gọi nhóm 2 đi dọn vệ sinh");
			System.out.println("5. Thoát");
			System.out.println("Mời bạn nhập vào chức năng: ");
			
		idChucnang = sc.nextInt();
		switch (idChucnang) {	
		case 1:
			taoDanhSach();
			break;
		case 2:
			caLopDiemDanh();
			break;
		case 3:
			goiNhom1DiHocBai();
			break;
		case 4:
			goiNhom2DonVeSinh();
			break;
		case 5:
			System.out.println("Cảm ơn bạn đã sử dụng dịch vụ, xin chào và hẹn gặp lại!!");;
			break;
		default:
			System.out.println("Alarm: Bạn chưa chọn đúng số trên menu");
			break;
		}
	}
}
	
	public static void taoDanhSach() {
	for (int i = 0; i < 10; i++) {
	Student st = new Student("Student " + (i + 1), random.nextInt(3)+1);
	listStudent.add(st);
		}
	}
	
	public static void caLopDiemDanh() {
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}
	
	public static void goiNhom1DiHocBai() {
		System.out.println("Nhóm 1 đi học bài: ");
		for (Student student : listStudent) {
		if (student.getGroup() == 1) {
			student.hocBai();
		}
	}
}
	
	public static void goiNhom2DonVeSinh() {
		System.out.println("Nhóm 2 đi dọn vệ sinh: ");
		for (Student student : listStudent) {
		if (student.getGroup() == 2) {
		    student.donVeSinh();
		}
	}
}	
}
