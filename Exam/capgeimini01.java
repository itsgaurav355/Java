package com.Exam;

// Java program to create frames
// using association

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class capgeimini01
{
    JFrame frame;

    capgeimini01()
    {
        // creating instance of JFrame with name "first way"
            frame=new JFrame("first way");
//           JLabel label=new JLabel();
//           label.setBounds(250,50,50,50);
//           label.setText("Kya bolti public");
           // textField.setBounds(500,300,50,90);
//        Button button=new Button();

        // creates instance of JButton
        JButton button = new JButton("Kya scene");

        button.setBounds(200, 150, 90, 50);

        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adds button in JFrame
        frame.add(button);

        // sets 500 width and 600 height
        frame.setSize(500, 600);

        // uses no layout managers
        frame.setLayout(null);

        // makes the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new capgeimini01();
    }
}
