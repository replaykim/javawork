package com.company.Project06;

import com.company.내역;

/**
 * Created by replay on 2016. 6. 6..
 */
public class BookClass {
    private 내역[] records;
    private 내역 resultRecord;
    private int count;

    public BookClass() {
        records = new 내역[10];
    }

    public void registerRecord(String date, String title, int money, String etc) {
        records[count] = new 내역(date, title, money, etc);
        count++;
    }

    public void findRecord(String findDate) {
        for (int i = 0; i < 10; i++) {
            if (records[i].get날짜().equals(findDate)) {
                resultRecord = records[i];
            }
        }
    }

    public 내역 getResultRecord() {
        return resultRecord;
    }
}
