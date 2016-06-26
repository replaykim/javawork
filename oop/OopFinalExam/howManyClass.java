import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by replay on 2016. 6. 26..
 */
public class howManyClass extends Dialog implements ActionListener {
    private int howmany;
    private TextField textField;

    public howManyClass(Frame parent) {
        super(parent, "nuber", true);
        setLayout(null);
        setSize(150, 150);
        Label label;

        Button button;

        label = new Label("몇개 입력하실껀가요?");
        label.setBounds(10, 30, 150, 20);
        add(label);

        textField = new TextField(10);
        textField.setBounds(10, 60, 100, 20);
        add(textField);

        button = new Button("확인");
        button.setBounds(50, 100, 50, 20);
        add(button);

        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        howmany = Integer.parseInt(textField.getText());
        dispose();
    }

    public int getHowmany() {
        return howmany;
    }
}