//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SimpleGui1 implements ActionListener {
//    JButton button;
//    Input input;
//    JTextField jTextField;
//
//    public static void main(String[] args) {
//        SimpleGui1 gui = new SimpleGui1();
//        gui.go();
//    }
//
//    public void go() {
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 400);
//        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize(),
//                fSize = frame.getSize();
//        if (fSize.height > sSize.height) {
//            fSize.height = sSize.height;
//        }
//        if (fSize.width > sSize.width) {
//            fSize.width = sSize.width;
//        }
//        frame.setLocation((sSize.width - fSize.width) / 2,
//                (sSize.height - fSize.height) / 2);
//
//        jTextField = new JTextField();
//        frame.getContentPane().add(jTextField);
//        jTextField.addActionListener(this);
//
//
//        frame.getContentPane().add(BorderLayout.SOUTH, button);
//        frame.getContentPane().add(BorderLayout.CENTER, jTextField);
//
//        frame.setVisible(true);
//
//
//    }
//}