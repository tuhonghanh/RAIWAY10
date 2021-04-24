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
		
		//3 tạo account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "hien12@gmail.com";
		account1.userName = "hien12";
		account1.fullName = "Nguyễn Thị Hiền";
		account1.department = department2;
		account1.position = position1;
		account1.createDate = new Date("2020/01/01");
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "thuy.ng@gmail.com";
		account2.userName = "thuy123";
		account2.fullName = "Trần Thanh Thuý";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = new Date("2020/01/05");
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "tt.tung@gmail.com";
		account3.userName = "tt.tung";
		account3.fullName = "Hoàng Văn Tùng";
		account3.department = department1;
		account3.position = position4;
		account3.createDate = new Date("2020/02/05");
		
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "hoang45@gmail.com";
		account4.userName = "hoang45";
		account4.fullName = "Vũ Minh Hoàng";
		account4.department = department5;
		account4.position = position3;
		account4.createDate = new Date("2020/03/15");
			
		//4 tạo group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhóm 1";
		group1.creator = account2;
		group1.createDate = new Date("2020/06/19");
		
		
		Group group2 = new Group();
	    group2.id = 2;
		group2.name = "Nhóm 2";
		group2.creator = account2;
		group2.createDate = new Date("2020/06/20");
				
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Nhóm 3";
		group3.creator = account1;
		group3.createDate = new Date("2020/06/21");
		
		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Nhóm 4";
		group4.creator = account3;
		group4.createDate = new Date("2020/07/16");		
		
		Group group5 = new Group();
		group5.id = 5;
		group5.name = "Nhóm 5";
		group5.creator = account3;
		group5.createDate = new Date("2020/08/19");
		
		//5 tạo groupAccount
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.account = account1;
		groupAccount1.group = group3;
		groupAccount1.joinDate = new Date("2020/06/21");
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.account = account3;
		groupAccount2.group = group3;
		groupAccount2.joinDate = new Date("2020/06/23");
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.account = account3;
		groupAccount3.group = group4;
		groupAccount3.joinDate = new Date("2020/07/16");
		
		GroupAccount groupAccount4 = new GroupAccount();
		groupAccount4.account = account4;
		groupAccount4.group = group1;
		groupAccount4.joinDate = new Date("2020/08/09");
		
		GroupAccount groupAccount5 = new GroupAccount();
		groupAccount5.account = account2;
		groupAccount5.group = group1;
		groupAccount5.joinDate = new Date("2020/08/10");
		
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
		
		Exam exam2 = new Exam ();
		exam2.id = 2;
		exam2.code = "A_2";
		exam2.title = "Đề thi .NET";
		exam2.category = categoryQuestion2;
		exam2.duration = 180;
		exam2.creator = account2;
		exam2.createDate = new Date("2021/01/01");
		
		Exam exam3 = new Exam ();
		exam3.id = 3;
		exam3.code = "A_3";
		exam3.title = "Đề thi SQL";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.creator = account3;
		exam3.createDate = new Date("2021/01/02");
		
		//tạo examQuestion
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question2;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam1;
		examQuestion2.question = question4;
		
		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = question2;
		
		//1 In thông tin department
		System.out.println ("Thong tin phong ban 1:");
		System.out.println ("ID:" + department1.id);
		System.out.println ("Name:" + department1.name);
		System.out.println ("\n");
		System.out.println ("Thong tin phong ban 2:");
		System.out.println ("ID:" + department2.id);
		System.out.println ("Name:" + department2.name);
		System.out.println ("\n");
		
		//2 In thông tin position
		System.out.println ("Thong tin chuc vu 1: ");
		System.out.println ("ID: " + position1.id);
		System.out.println ("Name: " + position1.name);
		System.out.println ("\n");
		System.out.println ("Thong tin phong ban 3: ");
		System.out.println ("ID: " + department3.id);
		System.out.println ("Name: " + department3.name);
		System.out.println ("\n");
		
		//3 In thông tin account
		System.out.println ("Thong tin account 1: ");
		System.out.println ("ID: " + account1.id);
		System.out.println ("Email: " + account1.email);
		System.out.println ("User name: " + account1.userName);
		System.out.println ("Full name: " + account1.fullName);
		System.out.println ("Department name: " + account1.department.name);
		System.out.println ("Position name: " + account1.position.name);
		System.out.println ("Create date: " + account1.createDate);
		System.out.println ("\n");
		
		//4 In thông tin group
		System.out.println ("Thong tin group 1: ");
		System.out.println ("ID: " + group1.id);
		System.out.println ("Name: " + group1.name);
		System.out.println ("Creator name: " + group1.creator.fullName);
		System.out.println ("Create date: " + group1.createDate);
		System.out.println ("\n");
		
		//5 In thông tin groupAccount
		System.out.println ("Thong tin groupAccount 1: ");
		System.out.println ("Group name: " + groupAccount1.group.name);
		System.out.println ("User name: " + groupAccount1.account.fullName);
		System.out.println ("Join date: " + groupAccount1.joinDate);
		System.out.println ("\n");
		
		//6 In thông tin typeQuestion
		System.out.println ("Thong tin typeQuestion 1: ");
		System.out.println ("ID: " + typeQuestion1.id);
		System.out.println ("Type name: " + typeQuestion1.name);
		System.out.println ("\n");
		
		//7 In thông tin CategoryQuestion
		System.out.println ("Thong tin categoryQuestion 1: ");
		System.out.println ("ID: " + categoryQuestion1.id);
		System.out.println ("Category name: " + categoryQuestion1.name);
		System.out.println ("\n");
		
		//8 In thông tin Question
		System.out.println ("Thong tin question 1: ");
		System.out.println ("ID: " + question1.id);
		System.out.println ("Content: " + question1.content);
		System.out.println ("Category name: " + question1.category.name);
		System.out.println ("Type name: " + question1.type.name);
		System.out.println ("Creator name: " + question1.creator.fullName);
		System.out.println ("Creat date: " + question1.createDate);
		System.out.println ("\n");
		
		//9 In thông tin Answer
		System.out.println ("Thong tin answer 1: ");
		System.out.println ("ID: " + answer1.id);
		System.out.println ("Content: " + answer1.content);
		System.out.println ("Question content: " + answer1.question.content);
		System.out.println ("Kết quả: " + answer1.isCorrect);
		System.out.println ("\n");
		
		//10  In thông tin Exam
		System.out.println ("Thong tin exam 1: ");
		System.out.println ("ID: " + exam1.id);
		System.out.println ("Code: " + exam1.code);
		System.out.println ("Tittle: " + exam1.title);
		System.out.println ("Category question name: " + exam1.category.name);
		System.out.println ("Duration: " + exam1.duration);
		System.out.println ("Creator name: " + exam1.creator.fullName);
		System.out.println ("Create date: " + exam1.createDate);
		System.out.println ("\n");
		
		//11 In thông tin ExamQuestion
		System.out.println ("Thong tin examQuestion 1: ");
		System.out.println ("Exam title: " + examQuestion1.exam.title + ", " + "Exam duration: " + examQuestion1.exam.duration);
		System.out.println ("Question content: " + examQuestion1.question.content);
		System.out.println ("\n");
		
	}
}

		