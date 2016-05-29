package com.company;

import java.awt.*;

class InputDialog extends Dialog{
    TextField[] date, title, money, etc;
    Button submit,cancel;
    Label label;


    public InputDialog(Frame parent) {
        super(parent, "Input");
        setLayout(null);

        date = new TextField[10];
        title = new TextField[10];
        money = new TextField[10];
        etc = new TextField[10];

        label = new Label("1.");
        label.setBounds(10,50,15,20);
        add(label);
        label = new Label("2.");
        label.setBounds(10,70,15,20);
        add(label);
        label = new Label("3.");
        label.setBounds(10,90,15,20);
        add(label);
        label = new Label("4.");
        label.setBounds(10,110,15,20);
        add(label);
        label = new Label("5.");
        label.setBounds(10,130,15,20);
        add(label);
        label = new Label("6.");
        label.setBounds(10,150,15,20);
        add(label);
        label = new Label("7.");
        label.setBounds(10,170,15,20);
        add(label);
        label = new Label("8.");
        label.setBounds(10,190,15,20);
        add(label);
        label = new Label("9.");
        label.setBounds(10,210,15,20);
        add(label);
        label = new Label("10.");
        label.setBounds(5,230,20,20);
        add(label);


        label = new Label("날짜");
        label.setBounds(30,30,50,20);
        add(label);
        date[0] = new TextField(8);
        date[0].setBounds(30,50,50,20);
        date[1] = new TextField(8);
        date[1].setBounds(30,70,50,20);
        date[2] = new TextField(8);
        date[2].setBounds(30,90,50,20);
        date[3] = new TextField(8);
        date[3].setBounds(30,110,50,20);
        date[4] = new TextField(8);
        date[4].setBounds(30,130,50,20);
        date[5] = new TextField(8);
        date[5].setBounds(30,150,50,20);
        date[6] = new TextField(8);
        date[6].setBounds(30,170,50,20);
        date[7] = new TextField(8);
        date[7].setBounds(30,190,50,20);
        date[8] = new TextField(8);
        date[8].setBounds(30,210,50,20);
        date[9] = new TextField(8);
        date[9].setBounds(30,230,50,20);


        label = new Label("제목");
        label.setBounds(110,30,50,20);
        add(label);
        title[0] = new TextField(8);
        title[0].setBounds(110,50,50,20);
        title[1] = new TextField(8);
        title[1].setBounds(110,70,50,20);
        title[2] = new TextField(8);
        title[2].setBounds(110,90,50,20);
        title[3] = new TextField(8);
        title[3].setBounds(110,110,50,20);
        title[4] = new TextField(8);
        title[4].setBounds(110,130,50,20);
        title[5] = new TextField(8);
        title[5].setBounds(110,150,50,20);
        title[6] = new TextField(8);
        title[6].setBounds(110,170,50,20);
        title[7] = new TextField(8);
        title[7].setBounds(110,190,50,20);
        title[8] = new TextField(8);
        title[8].setBounds(110,210,50,20);
        title[9] = new TextField(8);
        title[9].setBounds(110,230,50,20);

        label = new Label("금액");
        label.setBounds(190,30,50,20);
        add(label);
        money[0] = new TextField(8);
        money[0].setBounds(190,50,50,20);
        money[1] = new TextField(8);
        money[1].setBounds(190,70,50,20);
        money[2] = new TextField(8);
        money[2].setBounds(190,90,50,20);
        money[3] = new TextField(8);
        money[3].setBounds(190,110,50,20);
        money[4] = new TextField(8);
        money[4].setBounds(190,130,50,20);
        money[5] = new TextField(8);
        money[5].setBounds(190,150,50,20);
        money[6] = new TextField(8);
        money[6].setBounds(190,170,50,20);
        money[7] = new TextField(8);
        money[7].setBounds(190,190,50,20);
        money[8] = new TextField(8);
        money[8].setBounds(190,210,50,20);
        money[9] = new TextField(8);
        money[9].setBounds(190,230,50,20);

        label = new Label("비고");
        label.setBounds(280,30,50,20);
        add(label);
        etc[0] = new TextField(8);
        etc[0].setBounds(280,50,50,20);
        etc[1] = new TextField(8);
        etc[1].setBounds(280,70,50,20);
        etc[2] = new TextField(8);
        etc[2].setBounds(280,90,50,20);
        etc[3] = new TextField(8);
        etc[3].setBounds(280,110,50,20);
        etc[4] = new TextField(8);
        etc[4].setBounds(280,130,50,20);
        etc[5] = new TextField(8);
        etc[5].setBounds(280,150,50,20);
        etc[6] = new TextField(8);
        etc[6].setBounds(280,170,50,20);
        etc[7] = new TextField(8);
        etc[7].setBounds(280,190,50,20);
        etc[8] = new TextField(8);
        etc[8].setBounds(280,210,50,20);
        etc[9] = new TextField(8);
        etc[9].setBounds(280,230,50,20);


        submit = new Button("확 인");
        submit.setBounds(170,300,50,20);

        cancel = new Button("취 소");
        cancel.setBounds(230,300,50,20);


        for (int i =0 ; i<10; i++) {
            add(date[i]);
            add(title[i]);
            add(money[i]);
            add(etc[i]);
        }
        add(submit);
        add(cancel);
    }
}

class OutputClass extends Frame{
    Label label;
    public OutputClass(String date, String title, int money, String etc){
        super("결과");

        label = new Label(date);
        label.setBounds(30,30,200,20);
        add(label);

        label = new Label(title);
        label.setBounds(30,60,200,20);
        add(label);

        label = new Label(String.valueOf(money));
        label.setBounds(30,90,200,20);
        add(label);
        
        label = new Label(etc);
        label.setBounds(30,120,200,20);
        add(label);

    }
}

public class GuiClass extends Frame{

    public GuiClass() {
        InputDialog inputDialog;
        inputDialog = new InputDialog(this);
        inputDialog.setSize(500,350);
        inputDialog.setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
        GuiClass guiClass = new GuiClass();
        guiClass.setSize(700,700);
        guiClass.setVisible(true);

//        OutputClass ou = new OutputClass("20111011","금액",50000,"으아");
//        ou.setSize(300,500);
//        ou.setVisible(true);
    }
}