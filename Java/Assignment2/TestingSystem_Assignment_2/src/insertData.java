import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class insertData {

	public static void main(String[] args) {
		// Department	
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Marketing";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Sale";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Bảo vệ";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Nhân sự";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Kỹ thuật";

		Department department6 = new Department();
		department6.id = 6;
		department6.name = "Tài chính";

		Department department7 = new Department();
		department7.id = 7;
		department7.name = "Phó giám đốc";

		Department department8 = new Department();
		department8.id = 8;
		department8.name = "Giám đốc";

		Department department9 = new Department();
		department9.id = 9;
		department9.name = "Thư kí";

		Department department10 = new Department();
		department10.id = 10;
		department10.name = "Bán hàng";
// Position		
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Dev";

		Position position2 = new Position();
		position2.id = 2;
		position2.name = "Test";

		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Scrum Master";

		Position position4 = new Position();
		position4.id = 4;
		position4.name = "PM";
// Group	
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		group1.creatorID = 5;
		group1.createDate = new Date("2019/03/05");

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		group2.creatorID = 1;
		group2.createDate = new Date("2020/03/07");

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "VTI Sale 01";
		group3.creatorID = 2;
		group3.createDate = new Date("2020/03/09");

		Group group4 = new Group();
		group4.id = 4;
		group4.name = "VTI Sale 02";
		group4.creatorID = 3;
		group4.createDate = new Date("2020/03/10");

		Group group5 = new Group();
		group5.id = 5;
		group5.name = "VTI Sale 03";
		group5.creatorID = 4;
		group5.createDate = new Date("2020/03/28");

		Group group6 = new Group();
		group6.id = 6;
		group6.name = "VTI Creator";
		group6.creatorID = 6;
		group6.createDate = new Date("2020/04/06");

		Group group7 = new Group();
		group7.id = 7;
		group7.name = "VTI Marketing 01";
		group7.creatorID = 7;
		group7.createDate = new Date("2020/04/07");

		Group group8 = new Group();
		group8.id = 8;
		group8.name = "Management";
		group8.creatorID = 8;
		group8.createDate = new Date("2020/04/08");

		Group group9 = new Group();
		group9.id = 9;
		group9.name = "Chat with love";
		group9.creatorID = 9;
		group9.createDate = new Date("2020/04/09");

		Group group10 = new Group();
		group10.id = 10;
		group10.name = "Vi Ti Ai";
		group1.creatorID = 10;
		group1.createDate = new Date("2020/04/10");
// CategoryQuestion	
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "ASP.NET";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = "ADO.NET";

		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = "SQL";

		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = "Postman";

		CategoryQuestion categoryQuestion6 = new CategoryQuestion();
		categoryQuestion6.id = 6;
		categoryQuestion6.name = "Ruby";

		CategoryQuestion categoryQuestion7 = new CategoryQuestion();
		categoryQuestion7.id = 7;
		categoryQuestion7.name = "Python";

		CategoryQuestion categoryQuestion8 = new CategoryQuestion();
		categoryQuestion8.id = 8;
		categoryQuestion8.name = "C++";

		CategoryQuestion categoryQuestion9 = new CategoryQuestion();
		categoryQuestion9.id = 9;
		categoryQuestion9.name = "C Sharp";

		CategoryQuestion categoryQuestion10 = new CategoryQuestion();
		categoryQuestion10.id = 10;
		categoryQuestion10.name = "PHP";
// TypeQuestion	
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = "Essay";

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = "Multiple/Choice";
// account		
		Account account1 = new Account();
		account1.id = 1;
		account1.userName = "ducanh";
		account1.fullName = "Nguyễn Đức Anh";
		account1.email = "ducanh123@gmail.com";
		account1.department = department5;
		account1.position = position2;
		account1.createDate = new Date("2021/04/22");
		Group[] accountGroup1 = { group1 };
		account1.groups = accountGroup1;

		Account account2 = new Account();
		account2.id = 2;
		account2.userName = "duongghuu";
		account2.fullName = "Duong Van Huu";
		account2.email = "duongghuu@gmail.com";
		account2.department = department7;
		account2.position = position2;
		account2.createDate = new Date(2020 / 04 / 07);
		Group[] accountGroup2 = { group1 };
		account2.groups = accountGroup2;

		Account account3 = new Account();
		account3.id = 3;
		account3.userName = "dangblack";
		account3.fullName = "Nguyễn hải Đăng";
		account3.email = "haidang29productions@gmail.com";
		account3.department = department5;
		account3.position = position1;
		account3.createDate = new Date(2020 / 03 / 05);
		Group[] accountGroup3 = { group1, group3 };
		account3.groups = accountGroup3;

		Account account4 = new Account();
		account4.id = 4;
		account4.userName = "quanganh";
		account4.fullName = "Nguyen Chien Thang2";
		account4.email = "account1@gmail.com";
		account4.department = department1;
		account4.position = position2;
		account4.createDate = new Date(2020 / 03 / 05);
		Group[] accountGroup4 = { group3 };
		account4.groups = accountGroup4;

		Account account5 = new Account();
		account5.id = 5;
		account5.userName = "vanchien";
		account5.fullName = "Nguyễn Bá Lộc";
		account5.email = "loc.nguyenba@gmail.com";
		account5.department = department2;
		account5.position = position3;
		account5.createDate = new Date(2020 / 03 / 07);
		Group[] accountGroup5 = { group4 };
		account5.groups = accountGroup5;

		Account account6 = new Account();
		account6.id = 6;
		account6.userName = "cocoduongqua";
		account6.fullName = "Duong Do";
		account6.email = "account3@gmail.com";
		account6.department = department3;
		account6.position = position4;
		account6.createDate = new Date(2020 / 03 / 06);
		Group[] accountGroup6 = { group1 };
		account6.groups = accountGroup6;

		Account account7 = new Account();
		account7.id = 7;
		account7.userName = "doccocaubai";
		account7.fullName = "Nguyen Chien Thang1";
		account7.email = "account4@gmail.com";
		account7.department = department4;
		account7.position = position4;
		account7.createDate = new Date(2020 / 03 / 10);
		Group[] accountGroup7 = { group3 };
		account7.groups = accountGroup7;

		Account account8 = new Account();
		account8.id = 8;
		account8.userName = "khabanh";
		account8.fullName = "Ngo Ba Kha";
		account8.email = "dapphatchetngay@gmail.com";
		account8.department = department6;
		account8.position = position3;
		account8.createDate = new Date(2020 / 04 / 05);
		Group[] accountGroup8 = {};
		account8.groups = accountGroup8;

		Account account9 = new Account();
		account9.id = 9;
		account9.userName = "huanhoahong";
		account9.fullName = "Bui Xuan Huan";
		account9.email = "songcodaoly@gmail.com";
		account9.department = department7;
		account9.position = position2;
		account9.createDate = new Date(2020 / 03 / 05);
		Group[] accountGroup9 = { group10 };
		account9.groups = accountGroup9;

		Account account10 = new Account();
		account10.id = 10;
		account10.userName = "tungnui";
		account10.fullName = "Nguyen Thanh Tung";
		account10.email = "sontungmtp@gmail.com";
		account10.department = department8;
		account10.position = position1;
		account10.createDate = new Date(2020 / 04 / 07);
		Group[] accountGroup10 = { group9 };
		account10.groups = accountGroup10;
// Question
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Câu hỏi 01";
		question1.category = categoryQuestion9;
		question1.type = typeQuestion1;
		question1.creatorID = 3;
		question1.createDate = new Date(2020 / 04 / 23);

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Câu hỏi 02";
		question2.category = categoryQuestion9;
		question2.type = typeQuestion1;
		question2.creatorID = 3;
		question2.createDate = new Date(2020 / 04 / 23);

		Question question3 = new Question();
		question3.id = 3;
		question3.content = "Hỏi về C#";
		question3.category = categoryQuestion9;
		question3.type = typeQuestion2;
		question3.creatorID = 3;
		question3.createDate = new Date(2020 / 04 / 06);

		Question question4 = new Question();
		question4.id = 4;
		question4.content = "Hỏi về Ruby";
		question4.category = categoryQuestion6;
		question4.type = typeQuestion1;
		question4.creatorID = 4;
		question4.createDate = new Date(2020 / 04 / 06);

		Question question5 = new Question();
		question5.id = 5;
		question5.content = "Hỏi về Postman";
		question5.category = categoryQuestion5;
		question5.type = typeQuestion1;
		question5.creatorID = 5;
		question5.createDate = new Date(2020 / 04 / 06);

		Question question6 = new Question();
		question6.id = 6;
		question6.content = "Hỏi về ADO.NET";
		question6.category = categoryQuestion3;
		question6.type = typeQuestion2;
		question6.creatorID = 6;
		question6.createDate = new Date(2020 / 04 / 06);

		Question question7 = new Question();
		question7.id = 7;
		question7.content = "Hỏi về ASP.NET";
		question7.category = categoryQuestion2;
		question7.type = typeQuestion1;
		question7.creatorID = 7;
		question7.createDate = new Date(2020 / 04 / 06);

		Question question8 = new Question();
		question8.id = 8;
		question8.content = "Hỏi về C++";
		question8.category = categoryQuestion8;
		question8.type = typeQuestion1;
		question8.creatorID = 8;
		question8.createDate = new Date(2020 / 04 / 07);

		Question question9 = new Question();
		question9.id = 9;
		question9.content = "Hỏi về SQL";
		question9.category = categoryQuestion4;
		question9.type = typeQuestion2;
		question9.creatorID = 9;
		question9.createDate = new Date(2020 / 04 / 07);

		Question question10 = new Question();
		question10.id = 10;
		question10.content = "Câu hỏi 10";
		question10.category = categoryQuestion5;
		question10.type = typeQuestion2;
		question10.creatorID = 5;
		question10.createDate = new Date(2020 / 04 / 23);
// Answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Trả lời 01";
		answer1.question = question3;
		answer1.isCorrect = false;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Trả lời 02";
		answer2.question = question4;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "Trả lời 03";
		answer3.question = question4;
		answer3.isCorrect = false;

		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "Trả lời 04";
		answer4.question = question5;
		answer4.isCorrect = true;

		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.content = "Trả lời 05";
		answer5.question = question4;
		answer5.isCorrect = true;

		Answer answer6 = new Answer();
		answer6.id = 6;
		answer6.content = "Trả lời 06";
		answer6.question = question3;
		answer6.isCorrect = true;

		Answer answer7 = new Answer();
		answer7.id = 7;
		answer7.content = "Trả lời 07";
		answer7.question = question4;
		answer7.isCorrect = false;

		Answer answer8 = new Answer();
		answer8.id = 8;
		answer8.content = "Trả lời 08";
		answer8.question = question8;
		answer8.isCorrect = false;

		Answer answer9 = new Answer();
		answer9.id = 9;
		answer9.content = "Trả lời 09";
		answer9.question = question9;
		answer9.isCorrect = true;

		Answer answer10 = new Answer();
		answer10.id = 10;
		answer10.content = "Trả lời 10";
		answer10.question = question10;
		answer10.isCorrect = true;
// Exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "VTIQ001";
		exam1.title = "Đề thi 01";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.creatorID = 3;
//		exam1.createDate = new Date(2020 / 04 / 07);
		
		Question[] exQuestions1 = { question5 };
		exam1.questions = exQuestions1;

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "VTIQ002";
		exam2.title = "Đề thi 02";
		exam2.category = categoryQuestion2;
		exam2.duration = 60;
		exam2.creatorID = 3;
		exam2.createDate = new Date(2020 / 04 / 07);
		Question[] exQuestions2 = { question10 };
		exam2.questions = exQuestions2;

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "VTIQ003";
		exam3.title = "Đề thi 03";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.creatorID = 3;
		exam3.createDate = new Date(2020 / 04 / 07);
		Question[] exQuestions3 = { question4 };
		exam3.questions = exQuestions3;

		Exam exam4 = new Exam();
		exam4.id = 4;
		exam4.code = "VTIQ004";
		exam4.title = "Đề thi Java";
		exam4.category = categoryQuestion6;
		exam4.duration = 60;
		exam4.creatorID = 3;
		exam4.createDate = new Date(2020 / 04 / 06);
		Question[] exQuestions4 = { question3 };
		exam4.questions = exQuestions4;

		Exam exam5 = new Exam();
		exam5.id = 5;
		exam5.code = "VTIQ005";
		exam5.title = "Đề thi Ruby";
		exam5.category = categoryQuestion5;
		exam5.duration = 120;
		exam5.creatorID = 4;
		exam5.createDate = new Date(2020 / 04 / 10);
		Question[] exQuestions5 = { question7 };
		exam5.questions = exQuestions5;

		Exam exam6 = new Exam();
		exam6.id = 6;
		exam6.code = "VTIQ006";
		exam6.title = "Đề thi Postman";
		exam6.category = categoryQuestion3;
		exam6.duration = 60;
		exam6.creatorID = 6;
		exam6.createDate = new Date(2020 / 04 / 05);
		Question[] exQuestions6 = { question10 };
		exam6.questions = exQuestions6;

		Exam exam7 = new Exam();
		exam7.id = 7;
		exam7.code = "VTIQ007";
		exam7.title = "Đề thi SQL";
		exam7.category = categoryQuestion2;
		exam7.duration = 60;
		exam7.creatorID = 7;
		exam7.createDate = new Date(2020 / 04 / 05);
		Question[] exQuestions7 = { question2 };
		exam7.questions = exQuestions7;

		Exam exam8 = new Exam();
		exam8.id = 8;
		exam8.code = "VTIQ008";
		exam8.title = "Đề thi Python";
		exam8.category = categoryQuestion8;
		exam8.duration = 60;
		exam8.creatorID = 8;
		exam8.createDate = new Date(2020/04/07);
		Question[] exQuestions8 = { question10 };
		exam8.questions = exQuestions8;

		Exam exam9 = new Exam();
		exam9.id = 9;
		exam9.code = "VTIQ009";
		exam9.title = "Đề thi ASP.NET";
		exam9.category = categoryQuestion7;
		exam9.duration = 90;
		exam9.creatorID = 10;
		exam9.createDate = new Date(2020 / 04 / 11);
		Question[] exQuestions9 = { question9 };
		exam9.questions = exQuestions9;
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			exam1.createDate = formatter.parse("09/11/2017");
			exam2.createDate = formatter.parse("09/11/2017");
			exam3.createDate = formatter.parse("09/11/2017");
			exam4.createDate = formatter.parse("09/11/2017");
			exam5.createDate = formatter.parse("09/11/2017");
			exam6.createDate = formatter.parse("09/11/2017");
			exam7.createDate = formatter.parse("09/11/2017");
			exam8.createDate = formatter.parse("09/11/2017");
			exam9.createDate = formatter.parse("09/11/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Exam[] exams1 = { exam1 };
		question1.exams = exams1;

		Exam[] exams2 = { exam7 };
		question2.exams = exams2;

		Exam[] exams3 = { exam4 };
		question3.exams = exams3;

		Exam[] exams4 = { exam3 };
		question4.exams = exams4;

		Exam[] exams5 = { exam1 };
		question5.exams = exams5;

		Exam[] exams7 = { exam5 };
		question7.exams = exams7;

		Exam[] exams8 = { exam8 };
		question8.exams = exams8;

		Exam[] exams9 = { exam9 };
		question9.exams = exams9;

		Exam[] exams10 = { exam2, exam6, exam8 };
		question10.exams = exams10;

		Account[] accounts1 = { account1, account2, account3, account7, account9 };
		group1.accounts = accounts1;

		Account[] accounts3 = { account3, account4 };
		group3.accounts = accounts3;

		Account[] accounts4 = { account5 };
		group4.accounts = accounts4;

		Account[] accounts8 = { account3 };
		group8.accounts = accounts8;

		Account[] accounts10 = { account10 };
		group10.accounts = accounts10;
		// Mảng account
		Account[] mangAccounts = new Account[10];
		mangAccounts[0] = account1;
		mangAccounts[1] = account2;
		mangAccounts[2] = account3;
		mangAccounts[3] = account4;
		mangAccounts[4] = account5;
		mangAccounts[5] = account6;
		mangAccounts[6] = account7;
		mangAccounts[7] = account8;
		mangAccounts[8] = account9;
		mangAccounts[9] = account10;
		// Mảng Department
		Department[] mangDepartments = new Department[10];
		mangDepartments[0] = department1;
		mangDepartments[1] = department2;
		mangDepartments[2] = department3;
		mangDepartments[3] = department4;
		mangDepartments[4] = department5;
		mangDepartments[5] = department6;
		mangDepartments[6] = department7;
		mangDepartments[7] = department8;
		mangDepartments[8] = department9;
		mangDepartments[9] = department10;

//       // Thông tin Account 1
//		System.out.println("Account1 ID: " + account1.id);
//		System.out.println("Account1 UserName: " + account1.userName);
//		System.out.println("Account1 FullName: " + account1.fullName);
//		System.out.println("Account1 Email: " + account1.email);
//		System.out.println("Account1 Department: " + account1.department.name);
//		System.out.println("Account1 Position: " + account1.position.name);
//		System.out.println("Account1 CreateDate: " + account1.createDate);
//		
//
//	   System.out.println(account3.toString());
//	   System.out.println("So luong group: " + account3.groups.length);
//// 	//Testing 2
//	//Question 1: 
//		if (account2.Department == null){
//			System.out.println("Nhân viên này chưa có phòng ban.");
//		}
//		else {
//			System.out.println("Phòng ban của nhân viên này là: " + account2.Department.Name);
//		}
//		
//	
//	//Question 2:
//		
//
//		if (account3.groups.length == 0) {
//			System.out.println("Nhân viên này chưa có group");
//			}
//		else if (account3.groups.length == 2 | account3.groups.length == 1) {
//				System.out.println("Group của nhân viên này là: " + account3.toString());
//			}
//		else if (account3.groups.length == 3) {
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group.");
//		}
//		else { System.out.println("Tất cả group");
//		}
//		
//		
//		
//	// Question 3:
//		String i = (account2.Department == null)?("Nhân viên này chưa có phòng ban ") : ("Phòng ban của nhân viên này là: " + account2.Department.Name);
//		System.out.println(i);
//	// Question 4:
//		String u = (account2.Position.Name == "Dev")?("Đây là developer") : ("Người này không phải là Developer");
//		System.out.println(u);
//		
//	//Question 5:
//		switch (group1.accounts.length) {
//			case 1:
//				System.out.println("Nhóm có một thành viên");
//				break;
//			case 2:
//				System.out.println("Nhóm có hai thành viên");
//				break;
//			case 3:
//				System.out.println("Nhóm có ba thành viên");
//				break;
//			default:
//				System.out.println("Nhóm có nhiều thành viên");
//				break;
//				}
//	//Question 6:
//		switch (account2.groups.length) {
//		case 0: 
//			System.out.println("Nhân viên này chưa có group");
//			break;
//		case 1: 
//			System.out.println("Group của nhân viên này là: " + account2.toString());
//			break;
//		case 2: 
//			System.out.println("Group của nhân viên này là: " + account2.toString());
//			break;	
//		case 3: 
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//			break;
//		default:
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//			break;
//		}
//	//Question 7:
//		switch (account1.Position.Name) {
//		case "Dev": 
//			System.out.println("Đây là Developer");
//			break;
//		default: 
//			System.out.println("Người này không phải là Developer");
//			break;
//		}
		// Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng
		// ban của họ.
//		for (Account inforAccount: mangAccounts) {
//			System.out.println(inforAccount.toStringQ10());
//		}

		// Question 9: In ra thông tin các phòng ban bao gồm: id và name
//		for (Department infoDepartment: mangDepartments) {
//			System.out.println("ID: " + infoDepartment.ID);
//			System.out.println("Name: " + infoDepartment.Name + "\n");
//		}

		// Question 10:
//		for (int i = 0; i < mangAccounts.length; i++) {
//			System.out.println("Thong tin account so " + (i+1) + " la:");
//			System.out.println(mangAccounts[i].toStringQ10() +"\n");
//		}
		// Question 11:
//		for (int i = 0; i < mangDepartments.length; i++) {
//			System.out.println(mangDepartments[i].printDeparmentQ11(i + 1));
//		}
		// Question 12:
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Thông tin acc số " + (i+1) + " là:");
//			System.out.println(mangAccounts[i].toStringQ10() + "\n");
//		}
		// Question 13:
//		for (int i = 0; i < mangAccounts.length; i++) {
//			Account accountTam = mangAccounts[i];
//			if (accountTam.ID == 2) {
//				accountTam.ID = 3;
//			}else {
//				System.out.println("Thông tin của acc số " + (i + 1) + " là:");
//				System.out.println(mangAccounts[i].toStringQ13() + "\n");
//			}
//		}
		// Question 14:
//		for (int i = 0; i < mangAccounts.length; i++) {
//			if(mangAccounts[i].ID < 4) {
//				System.out.println("Thông tin của acc số " + (i + 1) + " là:");
//				System.out.println(mangAccounts[i].toStringQ13());
//			}
//		}
		// Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
//		for (int i = 0; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		// Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp
		// với lệnh break, continue
//		int i = 0;
//		while (i < 3) {
//			if (i == 1) {
//				i++;
//				continue;
//			}
//			System.out.println("\nVItri so => " + (i) + "\n" + mangAccounts[i].toStringQ10());
//			i++;
//			
//		}

//		int i = 0;
//		while (i < 10) {
//			System.out.println(mangDepartments[i].toString());
//			i++;
//		}
		// Question 17:
//		int i = 0;
//		do {
//			System.out.println(mangDepartments[i].toString());
//			i++;
//		}
//		while (i < 10);
		// Exercise 2 (Optional): System out printf
		// Question 1: Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in
		// ra số nguyên đó
//		int so = 5;
//		System.out.printf("%d", so);
		// Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out
		// printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
		int so = 100000000;
		 DecimalFormat myFormatter = new DecimalFormat("###,###,###");
	      String output = myFormatter.format(so);
		System.out.printf("%s", output);

		// Question 3: Khai báo 1số thực = 5,567098 và sử dụng lệnh System out printf
		// để in ra số thực đó chỉ bao gồm 4 số đằng sau
//		float f = 5.567098f;
//		System.out.printf("%.4f", f);
		// Question 4:
//		String S = "Nguyễn Văn A";
//		System.out.printf("Tên tôi là %s và tôi đang độc thân.", S);
		// Question 5:
//		Date date = new Date();
//		System.out.printf("%tD %tH:%tM:%tS", date, date, date, date);
		// Question 6: In ra thông tin account (như Question 8 phần FOREACH) theo định dạng table (giống trong Database)
		
		
		
		//Exercise 3 (Optional): Date Format
		//Question 1: In ra thông tin Exam thứ 1 và property create date sẽ được format theo định dạng vietnamese
//		System.out.printf("ID: %d\nCode: %s\nTitle: %s\nCategory: %d\nDuration: %d\nCreatorID: %d\nCreateDate: %tY", exam1.ID, exam1.code, exam1.title, exam1.category.ID, exam1.duration, exam1.creatorID, exam1.createDate);
	}
}
     