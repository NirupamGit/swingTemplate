package com.example;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;        

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack();
        frame.setVisible(true);

        JFrame frame1 = new JFrame("button");
        frame.setPreferredSize(new Dimension(50, 50));
        frame1.setResizable(false);
        frame1.setLayout(null);
        JButton button=new JButton("press me");
        button.setBounds(50, 50,50,50);
        frame.add(button);
        button.addActionListener(e -> {
            button.setText("you did it");
        });
        frame.setVisible(true);
        JFrame gui=new JFrame();
        gui.setTitle("GUI");
        gui.setResizable(false);
        gui.setSize(200,200);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setVisible(true);
        Container pane = gui.getContentPane();
        pane.setLayout(new FlowLayout());
        JButton one = new JButton("1");
        pane.add(one);
        one.addActionListener(e -> {
            one.setText("button 1");
        });
        JButton two = new JButton("2");
        pane.add(two);
        two.addActionListener(e -> {
            two.setText("button 2");
        });
        JButton three = new JButton("3");
        pane.add(three);
        three.addActionListener(e -> {
            three.setText("button 3");
        });
        
        JFrame menuFrame = new JFrame("menu bar");
        menuFrame.setSize(400,300);
        menuFrame.setLayout(new BorderLayout());
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
        menuFrame.add(messageLabel, BorderLayout.CENTER);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("click here");
        JMenuItem item1=new JMenuItem("now click here");
        item1.addActionListener(e -> {
            messageLabel.setText("Nirupam is the best Java Coder ever");
        });
        menu1.add(item1);
        menuBar.add(menu1);
        menuFrame.setJMenuBar(menuBar);
        menuFrame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
