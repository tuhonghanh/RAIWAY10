public class Exercise3 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
	}

	// Question 1:
	public static void question1() {
		System.out.println("Question1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000, sau đó convert lương ra float và hiển thị lương lên màn hình (float có 2 số sau dấu thập phân)");
		Integer salary = 5000;
		System.out.printf("%.2f", (float) salary);
		System.out.printf("\n");
	}

	// Question 2:
	public static void question2() {
		System.out.println("Question2: Khai báo 1 String có value = 1234567, convert String đó ra số int ");
		String s = "1234567";
		Integer a = Integer.parseInt(s);
		System.out.println(a);
	}

	// Question 3:
	public static void question3() {
		System.out.println("Question3: Khởi tạo 1 số Integer có value là chữ 1234567, sau đó convert số trên thành datatype int");
		Integer a = 1234567;
		int b = a.intValue();
		System.out.println(b);
	}
}
