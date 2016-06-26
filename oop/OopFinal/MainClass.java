package com.company;

import com.company.Project05.제어자;
import com.company.Project06.ControlClass;

/**
 * Created by replay on 2016. 6. 25..
 */
public class MainClass {
    private Project01 project01;
    private Project02Control project02Control;
    private Project03 project03;
    private Project04Control project04Control;
    private 제어자 project05제어;
    private ControlClass controlClass;
    private ProjectOutput projectOutput;

    public MainClass() {
        project01 = new Project01();
        project02Control = new Project02Control();
        project03 = new Project03();
        project04Control = new Project04Control();
        project05제어 = new 제어자();
        projectOutput = new ProjectOutput();
    }

    public void control(int choose) {
        switch (choose) {

            case 1:
                project01.ex1();

                break;
            case 2:
                project01.ex2();
                break;
            case 3:
                project01.ex3();

                break;
            case 4:
                project01.ex4();

                break;
            case 5:
                project02Control.control();

                break;
            case 6:
                project03.ex1();

                break;
            case 7:
                project03.ex2();

                break;
            case 8:
                project03.ex3();

                break;
            case 9:
                project03.ex4();

                break;
            case 10:
                project04Control.ex1();

                break;
            case 11:
                project04Control.ex2();

                break;
            case 12:
                project04Control.ex3();

                break;
            case 13:
                project04Control.ex4();

                break;
            case 14:
                project04Control.ex5();

                break;
            case 15:
                project05제어.제어();

                break;
            case 16:
                controlClass = new ControlClass();
                controlClass.control();
                break;
            case 17:
                projectOutput.author();
                break;
            case 18:
                projectOutput.authorText();
                break;
        }
    }


    public static void main(String[] args) {
        // write your code here
        new MainFrameClass();

    }
}
