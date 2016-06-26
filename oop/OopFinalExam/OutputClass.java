import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by replay on 2016. 6. 20..
 */
public class OutputClass extends Frame implements ActionListener{
    private int[] datas;
    private int oddSum, evenSum;
    private int oddMiddle, evenMiddle;
    private int monthday;

    public OutputClass(int[] datas, int oddSum,int evenSum,int oddMiddle,int evenMiddle,int monthday) {
        super("Output");
        this.datas = datas;
        this.oddSum = oddSum;
        this.evenSum = evenSum;
        this.oddMiddle = oddMiddle;
        this.evenMiddle = evenMiddle;
        this.monthday = monthday;
        setLayout(null);
        setSize(300,300);

        Label label;
        Button button;

        label = new Label("입력자료");
        label.setBounds(30,40,100,20);
        add(label);
        int x = 30;
        for (int i = 0; i < datas.length; i ++) {
            label = new Label(String.valueOf(datas[i]));
            label.setBounds(x,70,20,20);
            add(label);
            x = x + 25;
        }

        label = new Label("홀수 합계 : " +oddSum);
        label.setBounds(30, 100,100, 20);
        add(label);

        label = new Label("짝수 합계 : " + evenSum);
        label.setBounds(130, 100,100,20);
        add(label);

        label = new Label("홀수 중간수 : " +oddMiddle);
        label.setBounds(30, 130,100, 20);
        add(label);

        label = new Label("짝수 중간수  : " + evenMiddle);
        label.setBounds(130, 130,100,20);
        add(label);

        label = new Label("월 날 수  : " + monthday);
        label.setBounds(30, 160, 100,20);
        add(label);

        button = new Button("확 인");
        button.setBounds(130, 200, 100,20);
        add(button);

        button.addActionListener(this);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }

}
