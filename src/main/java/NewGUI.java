import java.awt.*;
import java.awt.event.*;

public class NewGUI extends Frame implements ActionListener,WindowListener {

    private Label descPasswordLengh;
    private Label descPasswordResult;
    private TextField passwLength;
    private TextField passwFinal;

    public NewGUI(){
        setLayout(new FlowLayout());
        setTitle("Password Generator");
        setSize(300,100);

        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize(),
                fSize = super.getSize();
        if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }
        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        }
        super.setLocation((sSize.width - fSize.width) / 2,
                (sSize.height - fSize.height) / 2);


        descPasswordLengh = new Label("Password length: ");
        add(descPasswordLengh);
        passwLength = new TextField(5);
        passwLength.setEditable(true);
        add(passwLength);
        passwLength.addActionListener(this);

        descPasswordResult = new Label("Password is: ");
        add(descPasswordResult);
        passwFinal = new TextField(10);
        passwFinal.setEditable(false);
        add(passwFinal);

        setVisible(true);
        addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt){
            int numberIn = Integer.parseInt(passwLength.getText());
            Input getValue = new Input(numberIn);
            String result = getValue.getCount_value();
            passwFinal.setText(result);
    }


    public static void main(String[] args) {
         new NewGUI();
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        super.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
