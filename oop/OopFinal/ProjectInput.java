package com.company;

import java.util.Scanner;

/**
 * Created by replay on 2016. 6. 13..
 */
public class ProjectInput {
    private Scanner scanner;

    private String 날짜;
    private String 제목;
    private int 금액;
    private String 비고;

    public ProjectInput() {
        scanner = new Scanner(System.in);
    }

    public int scanNumber() {
        int privateNmber;
        System.out.println("숫자 입력");
        privateNmber = scanner.nextInt();
        return privateNmber;
    }

    public String scanString() {
        String string;
        System.out.println("문자 입력");
        string = scanner.next();
        return string;
    }

    public int[] scanNumberArray(int howMany) {
        int[] numberArray = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            numberArray[i] = scanNumber();
        }
        return numberArray;
    }

    public boolean 내역_입력() {
        int 종료숫자;
        boolean 끝 = true;
        System.out.println("장부에 입력합니다.");
        System.out.println();
        System.out.println("날짜를 입력하세요(yyyymmdd)");
        날짜 = scanner.next();
        System.out.println("제목을 입력하세요.");
        제목 = scanner.next();
        System.out.println("금액을 입력하세요.");
        금액 = scanner.nextInt();
        System.out.println("비고을 입력하세요.");
        비고 = scanner.next();

        System.out.println("종료하실려면 -99를 입력하세요");
        종료숫자 = scanner.nextInt();
        if (종료숫자 == -99) {
            끝 = false;
        }
        return 끝;
    }

    public String get날짜() {
        return 날짜;
    }

    public String get제목() {
        return 제목;
    }

    public int get금액() {
        return 금액;
    }

    public String get비고() {
        return 비고;
    }
}
