import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
		}

	// Question 1:
	public static void question1() {
		System.out.println("Question1: Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó");
		String s1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời nhập xâu ký tự: ");
		s1 = scanner.nextLine();

		String[] words = s1.split(" ");
		System.out.println("số từ trong xâu ký tự là: " + words.length);

		scanner.close();
	}

	// Question 2:
	public static void question2() {
		System.out.println("Question2: Nhập hai xâu kí tự s1, s2, nối xâu kí tự s2 vào sau xâu s1");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập xâu 1: ");
		String s1 = scanner.nextLine();

		System.out.println("Nhập xâu 2: ");
		String s2 = scanner.nextLine();

		System.out.println("Sau khi nhập 2 xâu : " + s1.concat(" " + s2));
	}

	// Question 3:
	public static void question3() {
		System.out.println("Question3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời nhập tên: ");
		String name = scanner.nextLine();

		String firstCharacter = name.substring(0,1).toUpperCase();

		String leftCharacter = name.substring(1);

		name = firstCharacter + leftCharacter;

		System.out.println(name);
	}

	// Question 4:
	public static void question4() {
		System.out.println("Question4: Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời nhập tên: ");
		String name = scanner.nextLine();

		name = name.toUpperCase();

		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ký tự thứ " + (i+1) + " là : " + name.charAt(i));
		}
	}

	// Question 5:
	public static void question5() {
		System.out.println("Question5: Viết chương trình để người dùng nhập vào họ, tên và hệ thống sẽ in ra họ và tên đầy đủ");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời nhập họ: ");
		String firstName = scanner.nextLine();

		System.out.println("Mời nhập tên: ");
		String lastName = scanner.nextLine();

		System.out.println("Họ tên của bạn là: " + firstName.concat(" " + lastName));
	}

	// Question 6:
	public static void question6() {
		System.out.println("Question6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên, tên đệm");
		String fullName;
		String lastName = "", middleName = "", firstName = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời nhập họ tên đầy đủ:");
		fullName = scanner.nextLine();

		fullName = fullName.trim();

		String[] words = fullName.split(" ");

		lastName = words[0];
		firstName = words[words.length - 1];

		for (int i = 1; i <= words.length - 2; i++) {
			middleName += words[i] + " ";
		}

		System.out.println("Họ là : " + lastName);
		System.out.println("Tên đệm là : " + middleName);
		System.out.println("Tên là : " + firstName);
	}

	// Question 7:
	public static void question7() {
		System.out.println("Question7: Chuẩn hoá tên người dùng");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời nhập họ tên đầy đủ: ");
		String fullName = scanner.nextLine();

		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");

		String[] words = fullName.split(" ");
		fullName = "";

		for (String word : words) {
			String firstCharacter = word.substring(0, 1).toUpperCase();
			String leftCharacter = word.substring(1);
			word = firstCharacter + leftCharacter;

			fullName += word + " ";
		}

		System.out.println("Họ tên sau khi chuẩn hoá: " + fullName);
	}

	// Question 8:
	public static void question8() {
		System.out.println("Question8: In ra tất cả các group có chứa chữ Java");
		String[] groupNames = { "Nhóm Java", "Nhóm C#", "Nhóm Python", "Nhóm Javascript" };

		for (String groupName : groupNames) {
			if (groupName.contains("Java")) {
				System.out.println(groupName);
			}
		}
	}

	// Question 9:
	public static void question9() {
		System.out.println("Question9: In ra tất cả các group Java");
		String[] groupNames = { "Java", "C#", "Python", "Javascript" };

		for (String groupName : groupNames) {
			if (groupName.equals("Java")) {
				System.out.println(groupName);
			}
		}
	}

	// Question 10:
	public static void question10() {
		System.out.println("Question10: Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không");
		Scanner scanner = new Scanner(System.in);
		String s1, s2, reverseS1 = "";

		System.out.println("Nhập chuỗi 1: ");
		s1 = scanner.nextLine();

		System.out.println("Nhập chuỗi 2: ");
		s2 = scanner.nextLine();

		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseS1 += s1.substring(i, i + 1);
		}

		if (s2.equals(reverseS1)) {
			System.out.println("Đây là chuỗi đảo ngược");
		}
			else {
				System.out.println("Đây không phải là chuỗi đảo ngược");
			}
		}


}
