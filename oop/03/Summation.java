package com.company;

/**
 * Created by replay on 2016-03-30.
 */
public class Summation {
    private int[] numbers;
    private int sum;
    public void summation(){
        sum= 0;
        for (int i = 0;i<numbers.length;i++) {
            sum = sum + numbers[i];
        }
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getSum() {
        return sum;
    }
}
