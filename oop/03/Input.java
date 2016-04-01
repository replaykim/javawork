package com.company;

import java.util.Scanner;

/**
 * Created by replay on 2016-03-30.
 */
public class Input {
    private int[] numbers;
    private int how_many;
    private int select;
    Scanner scan;

    public Input() {
        scan = new Scanner(System.in);
    }
    public void whatyouWant(){
        System.out.println("문제를 선택해주세요");
        System.out.println("1. 키보드로부터 n 개의 숫자를 받아들여, 그 합을 구하여 출력하는 프로그램");
        System.out.println("2. 키보드로부터 n 개의 숫자를 받아들여, 제일 큰 수를 찾아 출력하는 프로그램");
        System.out.println("3. 키보드로부터 n 개의 숫자를 받아들여, 홀수와 짝수의 개수를 출력하는 프로그램");
        System.out.println("4. 키보드로부터 n 개의 숫자를 받아들여, 큰 순으로 출력하는 프로그램");
        select = scan.nextInt();
    }
    public void inputHow_many(){
        System.out.println("몇개의 숫자를 입력하실건가요");
        how_many = scan.nextInt();
        numbers = new int[how_many];
    }
    public void inputNumbers(){
        System.out.println(how_many+"개의 숫자를 입력해주세요");
        for (int i =0;i<numbers.length;i++){
            numbers[i]=scan.nextInt();
        }
    }

    public int getSelect() {
        return select;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getHow_many() {
        return how_many;
    }
}
