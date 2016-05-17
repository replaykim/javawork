package com.company;

import java.util.Scanner;

/**
 * Created by replay on 2016. 5. 16..
 */
public class Input {
    Scanner scanner;
    private int year,month,day;
    private int dDay;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public void inputAnniversary(){
        System.out.println("기준일 입력");
        System.out.println("년 입력");
        year = scanner.nextInt();
        System.out.println("월 입력");
        month = scanner.nextInt();
        System.out.println("일 입력");
        day = scanner.nextInt();
    }
    public void inputDday(){
        System.out.println("며칠 뒤 날짜를 알아볼까요");
        dDay = scanner.nextInt();
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getdDay() {
        return dDay;
    }
}
