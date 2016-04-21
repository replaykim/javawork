package com.company;

/**
 * Created by replay on 2016-03-30.
 */
public class SearchBignumber {
    private int[] numbers;
    private int bignumber;

    public void search(){
        bignumber = numbers[0];
        for (int i =0 ;i<numbers.length;i++){
            if(bignumber<numbers[i]){
                bignumber = numbers[i];
            }
        }
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getBignumber() {
        return bignumber;
    }
}
