package com.vti.backend.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.ex1.News;

public class Exercise1 {
	Scanner sc = new Scanner(System.in);
	static ArrayList<News> listNews;
	
	public void question1() {
		System.out.println("------------ * * * -------------------------");
		
		int idChucnang = 0;
		while (idChucnang != 4) {
		
		System.out.println("1. Insert news");
		System.out.println("2. View list news.");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
		System.out.println("Moi ban nhap vao chuc nang: ");
				
		idChucnang = sc.nextInt();
		switch (idChucnang) {
		case 1:
			insertNews();
			break;
		case 2:
			viewListNews();
			break;
		case 3:
			averageRate();
			break;
		case 5:
			System.out.println("Cam on ban da su dung dich vu, xin chao va hen gap lai!!");;
			break;
		default:
			System.out.println("Alarm: Ban chua chon dung so tren menu");
			break;
		}
	}
}		
	
	public static void insertNews() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao Title");
		String title = sc.next();
		System.out.println("Nhap vao PublishDate");
		String publishDate = sc.next();
		System.out.println("Nhap vao Author");
		String author = sc.next();
		System.out.println("Nhập vào Content");
		String content = sc.next();
		System.out.println("Nhập vào đánh giá 1");
		int rate1 = sc.nextInt();
		System.out.println("Nhập vào đánh giá 2");
		int rate2 = sc.nextInt();
		System.out.println("Nhập vào đánh giá 3");
		int rate3 = sc.nextInt();
		int[] rates = { rate1, rate2, rate3 };
		News news = new News(title, publishDate, author, content, rates);
		listNews.add(news);
	}
	
	public static void viewListNews() {
		for (News news1 : listNews) {
		news1.display();
		}
	}	
	
	public static void averageRate() {
		System.out.println("Đánh giá trung bình Rate");
		for (News news1 : listNews) {
		System.out.println("Title: " + news1.getTitle()
		+ " RateAVG: " + news1.calculate());
		}
		
			
}
}
