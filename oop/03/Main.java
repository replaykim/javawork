package com.company;

public class Main {
    Input input;
    Output output;
    Execute execute;

    public Main() {
        input = new Input();
        output = new Output();
        execute = new Execute();
    }

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.control();
    }
    public void control(){
        int select;
        input.whatyouWant();
        select = input.getSelect();

        input.inputHow_many();
        input.inputNumbers();
        output.setHow_many(input.getHow_many());

        switch (select){
            case 1:execute.excuteSummation();
                break;
            case 2: execute.excuteSearch();
                break;
            case 3:execute.excuteOddeven();
                break;
            case 4:execute.excuteSort();
                break;
        }
    }
}
