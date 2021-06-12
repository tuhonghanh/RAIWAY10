import java.util.Random;
import java.util.Scanner;

//    Exercise 1: Datatype Casting
public class Exercise1 {
	public static void main(String[] args) {
		question1();
		question2_3();
		question4();
	}

	// Question 1:
	public static void question1() {
		System.out.println("Question 1: ");
		float salaryofAccount1 = 5240.5f;
		float salaryofAccount2 = 10970.055f;
		int roundSalary1 = (int) salaryofAccount1;
		int roundSalary2 = (int) salaryofAccount2;
		System.out.println(roundSalary1);
		System.out.println(roundSalary2);
	}

	// Question 2_3:
	public static void question2_3() {
		System.out.println("Question 2: ");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

//		// Cach 1
//		System.out.println("Please enter a number: (0-99999)");
//		int number = scanner.nextInt();
		
		// Cach 2
		int number = random.nextInt(99999);
		String output = String.valueOf(number);
		switch (output.length()) {
		case 1:
			output = "0000" + output;
			break;

		case 2:
			output = "000" + output;
			break;
		case 3:
			output = "00" + output;
			break;
		case 4:
			output = "0" + output;
			break;
		case 5:
			break;
		default:
			System.err.println("So ban nhap co so chu so khong nam trong khoang tu 1 den 5");
			break;
		}
		System.out.println(output);
		System.out.println("Question 3:Lấy 2 số cuối của số ở Question 2 và in ra");
		System.out.println(output.substring(3)); 
	}
		
	// Question 4:
	public static void question4() {
		System.out.println("Question 4: ");
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a = ");
		a = scanner.nextInt();
		do {
			System.out.println("nhap b = ");
			b = scanner.nextInt();
			if (b == 0) {
				System.out.println("Vui long nhap b khac 0 !");
			}
		} while (b == 0);

		scanner.close();

		System.out.println("thuong: " + (float) a / b);
	}
}
