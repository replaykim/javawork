package com.company;

import java.util.Scanner;

/**
 * Created by replay on 2016. 6. 13..
 */
public class Project01 {
    private int number1, number2;
    private String name;
    private ProjectInput projectInput;

    public Project01() {
        projectInput = new ProjectInput();
    }

    public void ex1() {
        number1 = projectInput.scanNumber();
        System.out.println(number1);
    }

    public void ex2() {
        number1 = projectInput.scanNumber();
        number2 = projectInput.scanNumber();
        System.out.println(number1);
        System.out.println(number2);
    }

    public void ex3() {
        name = projectInput.scanString();
        number1 = projectInput.scanNumber();
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + number1);
    }

    public void ex4() {
        number1 = projectInput.scanNumber();
        number2 = projectInput.scanNumber();
        System.out.println("두 수의 합 : " + (number1 + number2));
        System.out.println("두 수의 차 : " + (number1 - number2));
        System.out.println("두 수의 곱 : " + (number1 * number2));
        System.out.println("두 수의 몫 : " + (number1 / number2));
        System.out.println("두 수의 나머지 : " + (number1 % number2));
    }

}
