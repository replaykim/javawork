package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class Project04Control {
    private ProjectInput projectInput;
    private Project04Operation project04Operation;
    private ProjectOutput projectOutput;
    private int[] numbers;
    public Project04Control() {
        projectInput = new ProjectInput();
        project04Operation = new Project04Operation();
        projectOutput = new ProjectOutput();
    }

    public void ex1() {
        int result;
        input();
        project04Operation.summation();
        result = project04Operation.getSum();
        System.out.println("합은 : " + result);
    }

    public void ex2() {
        int bignumber;
        input();
        project04Operation.search();
        bignumber = project04Operation.getBignumber();
        System.out.println("가장 큰 값은 : " +bignumber);
    }
    public void ex3() {
        int odd,even;
        input();
        project04Operation.oddEvencounting();
        odd = project04Operation.getOddnumber();
        even = project04Operation.getEvennumber();
        System.out.println("홀수의 갯수 : " + odd +"개 짝수의 갯수 : " + even+"개");
    }
    public void ex4() {
        int[] numbers;
        input();
        project04Operation.sort();
        numbers = project04Operation.getNumbers();
        projectOutput.arrayOutput(numbers);
    }
    public void ex5() {
        int choose;
        System.out.println("기능 선택");
        System.out.println("1. 배열 합 출력");
        System.out.println("2. 배열 큰 수 출력");
        System.out.println("3. 배열에서 홀수 짝수 갯수 출력");
        System.out.println("4. 배열의 큰 순으로 출력");
        choose = projectInput.scanNumber();
        switch (choose){
            case 1: ex1();
                break;
            case 2: ex2();
                break;
            case 3: ex3();
                break;
            case 4: ex4();
                break;
            default: System.out.println("잘못된 입력");
        }

    }
    private void input(){
        int howmany;
        System.out.println("얼마나 입력하세요");
        howmany = projectInput.scanNumber();
        numbers = projectInput.scanNumberArray(howmany);
        project04Operation.setNumbers(numbers);
    }

}
