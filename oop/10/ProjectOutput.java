package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class ProjectOutput {
    public void project02Output(int sum, int sub, int multi, int divide, int reminder){
        System.out.println("두 수의 합 : " + sum);
        System.out.println("두 수의 차 : " + sub);
        System.out.println("두 수의 곱 : " + multi);
        System.out.println("두 수의 몫 : " + divide);
        System.out.println("두 수의 나머지 : " + reminder);
    }

    public void arrayOutput(int [] numberArray) {
        for (int i =0 ; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }
    }

}
