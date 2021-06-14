package com.vti.entity.ex4;
//Ex4_Q1
public class Student {
	//a) Tạo thuộc tính
	private	int		id;
	private	String	name;
	private	String	homeTown;
	private float	score;
	
	//b) Tạo constructor
	public Student(String name, String homeTown) {
		super();
		this.name = name;
		this.homeTown = homeTown;
		this.score = (float) 0;
	}
	//c) Tạo 1 method cho phép set điểm vào
	public void setScore(float score) {
		this.score = score;
	}
	
	//d) Tạo 1 method cho phép cộng thêm điểm
	public void plusScore(float score) {
		this.score = this.score + score;
	}
	
    //e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực 
	//( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 4.0 và < 6.0 thì sẽ in ra là trung bình, 
	//nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	public String toString() {
		String xepLoai = "";
		if (this.score < 4.0) {
			xepLoai = "Yeu";
		} else if (this.score < 6.0) {
			xepLoai = "Trung Binh";
		} else if (this.score < 8.0) {
			xepLoai = "Kha";
		}else {
			xepLoai = "Gioi";
		}
		return "Ten hoc sinh: " + name + " Xep loai: " + xepLoai;
		}
	
}
