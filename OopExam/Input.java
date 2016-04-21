package com.company;
import java.util.Scanner;

public class Input {
	Scanner scanner;
	private int month;
	private int date;
	public Input(){
		scanner = new Scanner(System.in);
	}
	
	public void inDate(){
		System.out.println("오늘은 2016년 4월 18일 입니다.4월18일 이후의 날짜까지의 남은 날과 그날의 요일을 출력합니다.");
		System.out.println("월과 입을 입력해주세요");
		System.out.println("월 입력");
		month = scanner.nextInt();
		System.out.println("일 입력");
		date = scanner.nextInt();
	}
	
	public int getdate(){
		return date;
	}
	
	public int getmonth(){
		return month;
	}
}
