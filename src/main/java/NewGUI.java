import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class NewGUI extends Frame implements ActionListener {

    private Label descPasswordLengh;
    private Label descPasswordResult;
    private TextField passwLength;
    private TextField passwFinal;
    private int number = 0;

    public NewGUI(){
        setLayout(new FlowLayout());
        setTitle("Password Generator");
        setSize(300,100);


        descPasswordLengh = new Label("Password length: ");
        add(descPasswordLengh);
        passwLength = new TextField(5);
        passwLength.setEditable(true);
        add(passwLength);

        descPasswordResult = new Label("Password is: ");
        add(descPasswordResult);
        passwFinal = new TextField(10);
        passwFinal.setEditable(false);
        add(passwFinal);
        passwFinal.addActionListener(this::actionPerformed);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt){
            int numberIn = Integer.parseInt(passwLength.getText());
            Input getValue = new Input(numberIn);
            String result = getValue.getCount_value();
            passwFinal.setText(result);
    }



    public static void main(String[] args) {
        NewGUI newGUI = new NewGUI();
    }
}
