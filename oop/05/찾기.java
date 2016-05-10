package com.company;

/**
 * Created by replay on 2016. 5. 10..
 */
public class 찾기 {
    private 내역[] 장부;
    private 내역 결과_내역;

    public void 날짜_얻기(String 날짜) {
        for (int i = 0 ; i < 장부.length; i++){
            String 비교_날짜 = 장부[i].get날짜();

            if (날짜.equals(비교_날짜)){
                결과_내역 = 장부[i];
            }
        }
    }

    public void set장부(내역[] 장부) {
        this.장부 = 장부;
    }

    public 내역 get결과_내역() {
        return 결과_내역;
    }
}
