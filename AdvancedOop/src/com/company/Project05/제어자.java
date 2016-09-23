package com.company.Project05;

import com.company.ProjectInput;
import com.company.ProjectOutput;
import com.company.내역;

public class 제어자 {
    private 장부 장부;
    private ProjectInput projectInput;
    private ProjectOutput projectOutput;


    public 제어자() {
        projectInput = new ProjectInput();
        projectOutput = new ProjectOutput();
        장부 = new 장부();
    }

    public void 제어() {
        boolean 끝;
        String 날짜;
        String 제목;
        int 금액;
        String 비고;
        내역 최대, 최소;
        do {

            끝 = projectInput.내역_입력();
            날짜 = projectInput.get날짜();
            제목 = projectInput.get제목();
            금액 = projectInput.get금액();
            비고 = projectInput.get비고();
            장부.내역_등록(날짜, 제목, 금액, 비고);
        } while (끝);

        장부.최대금액_얻기();
        최대 = 장부.get최대_결과_내역();
        자료_얻기_출력(최대);

        장부.최소금액_얻기();
        최소 = 장부.get최소_결과_내역();
        자료_얻기_출력(최소);
    }

    private void 자료_얻기_출력(내역 내역) {
        String 날짜;
        String 제목;
        int 금액;
        String 비고;

        날짜 = 내역.get날짜();
        제목 = 내역.get제목();
        금액 = 내역.get금액();
        비고 = 내역.get비고();
        projectOutput.set날짜(날짜);
        projectOutput.set제목(제목);
        projectOutput.set금액(금액);
        projectOutput.set비고(비고);
        projectOutput.출력();
    }
}