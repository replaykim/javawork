package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class Project04Operation {
    private int[] numbers;
    private int bignumber;
    private int sum;
    private int oddnumber,evennumber;

    public Project04Operation() {
        sum= 0;
    oddnumber=0;
        evennumber=0;
    }

    public void summation(){
                for (int i = 0;i<numbers.length;i++) {
            sum = sum + numbers[i];
        }
    }

    public void search(){
        bignumber = numbers[0];
        for (int i =0 ;i<numbers.length;i++){
            if(bignumber<numbers[i]){
                bignumber = numbers[i];
            }
        }
    }

    public void oddEvencounting(){
        for (int i =0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                evennumber++;
            }
            else{
                oddnumber++;
            }
        }
    }

    public void sort(){
        ProjectUtil projectUtil = new ProjectUtil();
        numbers = projectUtil.sort(numbers);
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getBignumber() {
        return bignumber;
    }

    public int getSum() {
        return sum;
    }

    public int getOddnumber() {
        return oddnumber;
    }

    public int getEvennumber() {
        return evennumber;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
