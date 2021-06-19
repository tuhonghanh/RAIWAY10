package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Group {
	private int			id;
	private String		name;
	
	public Group(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public static Scanner scanner = new Scanner(System.in); 
	public static List<Account> listAccount = new ArrayList<Account>();
	
	public Group() {
		System.out.println("Mời nhập group id: ");
		id = ScannerUtils.inputInt("Hãy nhập số: ");
		System.out.println("Mời nhập group name: ");
		name =  ScannerUtils.inputString();	
	}
	
	public void IsInputAccount() {
		
		int choose = 0;
		while (choose != 2) {
		System.out.println("1. Thêm account");
		System.out.println("2. Không thêm account");
		System.out.println("Bạn có muốn thêm account không?");
		
			choose = ScannerUtils.inputInt("Bạn phải nhập 1 hoặc 2, mời nhập lại: ");
			switch (choose) {
			case 1:
				inputAccount();
				break;
			case 2: 
				System.out.println("Xin chào và hẹn gặp lại!!!");
				break;
			default:
				System.out.println("Bạn phải nhập 1 hoặc 2, mời nhập lại: ");
			}
		}
	}

	public void inputAccount() {
		
		int idChucNang = 0;
		System.out.println("1. Add account.");
		System.out.println("2. Hiển thị thông tin account.");
		System.out.println("Mời bạn chọn chức năng!");
		
		idChucNang = ScannerUtils.inputInt("Bạn phải nhập 1 hoặc 2, mời nhập lại: ");
		switch(idChucNang) {
		case 1:
			addAccount();
			break;
		case 2:
			hienThiThongTin();
			break;
		default:
			System.out.println("Bạn phải nhập 1 hoặc 2, mời nhập lại: ");
		}
	}
	
	public void addAccount() {
		Account account = new Account();
		System.out.println("Mời bạn nhập id: ");
		int id = ScannerUtils.inputInt("Hãy nhập số: "); 
		
		System.out.println("Mời bạn nhập username: ");
		String userName = ScannerUtils.inputString();
		
		System.out.println("Mời bạn nhập fullname: ");
		String fullName = ScannerUtils.inputString();
		
		System.out.println("Mời bạn nhập email: ");
		String email = ScannerUtils.inputString();
		listAccount.add(account);
	}
	
	public void hienThiThongTin() {
		System.out.println("Thông tin account: ");
		for (Account acc : listAccount) {
			System.out.println(acc.toString());
		}
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
