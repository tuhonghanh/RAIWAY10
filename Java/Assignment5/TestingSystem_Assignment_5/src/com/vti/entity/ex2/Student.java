package com.vti.entity.ex2;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;
	
	
	public Student(String name, int group) {
		super();
		this.name = name;
		this.group = group;
	}

	
	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}


	public void diemDanh() {
		System.out.println(name + " điểm danh.");
	}
	
	public void hocBai() {
		System.out.println(name + " đang học bài.");
	}
	
	public void donVeSinh() {
		System.out.println(name + " đang dọn vệ sinh.");
	}
}