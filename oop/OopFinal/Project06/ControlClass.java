package com.company.Project06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.company.내역;

/**
 * Created by replay on 2016. 6. 6..
 */
public class ControlClass extends Frame implements ActionListener {
    public static BookClass bookClass;
    private InputClass inputClass;

    private TextField findDateField;
    private Button find;
    private Label label;
    private String findDate;

    private String[] date;
    private String[] title;
    private int[] money;
    private String[] etc;

    public ControlClass() {
        super("검색");

        inputClass = new InputClass(this);
        bookClass = new BookClass();

        inputClass.setSize(500, 380);
        inputClass.setVisible(true);
        setLayout(null);

        label = new Label("검색할 날짜 입력");
        label.setBounds(30, 40, 200, 20);

        findDateField = new TextField(10);
        findDateField.setBounds(30, 70, 100, 20);

        find = new Button("찾 기");
        find.setBounds(140, 70, 50, 20);

        add(label);
        add(findDateField);
        add(find);

        setSize(220, 150);
        setVisible(true);
        find.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        내역 resultRecord;
        String date, title, etc;
        int money;

        findDate = findDateField.getText();

        bookClass.findRecord(findDate);
        resultRecord = bookClass.getResultRecord();

        date = resultRecord.get날짜();
        title = resultRecord.get제목();
        money = resultRecord.get금액();
        etc = resultRecord.get비고();
        new OutputClass(date, title, money, etc);
        dispose();
    }

    public void control() {
        date = inputClass.getDate();
        title = inputClass.gettitle();
        money = inputClass.getMoney();
        etc = inputClass.getEtc();

        for (int i = 0; i < 10; i++) {
            bookClass.registerRecord(date[i], title[i], money[i], etc[i]);
        }
    }
}
