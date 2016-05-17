package com.company;

/**
 * Created by replay on 2016. 5. 16..
 */
public class DayOperation {
    private int[] dayPerMonth;
    private int year,month,day;
    private int dDay;

    public DayOperation() {
        dayPerMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    }

    public void operation(){
        day = day + dDay;

        while (day > dayPerMonth[month-1]){
            leapYear(year);
            day = day - dayPerMonth[month-1];
            month++;
            if (month == 13){
                month = 1;
                year++;
            }
        }
    }


    //해당 연도 윤년인지 판단
    private void leapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            dayPerMonth[1]=29;
        }
        else{
            dayPerMonth[1]=28;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getdDay() {
        return dDay;
    }

    public void setdDay(int dDay) {
        this.dDay = dDay;
    }
}
