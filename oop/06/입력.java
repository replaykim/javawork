package com.company;

import java.util.Scanner;

/**
 * Created by replay on 2016. 5. 10..
 */
public class 입력 {
    Scanner scanner;
    private String 날짜;
    private String 제목;
    private int 금액;
    private String 비고;

    public 입력() {
        scanner = new Scanner(System.in);
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
        비고 =  scanner.next();

        System.out.println("종료하실려면 -99를 입력하세요");
        종료숫자 = scanner.nextInt();
        if (종료숫자 == -99){
            끝 = false;
        }
        return 끝;
    }

    public String 날짜_입력() {
        String 비교_날짜;

        System.out.println("찾을 날짜를 입력하세요(yyyymmdd)");
        비교_날짜 = scanner.next();

        return 비교_날짜;
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
