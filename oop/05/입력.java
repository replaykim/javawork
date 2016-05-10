package com.company;

import java.util.Scanner;

/**
 * Created by replay on 2016. 5. 10..
 */
public class 입력 {
    Scanner scanner;
    private 내역[] 장부;
    private String 날짜;
    private String 제목;
    private int 금액;
    private String 비고;

    public 입력() {
        scanner = new Scanner(System.in);
        장부 = new 내역[10];
    }

    public void 내역_입력() {
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
    }

    public void 내역_등록() {
        int 번호 = 0;
        int 끝;
        do {
            내역_입력();
            장부[번호] = new 내역(날짜,제목,금액,비고);
            번호 ++;
            System.out.println("끝내시려면 -99 계속하시려면 다른키를 누르세요");
            끝 = scanner.nextInt();
        }while (끝 != -99 && 번호==9);

        for (int i = 번호 ; i <10; i++) {
            장부[i] = new 내역("","",0,"");
        }
    }

    public String 날짜_입력() {
        String 비교_날짜;

        System.out.println("찾을 날짜를 입력하세요(yyyymmdd)");
        비교_날짜 = scanner.next();

        return 비교_날짜;
    }

    public 내역[] get장부() {
        return 장부;
    }
}
