package com.company;

/**
 * Created by replay on 2016-03-30.
 */
public class Sort {
    private int[] numbers;

    public void sort(){
        int loc , newItem;

        for(int i = 1;i<numbers.length;i++){
            loc = i;
            newItem = numbers[i];

            while (loc>0 && newItem > numbers[loc-1]){
                numbers[loc] = numbers[loc-1];
                loc--;
            }
            numbers[loc] = newItem;
        }
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
