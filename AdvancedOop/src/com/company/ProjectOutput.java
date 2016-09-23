package com.company;

/**
 * Created by replay on 2016. 6. 13..
 */
public class ProjectOutput {

    private String 날짜;
    private String 제목;
    private int 금액;
    private String 비고;

    public void project02Output(int sum, int sub, int multi, int divide, int reminder) {
        System.out.println("두 수의 합 : " + sum);
        System.out.println("두 수의 차 : " + sub);
        System.out.println("두 수의 곱 : " + multi);
        System.out.println("두 수의 몫 : " + divide);
        System.out.println("두 수의 나머지 : " + reminder);
    }

    public void arrayOutput(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }

    public void 출력() {
        System.out.println("날짜 : " + 날짜);
        System.out.println("제목 : " + 제목);
        System.out.println("금액 : " + 금액);
        System.out.println("비고 : " + 비고);
        System.out.println();
    }

    public void author() {
        System.out.println("작성자 :  김재현");
        System.out.println("학년 :  3학년");
        System.out.println("학번 :  2011108183");
    }

    public void authorText() {
        System.out.println("한 학기 동안 해뒀던걸 모아보니 생각보다 한 학기동안 굉장히 많은 것을 했다는 것을 알 수 있었다.");
        System.out.println("아직은 많이 조잡하지만 아무리 큰 프로그램이라도 작은 부분부터 " +
                "조금씩 만들어 가다보면 만들 수 있다는 것을 알 수 있었다");
    }

    public void set날짜(String 날짜) {
        this.날짜 = 날짜;
    }

    public void set제목(String 제목) {
        this.제목 = 제목;
    }

    public void set금액(int 금액) {
        this.금액 = 금액;
    }

    public void set비고(String 비고) {
        this.비고 = 비고;
    }
}
