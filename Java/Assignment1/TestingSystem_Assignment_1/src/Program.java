import java.util.Date;


public class Program {
	
	public static void main (String[] args) {
		
		//1 tạo department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";
		
		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Hành chính";
		
		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Giám đốc";
		
		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Kế toán";
		
		//2 tạo position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;
		
		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;
		
		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;
		
		Position position4 = new Position();
		position4.id = 4;
		position4.name = PositionName.PM ;
		
		//4 tạo group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhóm 1";
		group1.creatorId = 1;
		group1.createDate = new Date("2010/06/01");

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Nhóm 2";
		group2.creatorId = 2;
		group2.createDate = new Date("2020/06/20");

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Nhóm 3";
		group3.creatorId = 3;
		group3.createDate = new Date("2020/06/21");

		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Nhóm 4";
		group4.creatorId = 4;
		group4.createDate = new Date("2020/07/16");

		Group group5 = new Group();
		group5.id = 5;
		group5.name = "Nhóm 5";
		group5.creatorId = 5;
		group5.createDate = new Date("2020/08/19");
						
		
		//3 tạo account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "hien12@gmail.com";
		account1.userName = "hien12";
		account1.fullName = "Nguyễn Thị Hiền";
		account1.department = department2;
		account1.position = position1;
		account1.createDate = new Date("2020/01/01");
		Group[] groupOfAcoount1 = {group1, group2};
		account1.groups = groupOfAcoount1;
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "thuy.ng@gmail.com";
		account2.userName = "thuy123";
		account2.fullName = "Trần Thanh Thuý";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = new Date("2020/01/05");
		Group[] groupOfAccount2 = {group5, group3 };
		account2.groups = groupOfAccount2;
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "tt.tung@gmail.com";
		account3.userName = "tt.tung";
		account3.fullName = "Hoàng Văn Tùng";
		account3.department = department1;
		account3.position = position4;
		account3.createDate = new Date("2020/02/05");
		Group[] groupOfAccount3 = {group1};
		account3.groups = groupOfAccount3;
		
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "hoang45@gmail.com";
		account4.userName = "hoang45";
		account4.fullName = "Vũ Minh Hoàng";
		account4.department = department5;
		account4.position = position3;
		account4.createDate = new Date("2020/03/15");
		Group[] groupOfAccount4 = {group2, group5};
		account4.groups = groupOfAccount4;
		
		Account[] accountOfGroup1 = {account1, account2, account3};
		group1.accounts = accountOfGroup1;
		
		Account[] accountOfGroup2 = {account2, account3};
		group2.accounts = accountOfGroup2;
		
		Account[] accountOfGroup3 = {account2};
		group3.accounts = accountOfGroup3;
		
		Account[] accountOfGroup4 = {account1, account4};
		group4.accounts = accountOfGroup4;
		
		Account[] accountOfGroup5 = {account2, account3};
		group5.accounts = accountOfGroup5;		
		
		//6 tạo typeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = TypeName.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = TypeName.MULTIPLE_CHOICE;
		
		//7 tạo categoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = ".NET";
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = "SQL";
		
		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = "Postman";
		
		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = "Ruby";
		
		//8 tạo Question
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Câu hỏi Java";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creator = account2;
		question1.createDate = new Date("2020/11/12");
		
		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Câu hỏi Ruby";
		question2.category = categoryQuestion5;
		question2.type = typeQuestion1;
		question2.creator = account3;
		question2.createDate = new Date("2020/11/15");
		
		Question question3 = new Question();
		question3.id = 3;
		question3.content = "Câu hỏi SQL";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion2;
		question3.creator = account2;
		question3.createDate = new Date("2020/12/12");
		
		Question question4 = new Question();
		question4.id = 4;
		question4.content = "Câu hỏi Postman";
		question4.category = categoryQuestion4;
		question4.type = typeQuestion2;
		question4.creator = account4;
		question4.createDate = new Date("2020/12/22");
		
		//9 tạo answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "câu trả lời Ruby";
		answer1.question = question2;
		answer1.isCorrect = false;
		
		
		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "câu trả lời SQL";
		answer2.question = question3;
		answer2.isCorrect = true;
		
		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "câu trả lời Java";
		answer3.question = question1;
		answer3.isCorrect = false;
				
		//10 tạo exam
		Exam exam1 = new Exam ();
		exam1.id = 1;
		exam1.code = "A_1";
		exam1.title = "Đề thi Ruby";
		exam1.category = categoryQuestion5;
		exam1.duration = 120;
		exam1.creator = account2;
		exam1.createDate = new Date("2021/01/01");
		Question[] questionOfExam1 = {question1, question2, question3};
		exam1.questions = questionOfExam1;
		
		Exam exam2 = new Exam ();
		exam2.id = 2;
		exam2.code = "A_2";
		exam2.title = "Đề thi .NET";
		exam2.category = categoryQuestion2;
		exam2.duration = 180;
		exam2.creator = account2;
		exam2.createDate = new Date("2021/01/01");
		Question[] questionOfExam2 = {question1, question3};
		exam2.questions = questionOfExam2;
		
		Exam exam3 = new Exam ();
		exam3.id = 3;
		exam3.code = "A_3";
		exam3.title = "Đề thi SQL";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.creator = account3;
		exam3.createDate = new Date("2021/01/02");
		Question[] questionOfExam3 = {question1, question2, question3, question4};
		
		//tạo examQuestion
		Exam[] examOfQuestion1 = {exam1, exam2};
		question1.exams = examOfQuestion1;
		
		Exam[] examOfQuestion2 = {exam1, exam2, exam3};
		question2.exams = examOfQuestion2;
		
		// in thông tin acc1
		System.out.println(account1.toString());
		System.out.println("\n");
		
		System.out.println("Thông tin phòng ban 1:");
		System.out.println("Name: " + department1.name);
		System.out.println("ID: " + department1.id);
		System.out.println("\n");
		
		System.out.println("Thông tin exam 1:");
		System.out.println("ID: " + exam1.id);
		System.out.println("Code: " + exam1.code);
		System.out.println("Title: " + exam1.title);
		System.out.println("Category: " + exam1.category.name);
		System.out.println("Duration: " + exam1.duration);
		System.out.println("Creator: " + exam1.creator.fullName);
		System.out.println("Create Date: " + exam1.createDate);
	
		
	}
}


		