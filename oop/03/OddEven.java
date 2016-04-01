package com.company;

/**
 * Created by replay on 2016-03-30.
 */
public class OddEven {
    private int[] numbers;
    private int oddnumber,evennumber;

    public OddEven() {
        oddnumber = 0;
        evennumber = 0;
    }

    public void counting(){
        for (int i =0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                evennumber++;
            }
            else{
                oddnumber++;
            }
        }
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getOddnumber() {
        return oddnumber;
    }

    public int getEvennumber() {
        return evennumber;
    }
}
