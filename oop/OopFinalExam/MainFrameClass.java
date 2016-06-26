import java.awt.*;

/**
 * Created by replay on 2016. 6. 20..
 */
public class MainFrameClass extends Frame {
    private int[] datas;

    InputClass inputClass;
    OperationClass operationClass;
    OutputClass outputClass;
    howManyClass howManyClass;

    public MainFrameClass() {
        operationClass = new OperationClass();
    }

    public static void main(String[] args) {
        MainFrameClass mainFrameClass = new MainFrameClass();
        mainFrameClass.control();
    }

    public void control() {
        int howmany;
        int oddsum, evensum;
        int oddmiddle, evenmiddle;
        int monthday;

        howManyClass = new howManyClass(this);
        howmany = howManyClass.getHowmany();
        inputClass = new InputClass(this, howmany);
        datas = inputClass.getDatas();

        operationClass.setDatas(datas);
        operationClass.sort();
        operationClass.oddevenDivide();
        operationClass.operationSum();
        operationClass.middleNumber();
        operationClass.findMonthDay();

        oddsum = operationClass.getOddSum();
        evensum = operationClass.getEvenSum();
        oddmiddle = operationClass.getOddMiddle();
        evenmiddle = operationClass.getEvenMiddle();
        monthday = operationClass.getMonthday();

        outputClass = new OutputClass(datas, oddsum, evensum, oddmiddle, evenmiddle, monthday);

    }
}
