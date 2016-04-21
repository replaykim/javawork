package com.company;

/**
 * Created by replay on 2016-03-30.
 */
public class Output {
    private int how_many;
    private int sum;
    private int bignumber;
    private int oddnumber,evennumber;
    private int[] sortNumbers;
    public void printSumation(){
        System.out.println(how_many+"개의 숫자의 모든 합은"+sum+"입니다.");
    }
    public void printBignumber(){
        System.out.println(how_many+"개의 숫자중 가장 큰 숫자는"+bignumber+"입니다");
    }
    public void printoddeven(){
        System.out.println(how_many+"개의 숫자중 홀수 숫자의 갯수는"+oddnumber+"개 짝수숫자의 갯수는 "+evennumber+"개 입니다.");
    }
    public void printSort(){
        System.out.println("정렬된 숫자");
        for (int i = 0;i<sortNumbers.length;i++){
            System.out.print(sortNumbers[i]+" ");
        }
    }

    public void setSortNumbers(int[] sortNumbers) {
        this.sortNumbers = sortNumbers;
    }

    public void setOddnumber(int oddnumber) {
        this.oddnumber = oddnumber;
    }

    public void setEvennumber(int evennumber) {
        this.evennumber = evennumber;
    }

    public void setBignumber(int bignumber) {
        this.bignumber = bignumber;
    }

    public void setHow_many(int how_many) {
        this.how_many = how_many;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
