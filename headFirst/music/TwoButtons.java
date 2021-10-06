import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {
    JFrame frame;
    JLabel label;
    JLabel sst;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());
        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());
        label = new JLabel("I’m a label");
        sst = new JLabel("NIZAMs GUI: Welcome All");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.NORTH, sst);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(label.getText().equals("I’m a label")){
                label.setText("I’ve been clicked,\n Ouch!");
            }else{
                label.setText("I’m a label");
            }
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }
}
