package com.vti.backend.ex2;

import java.util.Date;

import com.vti.entity.ex2.Account;
import com.vti.entity.ex2.Department;

public class Exercise1 {

		Department department1 = new Department();
		Department department2 = new Department();
		Department department3 = new Department();
		Department department4 = new Department();
		Department department5 = new Department();
		
		Account account1 = new Account();
		Account account2 = new Account();
	
	public Exercise1() {	
		department1.id = 1;
		department1.name = "Marketing";

		department2.id = 2;
		department2.name = "Sale";

		department3.id = 3;
		department3.name = "Bảo vệ";

		department4.id = 4;
		department4.name = "Nhân sự";

		department5.id = 5;
		department5.name = "Kỹ thuật";
		
		account1.id = 1;
		account1.userName = "ducanh";
		account1.fullName = "Nguyễn Đức Anh";
		account1.email = "ducanh123@gmail.com";
		account1.department = department5;
		account1.createDate = new Date("2021/04/22");

		account2.id = 2;
		account2.userName = "duongghuu";
		account2.fullName = "Duong Van Huu";
		account2.email = "duongghuu@gmail.com";
		account2.department = department2;
		account2.createDate = new Date("2020/04/07");
	
	}	
	public void ex1Question1() {
		System.out.println("Câu 1");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
		}
	}
	
	public void ex1Question2() {
		System.out.println("Câu 2");
		if (account2.groups.length == 0) {
			System.out.println("Nhân viên này chưa có group");
		}
		else if (account2.groups.length == 1 ) {
			System.out.println("Group của nhân viên này là " + account2.groups[0]);
		}
		else if (account2.groups.length == 2 ) {
			System.out.println("Group của nhân viên này là " + account2.groups[0] + ", " + account2.groups[1]);
		}
		else if (account2.groups.length == 3 ) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
	}
	
}