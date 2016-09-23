package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrameClass extends Frame implements ActionListener {
    private Menu file, first, secondThird, fourth, fifth, help;
    private MainClass mainClass;
    private Label label;
    public MainFrameClass() {
        super("MainFrameClass View");
        setLayout(null);

        MenuBar bar = new MenuBar();
        mainClass = new MainClass();
        file = new Menu("파 일");
        first = new Menu("01");
        secondThird = new Menu("0203");
        fourth = new Menu("04");
        fifth = new Menu("05");
        help = new Menu("도움말");

        label = new Label("Java Study");
        label.setBounds(20, 30, 100, 20);
        add(label);

        file.add("불러오기");
        file.add("저장하기");
        file.add("끝내기");

        first.add("01-1");
        first.add("01-2");
        first.add("01-3");
        first.add("01-4");

        secondThird.add("02");
        secondThird.add("03-1");
        secondThird.add("03-2");
        secondThird.add("03-3");
        secondThird.add("03-4");

        fourth.add("04-1");
        fourth.add("04-2");
        fourth.add("04-3");
        fourth.add("04-4");
        fourth.add("04-5");

        fifth.add("장부처리(글문서)");
        fifth.add("장부처리(GUI)");

        help.add("작성자 정보");
        help.add("작성자 논평");

        bar.add(file);
        bar.add(first);
        bar.add(secondThird);
        bar.add(fourth);
        bar.add(fifth);
        bar.add(help);

        first.addActionListener(this);
        secondThird.addActionListener(this);
        fourth.addActionListener(this);
        fifth.addActionListener(this);
        help.addActionListener(this);

        setMenuBar(bar);
        setSize(500, 600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("01-1")) {
            mainClass.control(1);
        } else if (e.getActionCommand().equals("01-2")) {
            mainClass.control(2);

        } else if (e.getActionCommand().equals("01-3")) {
            mainClass.control(3);

        } else if (e.getActionCommand().equals("01-4")) {
            mainClass.control(4);

        } else if (e.getActionCommand().equals("02")) {
            mainClass.control(5);

        } else if (e.getActionCommand().equals("03-1")) {
            mainClass.control(6);

        } else if (e.getActionCommand().equals("03-2")) {
            mainClass.control(7);

        } else if (e.getActionCommand().equals("03-3")) {
            mainClass.control(8);

        } else if (e.getActionCommand().equals("03-4")) {
            mainClass.control(9);

        } else if (e.getActionCommand().equals("04-1")) {
            mainClass.control(10);

        } else if (e.getActionCommand().equals("04-2")) {
            mainClass.control(11);

        } else if (e.getActionCommand().equals("04-3")) {
            mainClass.control(12);

        } else if (e.getActionCommand().equals("04-4")) {
            mainClass.control(13);

        } else if (e.getActionCommand().equals("04-5")) {
            mainClass.control(14);

        } else if (e.getActionCommand().equals("장부처리(글문서)")) {
            mainClass.control(15);

        } else if (e.getActionCommand().equals("장부처리(GUI)")) {
            mainClass.control(16);

        } else if (e.getActionCommand().equals("작성자 정보")) {
            mainClass.control(17);

        } else if (e.getActionCommand().equals("작성자 논평")) {
            mainClass.control(18);

        }
    }

}
