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
		department3.name = "B???o v???";

		department4.id = 4;
		department4.name = "Nh??n s???";

		department5.id = 5;
		department5.name = "K??? thu???t";

		department6.id = 6;
		department6.name = "T??i ch??nh";

		department7.id = 7;
		department7.name = "Ph?? gi??m ?????c";

		department8.id = 8;
		department8.name = "Gi??m ?????c";

		department9.id = 9;
		department9.name = "Th?? k??";

		department10.id = 10;
		department10.name = "B??n h??ng";
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
		account1.fullName = "Nguy???n ?????c Anh";
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
		account3.fullName = "Nguy???n h???i ????ng";
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
		account5.fullName = "Nguy???n B?? L???c";
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
		question1.content = "C??u h???i 01";
		question1.category = categoryQuestion9;
		question1.type = typeQuestion1;
		question1.creatorID = 3;
		question1.createDate = new Date("2020/04/23");

		question2.id = 2;
		question2.content = "C??u h???i 02";
		question2.category = categoryQuestion9;
		question2.type = typeQuestion1;
		question2.creatorID = 3;
		question2.createDate = new Date("2020/04/23");

		question3.id = 3;
		question3.content = "H???i v??? C#";
		question3.category = categoryQuestion9;
		question3.type = typeQuestion2;
		question3.creatorID = 3;
		question3.createDate = new Date("2020/04/06");

		question4.id = 4;
		question4.content = "H???i v??? Ruby";
		question4.category = categoryQuestion6;
		question4.type = typeQuestion1;
		question4.creatorID = 4;
		question4.createDate = new Date("2020/04/06");

		question5.id = 5;
		question5.content = "H???i v??? Postman";
		question5.category = categoryQuestion5;
		question5.type = typeQuestion1;
		question5.creatorID = 5;
		question5.createDate = new Date("2020/04/06");

		question6.id = 6;
		question6.content = "H???i v??? ADO.NET";
		question6.category = categoryQuestion3;
		question6.type = typeQuestion2;
		question6.creatorID = 6;
		question6.createDate = new Date("2020/04/06");

		question7.id = 7;
		question7.content = "H???i v??? ASP.NET";
		question7.category = categoryQuestion2;
		question7.type = typeQuestion1;
		question7.creatorID = 7;
		question7.createDate = new Date("2020/04/06");

		question8.id = 8;
		question8.content = "H???i v??? C++";
		question8.category = categoryQuestion8;
		question8.type = typeQuestion1;
		question8.creatorID = 8;
		question8.createDate = new Date("2020/04/07");

		question9.id = 9;
		question9.content = "H???i v??? SQL";
		question9.category = categoryQuestion4;
		question9.type = typeQuestion2;
		question9.creatorID = 9;
		question9.createDate = new Date("2020/04/07");

		question10.id = 10;
		question10.content = "C??u h???i 10";
		question10.category = categoryQuestion5;
		question10.type = typeQuestion2;
		question10.creatorID = 5;
		question10.createDate = new Date("2020/04/23");
// Answer
		answer1.id = 1;
		answer1.content = "Tr??? l???i 01";
		answer1.question = question3;
		answer1.isCorrect = false;

		answer2.id = 2;
		answer2.content = "Tr??? l???i 02";
		answer2.question = question4;
		answer2.isCorrect = true;

		answer3.id = 3;
		answer3.content = "Tr??? l???i 03";
		answer3.question = question4;
		answer3.isCorrect = false;

		answer4.id = 4;
		answer4.content = "Tr??? l???i 04";
		answer4.question = question5;
		answer4.isCorrect = true;

		answer5.id = 5;
		answer5.content = "Tr??? l???i 05";
		answer5.question = question4;
		answer5.isCorrect = true;

		answer6.id = 6;
		answer6.content = "Tr??? l???i 06";
		answer6.question = question3;
		answer6.isCorrect = true;

		answer7.id = 7;
		answer7.content = "Tr??? l???i 07";
		answer7.question = question4;
		answer7.isCorrect = false;

		answer8.id = 8;
		answer8.content = "Tr??? l???i 08";
		answer8.question = question8;
		answer8.isCorrect = false;

		answer9.id = 9;
		answer9.content = "Tr??? l???i 09";
		answer9.question = question9;
		answer9.isCorrect = true;

		answer10.id = 10;
		answer10.content = "Tr??? l???i 10";
		answer10.question = question10;
		answer10.isCorrect = true;
