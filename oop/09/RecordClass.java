package com.company;

/**
 * Created by replay on 2016. 6. 6..
 */
public class RecordClass {
    private String date;
    private String title;
    private int money;
    private String etc;

    public RecordClass(String date, String title, int money, String etc) {
        this.date = date;
        this.title = title;
        this.money = money;
        this.etc = etc;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public int getMoney() {
        return money;
    }

    public String getEtc() {
        return etc;
    }
}
