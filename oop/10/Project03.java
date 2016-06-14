package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class Project03 {
    private ProjectInput projectInput;
    private ProjectUtil projectUtil;
    private ProjectOutput projectOutput;
    private int number1,number2;
    private int[] numberArray;
    private boolean check;

    public Project03() {
        projectInput = new ProjectInput();
        projectUtil = new ProjectUtil();
        projectOutput = new ProjectOutput();
        numberArray = new int[3];
        check = true;
    }

    public void ex1(){
        while (check) {
            number1 = projectInput.scanNumber();
            checknumber(number1);
        }
        for (int i =1 ; i< 10;i++){
            System.out.println(number1 +" X "+i+" = " + (number1*i));
        }
    }
    public void ex2(){
        number1 = projectInput.scanNumber();
        number2 = projectInput.scanNumber();

        if (number1 < number2){
            System.out.println("큰  수 : "+number2+"작은 수 : " + number1);
        }else{
            System.out.println("큰  수 : "+number1+"작은 수 : " + number2);
        }
    }
    public void ex3(){
        for (int i = 0 ; i < 3 ; i++){
            numberArray[i] = projectInput.scanNumber();
        }
        numberArray = projectUtil.sort(numberArray);
        projectOutput.arrayOutput(numberArray);
    }
    public void ex4(){
        int sum =0 ;
        while (check) {
            number1 = projectInput.scanNumber();
            checknumber(number1);
        }

        if (number1 % 2 ==1){
            for (int i =1 ; i< 10;i++){
                System.out.println(number1 +" X "+i+" = " + (number1*i));
            }
        }else{
            for (int i = 1 ; i <= (number1*10) ; i ++){
                sum = sum + i;
            }
            System.out.println("합 : "+ sum);
        }
    }
    //숫자가 1~10인지 검사
    private boolean checknumber(int number) {
        if (0 < number && number > 10){
            check =  true;
            System.out.println("잘못된 입력");
        }else{
            check = false;
        }
        return check;
    }
}
