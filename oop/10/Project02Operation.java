package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class Project02Operation {
    private int sum, sub, multi, divide, reminder;
    public void operation(int number1, int number2){
        sum = number1 + number2;
        sub = number1 - number2;
        multi = number1 * number2;
        divide = number1/number2;
        reminder = number1 % number2;
    }

    public int getSum() {
        return sum;
    }

    public int getSub() {
        return sub;
    }

    public int getMulti() {
        return multi;
    }

    public int getDivide() {
        return divide;
    }

    public int getReminder() {
        return reminder;
    }
}
