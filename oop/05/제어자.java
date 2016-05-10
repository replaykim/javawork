package com.company;

public class 제어자 {
    private 내역[] 장부;
    private 입력 입력;
    private 출력 출력;
    private 찾기 찾기;

    public 제어자() {
        입력 = new 입력();
        출력 = new 출력();
        찾기 = new 찾기();
    }

    public void 제어() {
        String 비교_날짜;
        내역 결과_내역;
        String 날짜;
        String 제목;
        int 금액;
        String 비고;

        입력.내역_등록();

        비교_날짜 = 입력.날짜_입력();
        장부 = 입력.get장부();

        찾기.set장부(장부);
        찾기.날짜_얻기(비교_날짜);

        결과_내역 = 찾기.get결과_내역();

        날짜 = 결과_내역.get날짜();
        제목 = 결과_내역.get제목();
        금액 = 결과_내역.get금액();
        비고 = 결과_내역.get비고();

        출력.set날짜(날짜);
        출력.set제목(제목);
        출력.set금액(금액);
        출력.set비고(비고);
        출력.출력();
    }

    public static void main(String[] args) {
	// write your code here
        제어자 제어자 = new 제어자();
        제어자.제어();
    }
}