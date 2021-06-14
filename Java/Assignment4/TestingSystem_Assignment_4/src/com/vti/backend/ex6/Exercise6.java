package com.vti.backend.ex6;

import java.util.Scanner;

import com.vti.entity.ex6.VietnamesePhone;

public class Exercise6 {
	public void ex6Question1() {
		Scanner sc = new Scanner(System.in);
		VietnamesePhone vnPhone = new VietnamesePhone();
		while (true) {

		System.out.println("1. InsertContact");
		System.out.println("2. SearchContact");
		System.out.println("Moi ban lua chon chuc nang:");
	
		int menuChoose = sc.nextInt();
		switch (menuChoose) {
		case 1:
		System.out.println("Nhap vao Contact: ");
		String name = sc.next();
		System.out.println("Nhap vao Phone: ");
		String phone = sc.next();
		vnPhone.insertContact(name, phone);
		break;
		
		case 2:
		System.out.println("Nhap vao ten Contact can tim kiem: ");
		String searchName = sc.next();
		vnPhone.searchContact(searchName);
		break;
		
		default:
		System.out.println("Chua chon dung so tren menu");
		break;
		}
		}
		}
	
}
