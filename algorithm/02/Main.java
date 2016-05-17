package com.company;

public class Main {
    Input input;
    Output output;
    DayOperation dayOperation;

    public Main() {
        input = new Input();
        output = new Output();
        dayOperation = new DayOperation();
    }

    public void control(){
        input.inputAnniversary();
        input.inputDday();

        dayOperation.setYear(input.getYear());
        dayOperation.setMonth(input.getMonth());
        dayOperation.setDay(input.getDay());
        dayOperation.setdDay(input.getdDay());
        dayOperation.operation();

        output.setYear(dayOperation.getYear());
        output.setMonth(dayOperation.getMonth());
        output.setDay(dayOperation.getDay());
        output.setdDay(dayOperation.getdDay());

        output.print();
    }
    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.control();
    }
}
