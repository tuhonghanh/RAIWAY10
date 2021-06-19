package backend;

import java.util.Scanner;

import entity.Department;

public class Exercise2 {
	public void question1_2() {
		System.out.println("--------------------------Question 1 & 2----------------------------");
		try {
			float result = devide(7, 0);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("cannot divide 0");	
		} finally {
			System.out.println("divide completed!");	
		
	}
}
	public static float devide(int a, int b) {
		return (float) (a / b);
}

	public void question3() {
		System.out.println("----------------------------Question 3------------------------------");
		try {
			int[] ints = {1, 2, 3};
			System.out.println(ints[10]);
		} catch (Exception e) {
		System.out.print(e.getMessage());
		System.out.println("\n");
		}
	}
	
	public void question4() {
		System.out.println("----------------------------Question 4------------------------------");
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(2, "Marketing");
		Department dep3 = new Department(3, "IT");
		Department[] deps = { dep1, dep2, dep3};
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Inser the number of department that you want to get infomation: ");
			int i = sc.nextInt();
			System.out.println(deps[i].toString());
		} catch (Exception e) {
			System.out.println("Cannot find department");
		}
	}
	
	public void question5() {
		System.out.println("----------------------------Question 5------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your age: ");
	
		try {
			int age = sc.nextInt();
			if (age >= 0) {
				System.out.println("Input succeeded");
			} else if (age < 0) {
				System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
			}
		} catch (Exception e) {
			System.out.println("Wrong inputing! Please input an age as int, input again.");
		}
	}
	
	public void question6() {
		System.out.println("----------------------------Question 6------------------------------");
		int age = 0;
		boolean isNotNumber = true;
		while (isNotNumber) {
			System.out.println("Please input your age: ");
			try {
				Scanner sc = new Scanner(System.in);
				age = sc.nextInt();
				isNotNumber = false;
			} catch (Exception e) {
				System.out.println("Wrong inputing! Please input an age as int, input again.");
			}
		}
	}
	
}