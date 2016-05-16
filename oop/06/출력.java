package com.company;

/**
 * Created by replay on 2016. 5. 10..
 */
public class 출력 {
    private String 날짜;
    private String 제목;
    private int 금액;
    private String 비고;

    public void 출력() {
        System.out.println("날짜 : " + 날짜);
        System.out.println("제목 : " + 제목);
        System.out.println("금액 : " + 금액);
        System.out.println("비고 : " + 비고);
    }

    public void set날짜(String 날짜) {
        this.날짜 = 날짜;
    }

    public void set제목(String 제목) {
        this.제목 = 제목;
    }

    public void set금액(int 금액) {
        this.금액 = 금액;
    }

    public void set비고(String 비고) {
        this.비고 = 비고;
    }
}
