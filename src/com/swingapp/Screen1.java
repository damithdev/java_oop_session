package com.swingapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen1 {
    private JButton btnMsg;
    private JPanel panelMain;


    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new Screen1().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Screen1() {
        btnMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }
}