// Exam
		exam1.id = 1;
		exam1.code = "VTIQ001";
		exam1.title = "????? thi 01";
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.creatorID = 3;
		exam1.createDate = new Date("2020/04/07");

		Question[] exQuestions1 = { question5 };
		exam1.questions = exQuestions1;

		exam2.id = 2;
		exam2.code = "VTIQ002";
		exam2.title = "????? thi 02";
		exam2.category = categoryQuestion2;
		exam2.duration = 60;
		exam2.creatorID = 3;
		exam2.createDate = new Date("2020/04/07");
		Question[] exQuestions2 = { question10 };
		exam2.questions = exQuestions2;

		exam3.id = 3;
		exam3.code = "VTIQ003";
		exam3.title = "????? thi 03";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.creatorID = 3;
		exam3.createDate = new Date("2020/04/07");
		Question[] exQuestions3 = { question4 };
		exam3.questions = exQuestions3;

		exam4.id = 4;
		exam4.code = "VTIQ004";
		exam4.title = "????? thi Java";
		exam4.category = categoryQuestion6;
		exam4.duration = 60;
		exam4.creatorID = 3;
		exam4.createDate = new Date("2020/04/06");
		Question[] exQuestions4 = { question3 };
		exam4.questions = exQuestions4;

		exam5.id = 5;
		exam5.code = "VTIQ005";
		exam5.title = "????? thi Ruby";
		exam5.category = categoryQuestion5;
		exam5.duration = 120;
		exam5.creatorID = 4;
		exam5.createDate = new Date("2020/04/10");
		Question[] exQuestions5 = { question7 };
		exam5.questions = exQuestions5;

		exam6.id = 6;
		exam6.code = "VTIQ006";
		exam6.title = "????? thi Postman";
		exam6.category = categoryQuestion3;
		exam6.duration = 60;
		exam6.creatorID = 6;
		exam6.createDate = new Date("2020/04/05");
		Question[] exQuestions6 = { question10 };
		exam6.questions = exQuestions6;

		exam7.id = 7;
		exam7.code = "VTIQ007";
		exam7.title = "????? thi SQL";
		exam7.category = categoryQuestion2;
		exam7.duration = 60;
		exam7.creatorID = 7;
		exam7.createDate = new Date("2020/04/05");
		Question[] exQuestions7 = { question2 };
		exam7.questions = exQuestions7;

		exam8.id = 8;
		exam8.code = "VTIQ008";
		exam8.title = "????? thi Python";
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
		exam9.title = "????? thi ASP.NET";
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
		System.out.println("C??u 1");
		if (account2.department == null) {
			System.out.println("Nh??n vi??n n??y ch??a c?? ph??ng ban");
		}else {
			System.out.println("Ph??ng ban c???a nh??n vi??n n??y l??: " + account2.department.name);
		}
	}
	
	public void ex1Question2() {
		System.out.println("C??u 2");
		if (account2.groups.length == 0) {
			System.out.println("Nh??n vi??n n??y ch??a c?? group");
		}
		else if (account2.groups.length == 1 ) {
			System.out.println("Group c???a nh??n vi??n n??y l?? " + account2.groups[0]);
		}
		else if (account2.groups.length == 2 ) {
			System.out.println("Group c???a nh??n vi??n n??y l?? " + account2.groups[0] + ", " + account2.groups[1]);
		}
		else if (account2.groups.length == 3 ) {
			System.out.println("Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u group");
		} else {
			System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
		}
	}
	
	public void ex1Question3() {
		System.out.println("C??u 3");
		System.out.println (account2.department == null ? "Nh??n vi??n n??y ch??a c?? ph??ng ban"
				: "Ph??ng ban c???a nh??n vi??n n??y l????: " + account2.department.name );
	}
	
	public void ex1Question4() {
		System.out.println("C??u 4");
		System.out.println (account1.position.name == "Dev" ? "????y l?? Developer"
				: "Ng?????i n??y kh??ng ph???i l?? Developer");
	}
	
	public void ex1Question5() {
		System.out.println("C??u 5");
		int x = group1.accounts.length;
		switch (x) {
		case 1:
			System.out.println("Nh??m c?? m???t th??nh vi??n");
			break;
		case 2:
			System.out.println("Nh??m c?? hai th??nh vi??n");
			break;
		case 3:
			System.out.println("Nh??m c?? ba th??nh vi??n");
			break;
		default:
			System.out.println("Nh??m c?? nhi???u th??nh vi??n");
		}
	}
	
	public void ex1Question6() {
		System.out.println("C??u 6");
		int y = account2.groups.length;
		switch (y) {
		case 0:
			System.out.println("Nh??n vi??n n??y ch??a c?? group");
			break;
		case 1:
			System.out.println("Group c???a nh??n vi??n n??y l?? " + account2.groups[0]);
			break;
		case 2:
			System.out.println("Group c???a nh??n vi??n n??y l?? " + account2.groups[0] + ", " + account2.groups[1]);
			break;
		case 3:
			System.out.println("Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u group");
			break;
		default:
			System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
		}	
	}
	
	public void ex1Question7() {
		System.out.println("C??u 7");
		String z = account1.position.name;
		switch (z) {
		case "Dev":
			System.out.println("????y l?? Developer");
			break;
		default:
			System.out.println("Ng?????i n??y kh??ng ph???i l?? Developer");	
		}
	}

	public void ex1Question8() {
		System.out.println("C??u 8");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (Account account : accounts) {
			System.out.println("Account " + account.id);
			System.out.println("Email: " + account.email);
			System.out.println("FullName: " + account.fullName);
			System.out.println("Department Name: " + account.department.name);
		}
	}
	
	public void ex1Question9() {
		System.out.println("C??u 9");
		Department[] departments = {department1, department2, department3};	
		for (Department department : departments) {
			System.out.println("ID " + department.id);
			System.out.println("Name: " + department.name);
		}
	}
	
	public void ex1Question10() {
		System.out.println("C??u 10");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Th??ng tin account th??? " + (i + 1) + " l????: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
		}
	}

	public void ex1Question11() {
		System.out.println("C??u 11");
		Department[] departments = {department1, department2, department3};	
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Th??ng tin department th??? " + (i + 1) + " l????: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}	
	}	
	
	public void ex1Question12() {
		System.out.println("C??u 12");
		Department[] departments = {department1, department2, department3};
		for (int i = 0; i  < 2 ; i++) {
			System.out.println("Th??ng tin department th??? " + (i + 1) + " l????: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}	
	}		
	
	public void ex1Question13() {
		System.out.println("C??u 13");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < accounts.length; i++) {
			if (i != 1) {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l????: ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullName);
				System.out.println("Department: " + accounts[i].department.name);
			}
		}
		}
	
	public void ex1Question14() {
		System.out.println("C??u 14");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].id < 4) {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l????: ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullName);
				System.out.println("Department: " + accounts[i].department.name);
			}
		}		
		}
		
	public void ex1Question15() {
		System.out.println("C??u 15");
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}
	}
	
	public void ex1Question16_10() {
		System.out.println("C??u 16_10");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		while (i < accounts.length) {
			System.out.println("Th??ng tin account th??? " + (i + 1) + " l????:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		}
		}
	
	public void ex1Question16_11() {
		System.out.println("C??u 16_11");
		Department[] departments = {department1, department2, department3};
		int i = 0;
		while (i < departments.length) {
			System.out.println("Th??ng tin department th??? " + (i + 1) + " l????: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}	
		}
	
	public void ex1Question16_12() {
		System.out.println("C??u 16_12");
		Department[] departments = {department1, department2, department3};
		int i = 0;
		while (i < 2) {
			System.out.println("Th??ng tin department th??? " + (i + 1) + " l????: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}	
	    }		
	
	
	public void ex1Question16_13() {
		System.out.println("C??u 16_13");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		while ( i < accounts.length) {
			if (i != 1) {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l????: ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);	
		}
			i++;
		}
     	}
	
	public void ex1Question16_14() {
		System.out.println("C??u 16_14");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		while ( i < accounts.length) {
			if (accounts[i].id < 4) {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l????: ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);
				i++;
		}
		}
		}
	
	public void ex1Question16_15() {
		System.out.println("C??u 16_15");
		int i = 2;
		while ( i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
	    }
	
	public void ex1Question17_10() {
		System.out.println("C??u 17_10");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		do {
			System.out.println("Th??ng tin account th??? " + (i + 1) + " l????:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		} while (i < accounts.length);
	    }
		
	
	public void ex1Question17_11() {
		System.out.println("C??u 17_11");	
		Department[] departments = {department1, department2, department3};
		int i = 0;
		do {
			System.out.println("Th??ng tin department th??? " + (i + 1) + " l????: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		} while (i < departments.length);
		}

	public void ex1Question17_12() {
		System.out.println("C??u 17_12");
		Department[] departments = {department1, department2, department3};
		int i = 0;
		do {
			System.out.println("Th??ng tin department th??? " + (i + 1) + " l????: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		} while (i < 2);
	    }
	
	public void ex1Question17_13() {
		System.out.println("C??u 17_13");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		do {
			if (i != 1) {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l????: ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);
			}	
				i++;
			} while ( i < accounts.length);
	        }


	public void ex1Question17_14() {
		System.out.println("C??u 17_14");
		Account[] accounts = { account1, account2, account3, account4, account5 };
		int i = 0;
		do {
			if (accounts[i].id == 4) {
				break;
			} else {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l????: ");
				System.out.println("ID: " + accounts[i].id);
				System.out.println("Name: " + accounts[i].fullName);
		    }	
				i++;
		} while ( i < accounts.length);
	    }

	
	public void ex1Question17_15() {
		System.out.println("C??u 17_15");
		int i = 2;
		do {
			System.out.println(i);
			i = i + 2;
		} while ( i <= 20);
	    }
	
	//EX2
	public void ex2Question1() {
		System.out.println("Question 1:Khai b??o 1 s??? nguy??n = 5 v?? s??? d???ng l???nh System out printf ????? in ra s??? nguy??n ????");
		int i = 5;
		System.out.printf("%d%n", i);
	}
	
	public void ex2Question2() {	
		System.out.println("Question 2:Khai b??o 1 s??? nguy??n = 100 000 000 v?? s??? d???ng l???nh System out printf ????? in ra s??? nguy??n ???? ");
		int i = 100000000;
		System.out.printf(Locale.US, "%,d%n", i);
	}
	
	public void ex2Question3() {	
		System.out.println("Question 3: Khai b??o 1 s??? th???c = 5,567098 v?? s??? d???ng l???nh System out printf ????? in ra s??? th???c ???? ch??? bao g???m 4 s??? ?????ng sau");
		float y = 5.567098f;
		System.out.printf("%5.4f%n", y);
	}
	
	public void ex2Question4() {
		System.out.println("Question 4:");
		String s = "Nguy???n V??n A";
		System.out.printf("T??n t??i l?? \"" + s + "\" v?? t??i ??ang ?????c th??n" + "\n");
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
	System.out.println("Question 1: In ng???u nhi??n ra 1 s??? nguy??n");
		Random random = new Random();
		int n = random.nextInt();
		System.out.println("S??? ng???u nhi??n: " + n);
	}	
	
	public void ex4Question2() {
		System.out.println("Question 2: In ng???u nhi??n ra 1 s??? th???c");
		Random random = new Random();
		float f = random.nextFloat();
		System.out.println("S??? ng???u nhi??n: " + f);
	}
	
	public void ex4Question3() {
		System.out.println("Question 3: Khai b??o 1 array bao g???m c??c t??n c???a c??c b???n trong l???p, sau ???? in ng???u nhi??n ra t??n c???a 1 b???n");
		String[] name = { "Hanh", "Hung", "Hien" };
		Random random = new Random();
		int i = random.nextInt(name.length);
		System.out.println("T??n ng???u nhi??n 1 b???n trong l???p: " + name[i]);
	}
	
	public void ex4Question4() {
		System.out.println("Question 4:L???y ng???u nhi??n 1 ng??y trong kho???ng th???i gian 24-07-1995 t???i ng??y 20-12-1995");
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay(); 
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay(); 
		Random random = new Random();
		long randomInt = minDay + random.nextInt(maxDay - minDay); 
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
	}
	
	public void ex4Question5() {
		System.out.println("Question 5: L???y ng???u nhi??n 1 ng??y trong kho???ng th???i gian 1 n??m tr??? l???i ????y");
		int now = (int) LocalDate.now().toEpochDay();
		Random random = new Random();
		int randomDate = now - random.nextInt(365);
		LocalDate randomDay = LocalDate.ofEpochDay(randomDate);
		System.out.println(randomDay);
	}
	
	public void ex4Question6() {
		System.out.println("Question 6: L???y ng???u nhi??n 1 ng??y trong qu?? kh???");
		int maxDay1 = (int) LocalDate.now().toEpochDay();
		Random random = new Random();
		long randomDate = random.nextInt(maxDay1);
		LocalDate randomDay = LocalDate.ofEpochDay(randomDate);
		System.out.println(randomDay);
	}
	
	public void ex4Question7() {
		System.out.println("Question 7: L???y ng???u nhi??n 1 s??? c?? 3 ch??? s???");
		Random random = new Random();
		int z = random.nextInt(999 - 100 + 1) + 100; 
		System.out.println(z);
	}
	
	//EX5
	public void ex5Question1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 1: Vi???t l???nh cho ph??p ng?????i d??ng nh???p 3 s??? nguy??n v??o ch????ng tr??nh");
		System.out.println("M???i b???n nh???p v??o 3 s??? nguy??n");
		System.out.println("Nh???p v??o s??? 1: ");
		int a = sc.nextInt();
		System.out.println("Nh???p v??o s??? 2: ");
		int b = sc.nextInt();
		System.out.println("Nh???p v??o s??? 3: ");
		int c = sc.nextInt();
		System.out.println("B???n v???a nh???p v??o c??c s???: " + a + " " + b + " " + c);
	}
	
	public void ex5Question2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 2: Vi???t l???nh cho ph??p ng?????i d??ng nh???p 2 s??? th???c v??o ch????ng tr??nh");
		System.out.println("M???i b???n nh???p v??o 2 s??? th???c");
		System.out.println("Nh???p v??o s??? 1: ");
		float f1 = sc.nextFloat();
		System.out.println("Nh???p v??o s??? 2: ");
		float f2 = sc.nextFloat();
		System.out.println("B???n v???a nh???p v??o c??c s???: " + f1 + " " + f2);
	}
	
	public void ex5Question3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 3: Vi???t l???nh cho ph??p ng?????i d??ng nh???p h??? v?? t??n");
		System.out.println("M???i b???n nh???p v??o H???: ");
		String s1 = sc.next();
		System.out.println("M???i b???n nh???p v??o T??n: ");
		String s2 = sc.next();
		System.out.println("H??? t??n c???a b???n l??:" + s1 + " " + s2);
	}
	
	public void ex5Question4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 4: Vi???t l???nh cho ph??p ng?????i d??ng nh???p v??o ng??y sinh nh???t c???a h???");
		System.out.println("M???i b???n nh???p v??o ng??y sinh: ");
	    int day = sc.nextInt();
	    System.out.println("M???i b???n nh???p v??o th??ng sinh: ");
	    int month = sc.nextInt();
	    System.out.println("M???i b???n nh???p v??o n??m sinh: ");
	    int year = sc.nextInt();   
	    LocalDate dateBirth = LocalDate.of(year , month, day );
	    System.out.println("Ng??y sinh c???a b???n l??: " + dateBirth);
	}
	
	public void ex5Question5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 5: Vi???t l???nh cho ph??p ng?????i d??ng t???o account");
		System.out.println("M???i b???n nh???p th??ng tin account: ");
		System.out.println("Nh???p ID: ");
		int id = sc.nextInt();
		System.out.println("Nh???p email: ");
		String email = sc.next();
		System.out.println("Nh???p userName: ");
		String userName = sc.next();
		System.out.println("Nh???p fullName: ");
		String fullName = sc.next();
		System.out.println("Nh???p position (Nh???p c??c s??? t??? 1 ?????n 4 t????ng ???ng v???i: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");
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
		System.out.println("Th??ng tin account v???a t???o:" + "\n" + "ID: " + id + "\n" +
				"Email: " + email + "\n" + "UserName: " + userName + "\n" + "FullName: " + fullName + "\n" +
				"Position: " + pos.name );
		}
	
	public void ex5Question6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 6: Vi???t l???nh cho ph??p ng?????i d??ng t???o department");
		System.out.println("M???i b???n nh???p th??ng tin account: ");
		System.out.println("Nh???p ID: ");
		int id = sc.nextInt();
		System.out.println("Nh???p department name: ");
		String name = sc.next();
		System.out.println("Th??ng tin department v???a t???o:" + "\n" + "Department ID: " + id + "\n" + "Department name: " + name);
	}
	
	public void ex5Question7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 7:  Nh???p s??? ch???n t??? console");
		System.out.println("H??y nh???p v??o 1 s??? ch???n: ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("B???n v???a nh???p:" + a);
		} else {
			System.out.println("Nh???p sai, ????y kh??ng ph???i l?? s??? ch???n");
		}
	}
	
	public void ex5Question8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 8: Vi???t ch????ng tr??nh th???c hi???n theo flow");
		System.out.println("M???i b???n nh???p v??o ch???c n??ng mu???n s??? d???ng: ");
		System.out.println("Nh???p 1 ????? t???o account, nh???p 2 ????? t???o deparment: ");
		int a = sc.nextInt();
		if(a == 1) {
			ex5Question5();
		}
		else if (a == 2) {
			ex5Question6();
		} 
		else {
			System.out.println("M???i b???n nh???p l???i:");
		}
	}
	
	public void ex5Question9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Question 9: Vi???t method cho ph??p ng?????i d??ng th??m group v??o account");
		Account[] accounts = {account1, account2, account3};
		Group[] groups = {group1, group2, group3, group4};
		//B?????c 1
		System.out.println("Username c???a c??c user: ");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println( accounts[i].userName);
		}
		// B?????c 2
		System.out.println("Nh???p v??o UserName c???a account: ");
		String userName = sc.next();
		// B?????c 3
		System.out.println("T??n c??c group: ");
		for (int i = 0; i < groups.length; i++) {
			System.out.println(groups[i].name);
		}	
		//B?????c 4
		System.out.println("Nh???p v??o t??n Group: ");
		String groupName = sc.next();
	}
	
	//EX6
	public void ex6Question1() {
		System.out.println("Question 1: T???o method ????? in ra c??c s??? ch???n nguy??n d????ng nh??? h??n 10");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\n");
			}
		}
	}
	
	public void ex6Question2() {
		System.out.println("Question 2: T???o method ????? in th??ng tin c??c account");
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
		System.out.println("Question 3:T???o method ????? in ra c??c s??? nguy??n d????ng nh??? h??n 10");
		for (int i = 0; i < 10; i++) {
				System.out.print(i);
		}	
	}
		
