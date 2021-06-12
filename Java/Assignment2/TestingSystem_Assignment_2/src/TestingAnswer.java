import java.util.Scanner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

	public class TestingAnswer {

	Department department1 = new Department();
	Department department2 = new Department();
	Department department3 = new Department();
	Department department4 = new Department();
	Department department5 = new Department();
	Department department6 = new Department();
	Department department7 = new Department();
	Department department8 = new Department();
	Department department9 = new Department();
	Department department10 = new Department();

	Position position1 = new Position();
	Position position2 = new Position();
	Position position3 = new Position();
	Position position4 = new Position();

	Group group1 = new Group();
	Group group2 = new Group();
	Group group3 = new Group();
	Group group4 = new Group();
	Group group5 = new Group();
	Group group6 = new Group();
	Group group7 = new Group();
	Group group8 = new Group();
	Group group9 = new Group();
	Group group10 = new Group();

	CategoryQuestion categoryQuestion1 = new CategoryQuestion();
	CategoryQuestion categoryQuestion2 = new CategoryQuestion();
	CategoryQuestion categoryQuestion3 = new CategoryQuestion();
	CategoryQuestion categoryQuestion4 = new CategoryQuestion();
	CategoryQuestion categoryQuestion5 = new CategoryQuestion();
	CategoryQuestion categoryQuestion6 = new CategoryQuestion();
	CategoryQuestion categoryQuestion7 = new CategoryQuestion();
	CategoryQuestion categoryQuestion8 = new CategoryQuestion();
	CategoryQuestion categoryQuestion9 = new CategoryQuestion();
	CategoryQuestion categoryQuestion10 = new CategoryQuestion();

	TypeQuestion typeQuestion1 = new TypeQuestion();
	TypeQuestion typeQuestion2 = new TypeQuestion();

	Account account1 = new Account();
	Account account2 = new Account();
	Account account3 = new Account();
	Account account4 = new Account();
	Account account5 = new Account();
	Account account6 = new Account();
	Account account7 = new Account();
	Account account8 = new Account();
	Account account9 = new Account();
	Account account10 = new Account();

	Question question1 = new Question();
	Question question2 = new Question();
	Question question3 = new Question();
	Question question4 = new Question();
	Question question5 = new Question();
	Question question6 = new Question();
	Question question7 = new Question();
	Question question8 = new Question();
	Question question9 = new Question();
	Question question10 = new Question();

	Answer answer1 = new Answer();
	Answer answer2 = new Answer();
	Answer answer3 = new Answer();
	Answer answer4 = new Answer();
	Answer answer5 = new Answer();
	Answer answer6 = new Answer();
	Answer answer7 = new Answer();
	Answer answer8 = new Answer();
	Answer answer9 = new Answer();
	Answer answer10 = new Answer();

	Exam exam1 = new Exam();
	Exam exam2 = new Exam();
	Exam exam3 = new Exam();
	Exam exam4 = new Exam();
	Exam exam5 = new Exam();
	Exam exam6 = new Exam();
	Exam exam7 = new Exam();
	Exam exam8 = new Exam();
	Exam exam9 = new Exam();

	public TestingAnswer() {
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

		department6.id = 6;
		department6.name = "Tài chính";

		department7.id = 7;
		department7.name = "Phó giám đốc";

		department8.id = 8;
		department8.name = "Giám đốc";

		department9.id = 9;
		department9.name = "Thư kí";

		department10.id = 10;
		department10.name = "Bán hàng";
// Position		

		position1.id = 1;
		position1.name = "Dev";

		position2.id = 2;
		position2.name = "Test";

		position3.id = 3;
		position3.name = "Scrum Master";

		position4.id = 4;
		position4.name = "PM";
// Group	

		group1.id = 1;
		group1.name = "Testing System";
		group1.creatorID = 5;
		group1.createDate = new Date("2019/03/05");

		group2.id = 2;
		group2.name = "Development";
		group2.creatorID = 1;
		group2.createDate = new Date("2020/03/07");

		group3.id = 3;
		group3.name = "VTI Sale 01";
		group3.creatorID = 2;
		group3.createDate = new Date("2020/03/09");

		group4.id = 4;
		group4.name = "VTI Sale 02";
		group4.creatorID = 3;
		group4.createDate = new Date("2020/03/10");

		group5.id = 5;
		group5.name = "VTI Sale 03";
		group5.creatorID = 4;
		group5.createDate = new Date("2020/03/28");

		group6.id = 6;
		group6.name = "VTI Creator";
		group6.creatorID = 6;
		group6.createDate = new Date("2020/04/06");

		group7.id = 7;
		group7.name = "VTI Marketing 01";
		group7.creatorID = 7;
		group7.createDate = new Date("2020/04/07");

		group8.id = 8;
		group8.name = "Management";
		group8.creatorID = 8;
		group8.createDate = new Date("2020/04/08");

		group9.id = 9;
		group9.name = "Chat with love";
		group9.creatorID = 9;
		group9.createDate = new Date("2020/04/09");

		group10.id = 10;
		group10.name = "Vi Ti Ai";
		group1.creatorID = 10;
		group1.createDate = new Date("2020/04/10");
// CategoryQuestion	

		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		categoryQuestion2.id = 2;
		categoryQuestion2.name = "ASP.NET";

		categoryQuestion3.id = 3;
		categoryQuestion3.name = "ADO.NET";

		categoryQuestion4.id = 4;
		categoryQuestion4.name = "SQL";

		categoryQuestion5.id = 5;
		categoryQuestion5.name = "Postman";

		categoryQuestion6.id = 6;
		categoryQuestion6.name = "Ruby";

		categoryQuestion7.id = 7;
		categoryQuestion7.name = "Python";

		categoryQuestion8.id = 8;
		categoryQuestion8.name = "C++";

		categoryQuestion9.id = 9;
		categoryQuestion9.name = "C Sharp";

		categoryQuestion10.id = 10;
		categoryQuestion10.name = "PHP";
// TypeQuestion	

		typeQuestion1.id = 1;
		typeQuestion1.name = "Essay";

		typeQuestion2.id = 2;
		typeQuestion2.name = "Multiple/Choice";
// account		
		account1.id = 1;
		account1.userName = "ducanh";
		account1.fullName = "Nguyễn Đức Anh";
		account1.email = "ducanh123@gmail.com";
		account1.department = department5;
		account1.position = position2;
		account1.createDate = new Date("2021/04/22");
		Group[] accountGroup1 = { group1 };
		account1.groups = accountGroup1;

		account2.id = 2;
		account2.userName = "duongghuu";
		account2.fullName = "Duong Van Huu";
		account2.email = "duongghuu@gmail.com";
		account2.department = department7;
		account2.position = position2;
		account2.createDate = new Date("2020/04/07");
		Group[] accountGroup2 = { group1 };
		account2.groups = accountGroup2;

		account3.id = 3;
		account3.userName = "dangblack";
		account3.fullName = "Nguyễn hải Đăng";
		account3.email = "haidang29productions@gmail.com";
		account3.department = department5;
		account3.position = position1;
		account3.createDate = new Date("2020/03/05");
		Group[] accountGroup3 = { group1, group3 };
		account3.groups = accountGroup3;

		account4.id = 4;
		account4.userName = "quanganh";
		account4.fullName = "Nguyen Chien Thang2";
		account4.email = "account1@gmail.com";
		account4.department = department1;
		account4.position = position2;
		account4.createDate = new Date("2020/03/05");
		Group[] accountGroup4 = { group3 };
		account4.groups = accountGroup4;

		account5.id = 5;
		account5.userName = "vanchien";
		account5.fullName = "Nguyễn Bá Lộc";
		account5.email = "loc.nguyenba@gmail.com";
		account5.department = department2;
		account5.position = position3;
		account5.createDate = new Date("2020/03/07");
		Group[] accountGroup5 = { group4 };
		account5.groups = accountGroup5;

		account6.id = 6;
		account6.userName = "cocoduongqua";
		account6.fullName = "Duong Do";
		account6.email = "account3@gmail.com";
		account6.department = department3;
		account6.position = position4;
		account6.createDate = new Date("2020/03/06");
		Group[] accountGroup6 = { group1 };
		account6.groups = accountGroup6;

		account7.id = 7;
		account7.userName = "doccocaubai";
		account7.fullName = "Nguyen Chien Thang1";
		account7.email = "account4@gmail.com";
		account7.department = department4;
		account7.position = position4;
		account7.createDate = new Date("2020/03/10");
		Group[] accountGroup7 = { group3 };
		account7.groups = accountGroup7;

		account8.id = 8;
		account8.userName = "khabanh";
		account8.fullName = "Ngo Ba Kha";
		account8.email = "dapphatchetngay@gmail.com";
		account8.department = department6;
		account8.position = position3;
		account8.createDate = new Date("2020/04/05");
		Group[] accountGroup8 = {};
		account8.groups = accountGroup8;

		account9.id = 9;
		account9.userName = "huanhoahong";
		account9.fullName = "Bui Xuan Huan";
		account9.email = "songcodaoly@gmail.com";
		account9.department = department7;
		account9.position = position2;
		account9.createDate = new Date("2020/03/05");
		Group[] accountGroup9 = { group10 };
		account9.groups = accountGroup9;

		account10.id = 10;
		account10.userName = "tungnui";
		account10.fullName = "Nguyen Thanh Tung";
		account10.email = "sontungmtp@gmail.com";
		account10.department = department8;
		account10.position = position1;
		account10.createDate = new Date("2020/04/07");
		Group[] accountGroup10 = { group9 };
		account10.groups = accountGroup10;
// Question

		question1.id = 1;
		question1.content = "Câu hỏi 01";
		question1.category = categoryQuestion9;
		question1.type = typeQuestion1;
		question1.creatorID = 3;
		question1.createDate = new Date("2020/04/23");

		question2.id = 2;
		question2.content = "Câu hỏi 02";
		question2.category = categoryQuestion9;
		question2.type = typeQuestion1;
		question2.creatorID = 3;
		question2.createDate = new Date("2020/04/23");

		question3.id = 3;
		question3.content = "Hỏi về C#";
		question3.category = categoryQuestion9;
		question3.type = typeQuestion2;
		question3.creatorID = 3;
		question3.createDate = new Date("2020/04/06");

		question4.id = 4;
		question4.content = "Hỏi về Ruby";
		question4.category = categoryQuestion6;
		question4.type = typeQuestion1;
		question4.creatorID = 4;
		question4.createDate = new Date("2020/04/06");

		question5.id = 5;
		question5.content = "Hỏi về Postman";
		question5.category = categoryQuestion5;
		question5.type = typeQuestion1;
		question5.creatorID = 5;
		question5.createDate = new Date("2020/04/06");

		question6.id = 6;
		question6.content = "Hỏi về ADO.NET";
		question6.category = categoryQuestion3;
		question6.type = typeQuestion2;
		question6.creatorID = 6;
		question6.createDate = new Date("2020/04/06");

		question7.id = 7;
		question7.content = "Hỏi về ASP.NET";
		question7.category = categoryQuestion2;
		question7.type = typeQuestion1;
		question7.creatorID = 7;
		question7.createDate = new Date("2020/04/06");

		question8.id = 8;
		question8.content = "Hỏi về C++";
		question8.category = categoryQuestion8;
		question8.type = typeQuestion1;
		question8.creatorID = 8;
		question8.createDate = new Date("2020/04/07");

		question9.id = 9;
		question9.content = "Hỏi về SQL";
		question9.category = categoryQuestion4;
		question9.type = typeQuestion2;
		question9.creatorID = 9;
		question9.createDate = new Date("2020/04/07");

		question10.id = 10;
		question10.content = "Câu hỏi 10";
		question10.category = categoryQuestion5;
		question10.type = typeQuestion2;
		question10.creatorID = 5;
		question10.createDate = new Date("2020/04/23");
// Answer
		answer1.id = 1;
		answer1.content = "Trả lời 01";
		answer1.question = question3;
		answer1.isCorrect = false;

		answer2.id = 2;
		answer2.content = "Trả lời 02";
		answer2.question = question4;
		answer2.isCorrect = true;

		answer3.id = 3;
		answer3.content = "Trả lời 03";
		answer3.question = question4;
		answer3.isCorrect = false;

		answer4.id = 4;
		answer4.content = "Trả lời 04";
		answer4.question = question5;
		answer4.isCorrect = true;

		answer5.id = 5;
		answer5.content = "Trả lời 05";
		answer5.question = question4;
		answer5.isCorrect = true;

		answer6.id = 6;
		answer6.content = "Trả lời 06";
		answer6.question = question3;
		answer6.isCorrect = true;

		answer7.id = 7;
		answer7.content = "Trả lời 07";
		answer7.question = question4;
		answer7.isCorrect = false;

		answer8.id = 8;
		answer8.content = "Trả lời 08";
		answer8.question = question8;
		answer8.isCorrect = false;

		answer9.id = 9;
		answer9.content = "Trả lời 09";
		answer9.question = question9;
		answer9.isCorrect = true;

		answer10.id = 10;
		answer10.content = "Trả lời 10";
		answer10.question = question10;
		answer10.isCorrect = true;
// Exam
		exam1.id = 1;
		exam1.code = "VTIQ001";
		exam1.title = "Đề thi 01";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.creatorID = 3;
		exam1.createDate = new Date("2020/04/07");

		Question[] exQuestions1 = { question5 };
		exam1.questions = exQuestions1;

		exam2.id = 2;
		exam2.code = "VTIQ002";
		exam2.title = "Đề thi 02";
		exam2.category = categoryQuestion2;
		exam2.duration = 60;
		exam2.creatorID = 3;
		exam2.createDate = new Date("2020/04/07");
		Question[] exQuestions2 = { question10 };
		exam2.questions = exQuestions2;

		exam3.id = 3;
		exam3.code = "VTIQ003";
		exam3.title = "Đề thi 03";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.creatorID = 3;
		exam3.createDate = new Date("2020/04/07");
		Question[] exQuestions3 = { question4 };
		exam3.questions = exQuestions3;

		exam4.id = 4;
		exam4.code = "VTIQ004";
		exam4.title = "Đề thi Java";
		exam4.category = categoryQuestion6;
		exam4.duration = 60;
		exam4.creatorID = 3;
		exam4.createDate = new Date("2020/04/06");
		Question[] exQuestions4 = { question3 };
		exam4.questions = exQuestions4;

		exam5.id = 5;
		exam5.code = "VTIQ005";
		exam5.title = "Đề thi Ruby";
		exam5.category = categoryQuestion5;
		exam5.duration = 120;
		exam5.creatorID = 4;
		exam5.createDate = new Date("2020/04/10");
		Question[] exQuestions5 = { question7 };
		exam5.questions = exQuestions5;

		exam6.id = 6;
		exam6.code = "VTIQ006";
		exam6.title = "Đề thi Postman";
		exam6.category = categoryQuestion3;
		exam6.duration = 60;
		exam6.creatorID = 6;
		exam6.createDate = new Date("2020/04/05");
		Question[] exQuestions6 = { question10 };
		exam6.questions = exQuestions6;

		exam7.id = 7;
		exam7.code = "VTIQ007";
		exam7.title = "Đề thi SQL";
		exam7.category = categoryQuestion2;
		exam7.duration = 60;
		exam7.creatorID = 7;
		exam7.createDate = new Date("2020/04/05");
		Question[] exQuestions7 = { question2 };
		exam7.questions = exQuestions7;

		exam8.id = 8;
		exam8.code = "VTIQ008";
		exam8.title = "Đề thi Python";
		exam8.category = categoryQuestion8;
		exam8.duration = 60;
		exam8.creatorID = 8;
		exam8.createDate = new Date("2020/04/07");
		Question[] exQuestions8 = { question10 };
		exam8.questions = exQuestions8;
		
		Account[] accountOfGroup1 = {account1, account2};
		group1.accounts = accountOfGroup1;

		exam9.id = 9;
		exam9.code = "VTIQ009";
		exam9.title = "Đề thi ASP.NET";
		exam9.category = categoryQuestion7;
		exam9.duration = 90;
		exam9.creatorID = 10;
		exam9.createDate = new Date("2020/04/11");
		Question[] exQuestions9 = { question9 };
		exam9.questions = exQuestions9;

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		exam1.createDate = getDateToString("09/11/2017");
		exam2.createDate = getDateToString("09/11/2017");
		exam3.createDate = getDateToString("09/11/2017");
		exam4.createDate = getDateToString("09/11/2017");
		exam5.createDate = getDateToString("09/11/2017");
		exam6.createDate = getDateToString("09/11/2017");
		exam7.createDate = getDateToString("09/11/2017");
		exam8.createDate = getDateToString("09/11/2017");
		exam9.createDate = getDateToString("09/11/2017");
	}

	public Date getDateToString(String date) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			return formatter.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Date();
		}
	}
	//EX1
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
	
	public void ex1Question3() {
		System.out.println("Câu 3");
		System.out.println (account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là : " + account2.department.name );
	}
	
	public void ex1Question4() {
		System.out.println("Câu 4");
		System.out.println (account1.position.name == "Dev" ? "Đây là Developer"
				: "Người này không phải là Developer");
	}
	
	public void ex1Question5() {
		System.out.println("Câu 5");
		int x = group1.accounts.length;
		switch (x) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
		}
	}
	
	public void ex1Question6() {
		System.out.println("Câu 6");
		int y = account2.groups.length;
		switch (y) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là " + account2.groups[0]);
			break;
		case 2:
			System.out.println("Group của nhân viên này là " + account2.groups[0] + ", " + account2.groups[1]);
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}	
	}
	
	public void ex1Question7() {
		System.out.println("Câu 7");
		String z = account1.position.name;
		switch (z) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");	
		}
	}

	public void ex1Question8() {
		System.out.println("Câu 8");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (Account account : accounts) {
			System.out.println("Account " + account.id);
			System.out.println("Email: " + account.email);
			System.out.println("FullName: " + account.fullName);
			System.out.println("Department Name: " + account.department.name);
		}
	}
	
	public void ex1Question9() {
		System.out.println("Câu 9");
		Department[] departments = {department1, department2, department3};	
		for (Department department : departments) {
			System.out.println("ID " + department.id);
			System.out.println("Name: " + department.name);
		}
	}
	
	public void ex1Question10() {
		System.out.println("Câu 10");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là : ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
		}
	}

	public void ex1Question11() {
		System.out.println("Câu 11");
		Department[] departments = {department1, department2, department3};	
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là : ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}	
	}	
	
	public void ex1Question12() {
		System.out.println("Câu 12");
		Department[] departments = {department1, department2, department3};
		for (int i = 0; i  < 2 ; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là : ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}	
	}		
	
	public void ex1Question13() {
		System.out.println("Câu 13");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < accounts.length; i++) {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là : ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullName);
				System.out.println("Department: " + accounts[i].department.name);
			}
		}
		}
	
	public void ex1Question14() {
		System.out.println("Câu 14");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].id < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là : ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullName);
				System.out.println("Department: " + accounts[i].department.name);
			}
		}		
		}
		
	public void ex1Question15() {
		System.out.println("Câu 15");
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}
	}
	
	public void ex1Question16_10() {
		System.out.println("Câu 16_10");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		while (i < accounts.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		}
		}
	
	public void ex1Question16_11() {
		System.out.println("Câu 16_11");
		Department[] departments = {department1, department2, department3};
		int i = 0;
		while (i < departments.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là : ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}	
		}
	
	public void ex1Question16_12() {
		System.out.println("Câu 16_12");
		Department[] departments = {department1, department2, department3};
		int i = 0;
		while (i < 2) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là : ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}	
	    }		
	
	
	public void ex1Question16_13() {
		System.out.println("Câu 16_13");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		while ( i < accounts.length) {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là : ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);	
		}
			i++;
		}
     	}
	
	public void ex1Question16_14() {
		System.out.println("Câu 16_14");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		while ( i < accounts.length) {
			if (accounts[i].id < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là : ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);
				i++;
		}
		}
		}
	
	public void ex1Question16_15() {
		System.out.println("Câu 16_15");
		int i = 2;
		while ( i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
	    }
	
	public void ex1Question17_10() {
		System.out.println("Câu 17_10");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		do {
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		} while (i < accounts.length);
	    }
		
	
	public void ex1Question17_11() {
		System.out.println("Câu 17_11");	
		Department[] departments = {department1, department2, department3};
		int i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là : ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		} while (i < departments.length);
		}

	public void ex1Question17_12() {
		System.out.println("Câu 17_12");
		Department[] departments = {department1, department2, department3};
		int i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là : ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		} while (i < 2);
	    }
	
	public void ex1Question17_13() {
		System.out.println("Câu 17_13");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		do {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là : ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);
			}	
				i++;
			} while ( i < accounts.length);
	        }


	public void ex1Question17_14() {
		System.out.println("Câu 17_14");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		do {
			if (accounts[i].id == 4) {
				break;
			} else {
				System.out.println("Thông tin account thứ " + (i + 1) + " là : ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);
		    }	
				i++;
		} while ( i < accounts.length);
	    }

	
	public void ex1Question17_15() {
		System.out.println("Câu 17_15");
		int i = 2;
		do {
			System.out.println(i);
			i = i + 2;
		} while ( i <= 20);
	    }
	
	//EX2
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
	
	public void ex2Question3() {	
		System.out.println("Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau");
		float y = 5.567098f;
		System.out.printf("%5.4f%n", y);
	}
	
	public void ex2Question4() {
		System.out.println("Question 4:");
		String s = "Nguyễn Văn A";
		System.out.printf("Tên tôi là \"" + s + "\" và tôi đang độc thân" + "\n");
	}
	
	public void ex2Question5() {
		System.out.println("Question 5:");
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	}
	
	//EX3
	public void ex3Question1() {
		System.out.println("Question 1:");
		Locale locale = new Locale("vn", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		String date = dateformat.format(exam1.createDate);
		System.out.println("Exam ID: " + exam1.id);
		System.out.println("Exam code: " + exam1.code);
		System.out.println("Category: " + exam1.category.name);
		System.out.println("Create date: " + date);
	}
	
	public void ex3Question2() {
		System.out.println("Question 2:");
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Exam[] exams = { exam1, exam2 };
		for (Exam exam : exams) {
		String date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.id + ": " + date);
		}
	}	
	public void ex3Question3() {
		System.out.println("Question 3:");
		String pattern = "yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Exam[] exams = { exam1, exam2 };
		for (Exam exam : exams) {
		String date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.id + ": " + date);
		}
	}	
		
	public void ex3Question4() {
		System.out.println("Question 4:");
		String pattern = "yyyy-MM";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Exam[] exams = { exam1, exam2 };
		for (Exam exam : exams) {
		String date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.id + ": " + date);
		}
	}	
	
	public void ex3Question5() {
		System.out.println("Question 5:");
		String pattern = "MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Exam[] exams = { exam1, exam2 };
		for (Exam exam : exams) {
		String date = simpleDateFormat.format(exam.createDate);
		System.out.println(exam.id + ": " + date);
		}
	}	
	
	//EX4
	public void ex4Question1() {
	System.out.println("Question 1: In ngẫu nhiên ra 1 số nguyên");
		Random random = new Random();
		int n = random.nextInt();
		System.out.println("Số ngẫu nhiên: " + n);
	}	
	
	public void ex4Question2() {
		System.out.println("Question 2: In ngẫu nhiên ra 1 số thực");
		Random random = new Random();
		float f = random.nextFloat();
		System.out.println("Số ngẫu nhiên: " + f);
	}
	
	public void ex4Question3() {
		System.out.println("Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn");
		String[] name = { "Hanh", "Hung", "Hien" };
		Random random = new Random();
		int i = random.nextInt(name.length);
		System.out.println("Tên ngẫu nhiên 1 bạn trong lớp: " + name[i]);
	}
	
	public void ex4Question4() {
		System.out.println("Question 4:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995");
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay(); 
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay(); 
		Random random = new Random();
		long randomInt = minDay + random.nextInt(maxDay - minDay); 
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
	}
	
	public void ex4Question5() {
		System.out.println("Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây");
		int now = (int) LocalDate.now().toEpochDay();
		Random random = new Random();
		int randomDate = now - random.nextInt(365);
		LocalDate randomDay = LocalDate.ofEpochDay(randomDate);
		System.out.println(randomDay);
	}
	
	public void ex4Question6() {
		System.out.println("Question 6: Lấy ngẫu nhiên 1 ngày trong quá khứ");
		int maxDay1 = (int) LocalDate.now().toEpochDay();
		Random random = new Random();
		long randomDate = random.nextInt(maxDay1);
		LocalDate randomDay = LocalDate.ofEpochDay(randomDate);
		System.out.println(randomDay);
	}
	
	public void ex4Question7() {
		System.out.println("Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số");
		Random random = new Random();
		int z = random.nextInt(999 - 100 + 1) + 100; 
		System.out.println(z);
	}
	
	//EX5
	public void ex5Question1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình");
		System.out.println("Mời bạn nhập vào 3 số nguyên");
		System.out.println("Nhập vào số 1: ");
		int a = sc.nextInt();
		System.out.println("Nhập vào số 2: ");
		int b = sc.nextInt();
		System.out.println("Nhập vào số 3: ");
		int c = sc.nextInt();
		System.out.println("Bạn vừa nhập vào các số: " + a + " " + b + " " + c);
	}
	
	public void ex5Question2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình");
		System.out.println("Mời bạn nhập vào 2 số thực");
		System.out.println("Nhập vào số 1: ");
		float f1 = sc.nextFloat();
		System.out.println("Nhập vào số 2: ");
		float f2 = sc.nextFloat();
		System.out.println("Bạn vừa nhập vào các số: " + f1 + " " + f2);
	}
	
	public void ex5Question3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 3: Viết lệnh cho phép người dùng nhập họ và tên");
		System.out.println("Mời bạn nhập vào Họ: ");
		String s1 = sc.next();
		System.out.println("Mời bạn nhập vào Tên: ");
		String s2 = sc.next();
		System.out.println("Họ tên của bạn là:" + s1 + " " + s2);
	}
	
	public void ex5Question4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ");
		System.out.println("Mời bạn nhập vào ngày sinh: ");
	    int day = sc.nextInt();
	    System.out.println("Mời bạn nhập vào tháng sinh: ");
	    int month = sc.nextInt();
	    System.out.println("Mời bạn nhập vào năm sinh: ");
	    int year = sc.nextInt();   
	    LocalDate dateBirth = LocalDate.of(year , month, day );
	    System.out.println("Ngày sinh của bạn là: " + dateBirth);
	}
	
	public void ex5Question5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 5: Viết lệnh cho phép người dùng tạo account");
		System.out.println("Mời bạn nhập thông tin account: ");
		System.out.println("Nhập ID: ");
		int id = sc.nextInt();
		System.out.println("Nhập email: ");
		String email = sc.next();
		System.out.println("Nhập userName: ");
		String userName = sc.next();
		System.out.println("Nhập fullName: ");
		String fullName = sc.next();
		System.out.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");
		int posNo = sc.nextInt();
		Position pos = new Position();
		switch (posNo) {
		case 1:
			Position pos1 = new Position();
			pos1.name = "Position.Dev";
			pos = pos1;
		case 2:
			Position pos2 = new Position();
			pos2.name = "Position.Test";
			pos = pos2;
		case 3:
			Position pos3 = new Position();
			pos3.name = "Position.Scrum_Master";
			pos = pos3;
		case 4:
			Position pos4 = new Position();
			pos4.name = "Position.PM";
			pos = pos4;
		}
		System.out.println("Thông tin account vừa tạo:" + "\n" + "ID: " + id + "\n" +
				"Email: " + email + "\n" + "UserName: " + userName + "\n" + "FullName: " + fullName + "\n" +
				"Position: " + pos.name );
		}
	
	public void ex5Question6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 6: Viết lệnh cho phép người dùng tạo department");
		System.out.println("Mời bạn nhập thông tin account: ");
		System.out.println("Nhập ID: ");
		int id = sc.nextInt();
		System.out.println("Nhập department name: ");
		String name = sc.next();
		System.out.println("Thông tin department vừa tạo:" + "\n" + "Department ID: " + id + "\n" + "Department name: " + name);
	}
	
	public void ex5Question7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 7:  Nhập số chẵn từ console");
		System.out.println("Hãy nhập vào 1 số chẵn: ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Bạn vừa nhập:" + a);
		} else {
			System.out.println("Nhập sai, đây không phải là số chẵn");
		}
	}
	
	public void ex5Question8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 8: Viết chương trình thực hiện theo flow");
		System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
		System.out.println("Nhập 1 để tạo account, nhập 2 để tạo deparment: ");
		int a = sc.nextInt();
		if(a == 1) {
			ex5Question5();
		}
		else if (a == 2) {
			ex5Question6();
		} 
		else {
			System.out.println("Mời bạn nhập lại:");
		}
	}
	
	public void ex5Question9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 9: Viết method cho phép người dùng thêm group vào account");
		Account[] accounts = {account1, account2, account3};
		Group[] groups = {group1, group2, group3, group4};
		//Bước 1
		System.out.println("Username của các user: ");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println( accounts[i].userName);
		}
		// Bước 2
		System.out.println("Nhập vào UserName của account: ");
		String userName = sc.next();
		// Bước 3
		System.out.println("Tên các group: ");
		for (int i = 0; i < groups.length; i++) {
			System.out.println(groups[i].name);
		}	
		//Bước 4
		System.out.println("Nhập vào tên Group: ");
		String groupName = sc.next();
	}
	
	//EX6
	public void ex6Question1() {
		System.out.println("Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\n");
			}
		}
	}
	
	public void ex6Question2() {
		System.out.println("Question 2: Tạo method để in thông tin các account");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (Account account : accounts) {
			System.out.println("Account " + account.id);
			System.out.println("Email: " + account.email);
			System.out.println("FullName: " + account.fullName);
			System.out.println("Department Name: " + account.department.name);
			System.out.println("\n");
		}
	}
	
	public void ex6Question3() {
		System.out.println("Question 3:Tạo method để in ra các số nguyên dương nhỏ hơn 10");
		for (int i = 0; i < 10; i++) {
				System.out.print(i);
		}	
	}
		
