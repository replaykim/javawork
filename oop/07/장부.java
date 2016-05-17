package OopPackage;

/**
 * Created by replay on 2016. 5. 10..
 */
public class 장부 {
    private 내역[] 장부;
    private 내역 최대_결과_내역;
    private 내역 최소_결과_내역;
    private int 번호;

    public 장부() {
        장부  = new 내역[10];
    }

    public void 내역_등록(String 날짜, String 제목 , int 금액, String 비고) {
            장부[번호] = new 내역(날짜,제목,금액,비고);
            번호 ++;
        for (int i = 번호;i<장부.length;i++){
            장부[i] = new 내역("","",0,"");
        }
    }

    public void 최대금액_얻기() {
        int 임시, 최대금액;
        최대_결과_내역 = 장부[0];
        최대금액 = 장부[0].get금액();
        for (int i = 0 ; i < 장부.length; i++){
            임시 = 장부[i].get금액();
            if (최대금액 < 임시){
                최대_결과_내역 = 장부[i];
            }
        }
    }

    public void 최소금액_얻기(){
        int 임시, 최소금액;
        최소_결과_내역 = 장부[0];
        최소금액 = 장부[0].get금액();
        for (int i = 0 ; i < 장부.length; i++){
            임시 = 장부[i].get금액();
            if (임시 != 0) {
                if (최소금액 > 임시) {
                    최소_결과_내역 = 장부[i];
                }
            }
        }
    }

    public void set장부(내역[] 장부) {
        this.장부 = 장부;
    }

    public 내역 get최소_결과_내역() {
        return 최소_결과_내역;
    }

    public 내역 get최대_결과_내역() {
        return 최대_결과_내역;
    }
}
