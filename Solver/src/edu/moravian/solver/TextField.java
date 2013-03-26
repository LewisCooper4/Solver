package edu.moravian.solver;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class TextField {

    public static void main(String[] args) {
        
        new TextField().run();
        
    }
    
    
    public void run() {
        
        JFrame frame = new JFrame("TextField");
        frame.setSize(220, 220);


        ArrayList<JTextField> list = new ArrayList<>();
        JPanel panel = new JPanel(new FlowLayout());
        //panel.setSize(220, 220);
        panel.setBackground(Color.red);
        
        
        for (int i = 0; i < 36; i++) {
            JTextField field =  new JTextField("x", 2);
            list.add(field);
            
        }
        
        for (int i = 0; i < list.size(); i++) {
            panel.add(list.get(i));
        }
        /*
        JPanel pa = new JPanel();
        pa.add(new JTextField());
        
        frame.getContentPane().add(BorderLayout.NORTH , pa);
        */
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

}