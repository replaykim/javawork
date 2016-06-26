import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by replay on 2016. 6. 20..
 */
public class InputClass extends Dialog implements ActionListener {
    private int[] datas;
    private int count;


    TextField textField;

    public InputClass(Frame parent, int howmany) {
        super(parent, "inputButton",true);
        count = 0;

        datas = new int[howmany];
        setLayout(null);
        setSize(150, 150);

        Label label;
        Button inputButton, endButton;

        label = new Label("두 자리 정수 입력");
        label.setBounds(30, 30, 100, 20);

        textField = new TextField(8);
        textField.setBounds(30, 60, 100, 20);

        inputButton = new Button("입력");
        inputButton.setBounds(30, 90, 50, 20);

        endButton = new Button("종료");
        endButton.setBounds(80, 90, 50, 20);

        add(label);
        add(textField);
        add(inputButton);
        add(endButton);

        inputButton.addActionListener(this);
        endButton.addActionListener(this);

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

            if (e.getActionCommand().equals("입력")) {
                datas[count] = Integer.parseInt(textField.getText());
                count++;
                textField.setText("");
            } else {
                dispose();
            }
        if (count == datas.length){
            dispose();
        }
    }

    public int[] getDatas() {
        return datas;
    }
}

