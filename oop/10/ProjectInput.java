package com.company;

import java.util.Scanner;

/**
 * Created by replay on 2016. 6. 13..
 */
public class ProjectInput {
    private Scanner scanner;

    public ProjectInput() {
        scanner = new Scanner(System.in);
    }

    public int scanNumber(){
        int privateNmber;
        System.out.println("숫자 입력");
        privateNmber = scanner.nextInt();
        return privateNmber;
    }
    public String scanString(){
        String string;
        System.out.println("문자 입력");
        string = scanner.next();
        return string;
    }
    public int[] scanNumberArray(int howMany) {
        int[] numberArray = new int[howMany];
        for (int i = 0;i<howMany;i++){
            numberArray[i] = scanNumber();
        }
        return numberArray;
    }
}