//		// 1 - vi???t h??m t??nh chu vi h??nh ch??? nh???t	
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Moi ban nhap vao chieu rong: ");
//			int chieuRong = sc.nextInt();
//			System.out.print("Moi ban nhap vao chieu dai: ");
//			int chieuDai = sc.nextInt();
//			int chuvi = chuViHinhChuNhat(chieuRong, chieuDai);
//			System.out.println("Chu vi hinh chu nhat co chieu rong: " + chieuRong + " va chieu dai: " + chieuDai + " l??: " + chuvi);
//		} 
//		
//		public static int chuViHinhChuNhat (int chieuRong, int chieuDai) {
//			    int chuvi = (chieuRong + chieuDai)*2;
//			    return chuvi;
//			}   
//		
//		// 2 - vi???t h??m t??nh di???n t??ch h??nh vu??ng.
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);	
//			System.out.print("Moi ban nhap vao chieu dai canh: ");
//			int canh = sc.nextInt();
//			int dientich = dienTichHinhVuong(canh);
//			System.out.println("Dien tich hinh vuong co canh: " + canh + " l??: " + dientich);
//		}
//		 public static int dienTichHinhVuong (int canh) {
//		    	int dientich = canh*canh;
//		    	return dientich;
//		 }
//
//		// 3 - Vi???t ch????ng tr??nh t??m t???t c??? c??c s??? chia h???t cho 7 nh??ng kh??ng ph???i b???i s??? c???a 5, n???m trong ??o???n 10 v?? 200
//		public static void main(String[] args) {
//			System.out.println("C??c s??? chia h???t cho 7 nh??ng kh??ng ph???i b???i s??? c???a 5, n???m trong ??o???n 10 v?? 200 l??: ");
//			for (int i = 10; i <= 200 ; i++) {
//			   if (i % 7 == 0 && i % 5 != 0) {
//				   System.out.println(i);
//			   }  
//			 }  
//		} 
//
//		// 4 - H??y vi???t ch????ng tr??nh t??nh t???ng c??c ch??? s??? c???a m???t s??? nguy??n b???t k???. V?? d???: S??? 8545604 c?? t???ng c??c ch??? s??? l??: 8+5+4+5+6+0+4= 32.
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in); 
//		    System.out.println("Nh???p v??o s??? nguy??n d????ng b???t k???: ");
//		    int n, soDu, tong = 0;
//		    n = sc.nextInt();     
//		    while (n > 0) {
//		        soDu = n % 10;
//		        n = n / 10;
//		        tong += soDu;
//		    }  
//		    System.out.println("T???ng c??c ch??? s??? = " + tong);
//		}
//		
//	    //5 - Vi???t ch????ng tr??nh gi???i ph????ng tr??nh b???c 2
//		  Gi???i ph????ng tr??nh b???c 2: ax2 + bx + c = 0
//		  param a: h??? s??? b???c 2
//		  param b: h??? s??? b???c 1
//		  param c: s??? h???ng t??? do
//		 public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in); 
//		    System.out.print("Nh???p h??? s??? b???c 2, a = ");
//		    float a = sc.nextFloat();
//		    System.out.print("Nh???p h??? s??? b???c 1, b = ");
//		    float b = sc.nextFloat();
//		    System.out.print("Nh???p h???ng s??? t??? do, c = ");
//		    float c = sc.nextFloat();
//		    giaiPTBac2(a, b, c);
//		    }
//	
//		  public static void giaiPTBac2(float a, float b, float c) {
//		        // ki???m tra c??c h??? s???
//		        if (a == 0) {
//		            if (b == 0) {
//		                System.out.println("Ph????ng tr??nh v?? nghi???m");
//		            } else {
//		                System.out.println("Ph????ng tr??nh c?? m???t nghi???m: "  + "x = " + (-c / b));
//		            }
//		            return;
//		        }
//		        // t??nh delta
//		        float delta = b*b - 4*a*c;
//		        float x1;
//		        float x2;
//		        // t??nh nghi???m
//		        if (delta > 0) {
//		            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
//		            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
//		            System.out.println("Ph????ng tr??nh c?? 2 nghi???m l??: "
//		                    + "x1 = " + x1 + " v?? x2 = " + x2);
//		        } else if (delta == 0) {
//		            x1 = (-b / (2 * a));
//		            System.out.println("Ph????ng tr??nh c?? nghi???m k??p: "
//		                    + "x1 = x2 = " + x1);
//		        } else {
//		            System.out.println("Ph????ng tr??nh v?? nghi???m");
//		        }
//		    }
//		
//		//6 - Vi???t ch????ng tr??nh ????ng nh???p t??i kho???n, cho ph??p nh???p v??o username v?? password, n???u nh???p ????ng th??ng b??o ????ng nh???p th??nh c??ng
//		  public static void main (String[] args) {
//			  String username = "hanhth";
//			  String password = "Nguyen0102";
//			  Scanner sc = new Scanner(System.in); 
//			  System.out.print("M???i nh???p username: ");
//			  String userName = sc.next();
//			  System.out.print("M???i nh???p password: ");
//			  String passWord = sc.next();
//			  if (userName.equals(username) && passWord.equals(password)) {
//				  System.out.print("????ng nh???p th??nh c??ng!");
//			  } else {
//				  System.out.print("????ng nh???p kh??ng th??nh c??ng! M???i nh???p l???i!");
//			  }
			  
//		  }
}  	