package entity;

import java.util.Scanner;

public class Department {
	private int id;
	private String name;
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Department() {
		System.out.println("Input department ID: ");
		id = ScannerUtils.inputInt("Please input a number is int: ");
		System.out.println("Input department name: ");
		name =  ScannerUtils.inputString();
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
}
