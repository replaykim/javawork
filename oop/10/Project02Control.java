package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class Project02Control {
    Project02Operation project02Operation;
    ProjectInput projectInput;
    ProjectOutput projectOutput;
    public Project02Control() {
        project02Operation = new Project02Operation();
        projectInput = new ProjectInput();
        projectOutput = new ProjectOutput();
    }

    public void control(){
        int number1, number2;
        int sum, sub, multi, divide, reminder;

        number1 = projectInput.scanNumber();
        number2 = projectInput.scanNumber();
        project02Operation.operation(number1,number2);

        sum = project02Operation.getSum();
        sub = project02Operation.getSub();
        multi = project02Operation.getMulti();
        divide = project02Operation.getDivide();
        reminder = project02Operation.getReminder();

        projectOutput.project02Output(sum,sub,multi,divide,reminder);
    }
}
