package entity;

import java.util.Scanner;

// Question 7_8
public class ScannerUtils {
	private static Scanner sc = new Scanner(System.in);
		
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(sc.next().trim());
			} catch (Exception e) {
				System.out.println(errorMessage);
			}
		}
	}
	
	public static float inputFloat() {
		while (true) {
			try {
				return Float.parseFloat(sc.next().trim());
			} catch (Exception e) {
				System.out.println("Please input again.");
			}
		}
	}
	
	public static double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(sc.next().trim());
			} catch (Exception e) {
				System.out.println("Please input again.");
			}
		}
	}
	
	public static String inputString() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();
			if (input.isEmpty()) {
				System.out.println("Please input again.");;
			} else {
				return input;
		}
	}
}
	
}
