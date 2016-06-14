package com.company;

import com.company.Project06.ControlClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame implements ActionListener{
    private Menu file, first, secondThird, fourth, fifth, help;
    Project01 project01;
    Project02Control project02Control;
    Project03 project03;
    Project04Control project04Control;
    ControlClass controlClass;
    public Main(){
        super("Main View");
        setLayout(null);

        MenuBar bar = new MenuBar();

        file = new Menu("파 일");
        first = new Menu("01");
        secondThird = new Menu("0203");
        fourth= new Menu("04");
        fifth= new Menu("05");
        help = new Menu("도움말");

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
        setSize(500,600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        project01 = new Project01();
        project02Control = new Project02Control();
        project03 = new Project03();
        project04Control = new Project04Control();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("01-1")){
            project01.ex1();
        } else if (e.getActionCommand().equals("01-2")){
            project01.ex2();
        } else if (e.getActionCommand().equals("01-3")){
            project01.ex3();
        } else if (e.getActionCommand().equals("01-4")){
            project01.ex4();
        } else if (e.getActionCommand().equals("02")){
            project02Control.control();
        } else if (e.getActionCommand().equals("03-1")){
            project03.ex1();
        } else if (e.getActionCommand().equals("03-2")){
            project03.ex2();
        } else if (e.getActionCommand().equals("03-3")){
            project03.ex3();
        } else if (e.getActionCommand().equals("03-4")){
            project03.ex4();
        } else if (e.getActionCommand().equals("04-1")){
            project04Control.ex1();
        } else if (e.getActionCommand().equals("04-2")){
            project04Control.ex2();
        } else if (e.getActionCommand().equals("04-3")){
            project04Control.ex3();
        } else if (e.getActionCommand().equals("04-4")){
            project04Control.ex4();
        } else if (e.getActionCommand().equals("04-5")){
            project04Control.ex5();
        } else if (e.getActionCommand().equals("장부처리(글문서)")){

        } else if (e.getActionCommand().equals("장부처리(GUI)")){
            controlClass = new ControlClass();
            controlClass.control();
        } else if (e.getActionCommand().equals("작성자 정보")){

        } else if (e.getActionCommand().equals("작성자 논평")){
        }
    }

    public static void main(String[] args) {
        // write your code here
        new Main();
    }
}
