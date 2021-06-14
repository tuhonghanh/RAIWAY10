package com.vti.backend.ex3;

import java.util.Date;

import com.vti.entity.ex3.Account;
import com.vti.entity.ex3.Department;

public class Exercise1 {

		Department department1 = new Department(1, "Marketing");
		Department department2 = new Department(2, "Sale");
		Department department3 = new Department(3, "Bảo vệ");
		
		Account account1 = new Account(1, "ducanh", "Nguyễn Đức Anh", "ducanh123@gmail.com", department2);
		Account account2 = new Account(2, "duongghuu", "Duong Van Huu", "duongghuu@gmail.com", department3);
	
		
	public void ex1Question1() {
		System.out.println("Câu 1");
		if (account2.getDepartment() == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.getDepartment());
		}
	}
	
}