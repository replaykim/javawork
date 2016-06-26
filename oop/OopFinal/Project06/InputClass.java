package com.company.Project06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InputClass extends Dialog implements ActionListener {
    TextField[] dateField, titleField, moneyField, etcField;

    String[] date;
    String[] title;
    int[] money;
    String[] etc;

    public InputClass(Frame parent) {
        super(parent, "입력", true);
        setLayout(null);

        Button submit, cancel;
        Label label;

        dateField = new TextField[10];
        titleField = new TextField[10];
        moneyField = new TextField[10];
        etcField = new TextField[10];

        date = new String[10];
        title = new String[10];
        money = new int[10];
        etc = new String[10];

        int y = 50;
        for (int i = 0; i < 10; i++) {
            label = new Label((i + 1) + ".");
            label.setBounds(10, y, 20, 20);

            dateField[i] = new TextField(16);
            titleField[i] = new TextField(8);
            moneyField[i] = new TextField(8);
            etcField[i] = new TextField(8);

            dateField[i].setBounds(30, y, 100, 20);
            titleField[i].setBounds(140, y, 100, 20);
            moneyField[i].setBounds(250, y, 100, 20);
            etcField[i].setBounds(360, y, 100, 20);

            y = y + 30;

            add(label);
            add(dateField[i]);
            add(titleField[i]);
            add(moneyField[i]);
            add(etcField[i]);
        }

        label = new Label("날짜");
        label.setBounds(30, 30, 50, 20);
        add(label);

        label = new Label("제목");
        label.setBounds(140, 30, 50, 20);
        add(label);

        label = new Label("금액");
        label.setBounds(250, 30, 50, 20);
        add(label);

        label = new Label("비고");
        label.setBounds(360, 30, 50, 20);
        add(label);

        submit = new Button("확 인");
        submit.setBounds(170, 350, 50, 20);

        cancel = new Button("취 소");
        cancel.setBounds(230, 350, 50, 20);

        add(submit);
        add(cancel);

        submit.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 0; i < 10; i++) {
            date[i] = s_checkNull(dateField[i].getText());
            title[i] = s_checkNull(titleField[i].getText());
            money[i] = i_checkNull(moneyField[i].getText());
            etc[i] = s_checkNull(etcField[i].getText());
        }
        this.dispose();
    }

    public String[] getDate() {
        return date;
    }

    public String[] gettitle() {
        return title;
    }

    public int[] getMoney() {
        return money;
    }

    public String[] getEtc() {
        return etc;
    }


    // 널값을 지우고 디폴트값 0을 넣는다
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

