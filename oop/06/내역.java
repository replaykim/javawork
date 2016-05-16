package com.company;

/**
 * Created by replay on 2016. 5. 10..
 */
public class 내역 {
    private String 날짜;
    private String 제목;
    private int 금액;
    private String 비고;

    public 내역(String 날짜, String 제목, int 금액, String 비고) {
        this.날짜 = 날짜;
        this.제목 = 제목;
        this.금액 = 금액;
        this.비고 = 비고;
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

