package com.company.Project06;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by replay on 2016. 6. 6..
 */
public class OutputClass extends Frame {
    Label label;

    public OutputClass(String date, String title, int money, String etc) {
        super("결과");

        setLayout(null);

        label = new Label("날 짜");
        label.setBounds(20, 40, 30, 20);
        add(label);

        label = new Label(date);
        label.setBounds(50, 40, 200, 20);
        add(label);

        label = new Label("제 목");
        label.setBounds(20, 70, 30, 20);
        add(label);

        label = new Label(title);
        label.setBounds(50, 70, 200, 20);
        add(label);

        label = new Label("금 액");
        label.setBounds(20, 100, 30, 20);
        add(label);

        label = new Label(String.valueOf(money));
        label.setBounds(50, 100, 200, 20);
        add(label);

        label = new Label("비 고");
        label.setBounds(20, 130, 30, 20);
        add(label);

        label = new Label(etc);
        label.setBounds(50, 130, 200, 20);
        add(label);

        setSize(170, 210);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}