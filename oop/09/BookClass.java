package com.company;

/**
 * Created by replay on 2016. 6. 6..
 */
public class BookClass {
    private RecordClass[] records;
    private RecordClass resultRecord;
    private int count;

    public BookClass(){
        records = new RecordClass[10];
    }

    public void registerRecord(String date, String title, int money, String etc){
        records[count] = new RecordClass(date, title, money, etc);
        count ++;
    }

    public void findRecord(String findDate){
        for (int i = 0; i < 10; i++){
            if (records[i].getDate().equals(findDate)){
                resultRecord = records[i];
            }
        }
    }

    public RecordClass getResultRecord() {
        return resultRecord;
    }
}