//		// 1 - viết hàm tính chu vi hình chữ nhật	
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Moi ban nhap vao chieu rong: ");
//			int chieuRong = sc.nextInt();
//			System.out.print("Moi ban nhap vao chieu dai: ");
//			int chieuDai = sc.nextInt();
//			int chuvi = chuViHinhChuNhat(chieuRong, chieuDai);
//			System.out.println("Chu vi hinh chu nhat co chieu rong: " + chieuRong + " va chieu dai: " + chieuDai + " là: " + chuvi);
//		} 
//		
//		public static int chuViHinhChuNhat (int chieuRong, int chieuDai) {
//			    int chuvi = (chieuRong + chieuDai)*2;
//			    return chuvi;
//			}   
//		
//		// 2 - viết hàm tính diện tích hình vuông.
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);	
//			System.out.print("Moi ban nhap vao chieu dai canh: ");
//			int canh = sc.nextInt();
//			int dientich = dienTichHinhVuong(canh);
//			System.out.println("Dien tich hinh vuong co canh: " + canh + " là: " + dientich);
//		}
//		 public static int dienTichHinhVuong (int canh) {
//		    	int dientich = canh*canh;
//		    	return dientich;
//		 }
//
//		// 3 - Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200
//		public static void main(String[] args) {
//			System.out.println("Các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200 là: ");
//			for (int i = 10; i <= 200 ; i++) {
//			   if (i % 7 == 0 && i % 5 != 0) {
//				   System.out.println(i);
//			   }  
//			 }  
//		} 
//
//		// 4 - Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in); 
//		    System.out.println("Nhập vào số nguyên dương bất kỳ: ");
//		    int n, soDu, tong = 0;
//		    n = sc.nextInt();     
//		    while (n > 0) {
//		        soDu = n % 10;
//		        n = n / 10;
//		        tong += soDu;
//		    }  
//		    System.out.println("Tổng các chữ số = " + tong);
//		}
//		
//	    //5 - Viết chương trình giải phương trình bậc 2
//		  Giải phương trình bậc 2: ax2 + bx + c = 0
//		  param a: hệ số bậc 2
//		  param b: hệ số bậc 1
//		  param c: số hạng tự do
//		 public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in); 
//		    System.out.print("Nhập hệ số bậc 2, a = ");
//		    float a = sc.nextFloat();
//		    System.out.print("Nhập hệ số bậc 1, b = ");
//		    float b = sc.nextFloat();
//		    System.out.print("Nhập hằng số tự do, c = ");
//		    float c = sc.nextFloat();
//		    giaiPTBac2(a, b, c);
//		    }
//	
//		  public static void giaiPTBac2(float a, float b, float c) {
//		        // kiểm tra các hệ số
//		        if (a == 0) {
//		            if (b == 0) {
//		                System.out.println("Phương trình vô nghiệm");
//		            } else {
//		                System.out.println("Phương trình có một nghiệm: "  + "x = " + (-c / b));
//		            }
//		            return;
//		        }
//		        // tính delta
//		        float delta = b*b - 4*a*c;
//		        float x1;
//		        float x2;
//		        // tính nghiệm
//		        if (delta > 0) {
//		            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
//		            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
//		            System.out.println("Phương trình có 2 nghiệm là: "
//		                    + "x1 = " + x1 + " và x2 = " + x2);
//		        } else if (delta == 0) {
//		            x1 = (-b / (2 * a));
//		            System.out.println("Phương trình có nghiệm kép: "
//		                    + "x1 = x2 = " + x1);
//		        } else {
//		            System.out.println("Phương trình vô nghiệm");
//		        }
//		    }
//		
//		//6 - Viết chương trình đăng nhập tài khoản, cho phép nhập vào username và password, nếu nhập đúng thông báo đăng nhập thành công
//		  public static void main (String[] args) {
//			  String username = "hanhth";
//			  String password = "Nguyen0102";
//			  Scanner sc = new Scanner(System.in); 
//			  System.out.print("Mời nhập username: ");
//			  String userName = sc.next();
//			  System.out.print("Mời nhập password: ");
//			  String passWord = sc.next();
//			  if (userName.equals(username) && passWord.equals(password)) {
//				  System.out.print("Đăng nhập thành công!");
//			  } else {
//				  System.out.print("Đăng nhập không thành công! Mời nhập lại!");
//			  }
			  
//		  }
}  	