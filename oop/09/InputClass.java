package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class InputDialog extends Dialog implements ActionListener{
    TextField[] dateField, titleField, moneyField, etcField;
    Button submit,cancel;
    Label label;

    String[] date;
    String[] title;
    int[] money;
    String[] etc;

    public InputDialog(Frame parent) {
        super(parent, "입력");
        setLayout(null);

        dateField = new TextField[10];
        titleField = new TextField[10];
        moneyField = new TextField[10];
        etcField = new TextField[10];

        date = new String[10];
        title = new String[10];
        money = new int[10];
        etc = new String[10];

        int y =50;
        for (int i = 0;i<10;i++){
            label = new Label((i+1)+".");
            label.setBounds(10,y,20,20);

            dateField[i] = new TextField(16);
            dateField[i].setBounds(30,y,100,20);

            titleField[i] = new TextField(8);
            titleField[i].setBounds(140,y,100,20);

            moneyField[i] = new TextField(8);
            moneyField[i].setBounds(250,y,100,20);

            etcField[i] = new TextField(8);
            etcField[i].setBounds(360,y,100,20);
            y = y+30;

            add(label);
            add(dateField[i]);
            add(titleField[i]);
            add(moneyField[i]);
            add(etcField[i]);
        }

        label = new Label("날짜");
        label.setBounds(30,30,50,20);
        add(label);

        label = new Label("제목");
        label.setBounds(140,30,50,20);
        add(label);

        label = new Label("금액");
        label.setBounds(250,30,50,20);
        add(label);

        label = new Label("비고");
        label.setBounds(360,30,50,20);
        add(label);

        submit = new Button("확 인");
        submit.setBounds(170,350,50,20);

        cancel = new Button("취 소");
        cancel.setBounds(230,350,50,20);

        add(submit);
        add(cancel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 0; i < 10; i++) {
            date[i] = s_checkNull(dateField[i].getText());
            title[i] = s_checkNull(titleField[i].getText());
            money[i] = i_checkNull(moneyField[i].getText());
            etc[i] = s_checkNull(etcField[i].getText());
        }
        for (int i =0 ;i <10 ; i++) {
            ControlClass.bookClass.registerRecord(date[i], title[i], money[i], etc[i]);
        }
        this.dispose();
    }

    private String s_checkNull(String text) {
        if (text.equals("")) {
            text = "0";
        }
        return text;
    }
    private int i_checkNull(String text) {
        int value;
        if (text.equals("")) {
            text = "0";
        }
        value = Integer.parseInt(text);
        return value;
    }
}

public class InputClass extends Frame implements ActionListener{
    TextField findDateField;
    Button find;
    Label label;
    String findDate;

    public InputClass() {
        super("검색");
        InputDialog inputDialog;
        inputDialog = new InputDialog(this);
        inputDialog.setSize(500,380);
        inputDialog.setVisible(true);
        setLayout(null);
        label = new Label("검색할 날짜 입력");
        label.setBounds(30,40,200,20);

        findDateField = new TextField(10);
        findDateField.setBounds(30,70,100,20);

        find = new Button("찾 기");
        find.setBounds(140,70,50,20);

        add(label);
        add(findDateField);
        add(find);

        setSize(220,150);
        setVisible(true);
        find.addActionListener(this);
    }
    public void actionPerformed(ActionEvent actionEvent){
        RecordClass resultRecord;

        findDate = findDateField.getText();

        ControlClass.bookClass.findRecord(findDate);
        resultRecord = ControlClass.bookClass.getResultRecord();
        new OutputClass(resultRecord.getDate(),resultRecord.getTitle(),resultRecord.getMoney(),resultRecord.getEtc());
    }
}