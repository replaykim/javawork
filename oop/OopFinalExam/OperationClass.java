/**
 * Created by replay on 2016. 6. 20..
 */
public class OperationClass {
    private int[] month;
    private int[] datas;
    private int[] evenDatas, oddDatas;
    private int oddSum, evenSum;
    private int oddMiddle, evenMiddle;
    private int monthday;

    public OperationClass() {
        month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        oddSum = 0;
        evenSum = 0;
    }
    public void sort() {
        int loc, newItem;

        for (int i = 1; i < datas.length; i++) {
            loc = i;
            newItem = datas[i];
            while (loc > 0 && newItem < datas[loc - 1]) {
                datas[loc] = datas[loc - 1];
                loc--;
            }
            datas[loc] = newItem;
        }
    }

    public void oddevenDivide(){
        int count = 0;
        for (int i = 0 ; i < datas.length; i ++) {
            if (datas[i] % 2 ==1){
                count ++;
            }
        }
        oddDatas = new int[count];
        evenDatas  = new int[datas.length-count];
        int oddcount =0 , evencount =0;
        for (int i = 0 ; i<datas.length;i++) {
            if (datas [i] % 2 == 1) {
                oddDatas[oddcount] = datas[i];
                oddcount++;
            }else {
                evenDatas[evencount] = datas[i];
                evencount++;
            }
        }
    }

    public void operationSum(){

        for (int i = 0; i< oddDatas.length;i++){
            oddSum = oddSum + oddDatas[i];
        }

        for (int i = 0; i < evenDatas.length;i++) {
            evenSum = evenSum + evenDatas[i];
        }
    }

    public void middleNumber(){
        oddMiddle = oddDatas[oddDatas.length/2];
        evenMiddle = evenDatas[evenDatas.length/2];
    }

    public void findMonthDay(){
        if (oddMiddle < evenMiddle){
            monthday = (evenMiddle - oddMiddle)%12;
            monthday = month[monthday-1];
        }
        else {
            monthday = (oddMiddle - evenMiddle)%12;
            monthday = month[monthday-1];
        }
    }


    public void setDatas(int[] datas) {
        this.datas = datas;
    }

    public int getOddSum() {
        return oddSum;
    }

    public int getEvenSum() {
        return evenSum;
    }

    public int getOddMiddle() {
        return oddMiddle;
    }

    public int getEvenMiddle() {
        return evenMiddle;
    }

    public int getMonthday() {
        return monthday;
    }
}
