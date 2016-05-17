package com.company;

/**
 * Created by replay on 2016. 5. 16..
 */
public class Output {
    private int year,month,day;
    private int dDay;

    public void print(){
        System.out.println(dDay+"일 후의 날짜는");
        System.out.println(year+"년 "+month+"월 "+day+"일 "+"입니다.");
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setdDay(int dDay) {
        this.dDay = dDay;
    }
}
