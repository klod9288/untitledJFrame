package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

import static java.awt.BorderLayout.*;

public class AIphabetButtons extends JFrame{

    private JButton editButton,editButton1,exitButton ;
    private JPanel jPanel,jPanel1,jPanel2;
    private JTextField jTextField;
    private JLabel jLabel;

    private String msgHello,msgGoodbye;
    private Color color1,color2;

    public AIphabetButtons() {

        editButton = new JButton("Hello");

        editButton1 = new JButton("Goodbye");

        exitButton = new JButton("Exit");
        jTextField = new JTextField(20);
        jLabel = new JLabel("NULL");

        msgHello = "";
        msgGoodbye = "";

        color1 = Color.red;
        color2 = Color.GREEN;

        setTitle("Application");
        setBounds(0,0,1400,900);
        setLocationRelativeTo(null);

        jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
        jPanel.setBorder(new TitledBorder("Line1"));
        jPanel.add(editButton);
        jPanel.add(jTextField);
        jPanel.add(jLabel);

//        jPanel1 = new JPanel(new GridLayout(1,2,5,5));
        jPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
        jPanel1.setBorder(new TitledBorder("Line2"));
        jPanel1.add(editButton1);
        jPanel1.add(exitButton);

        setLayout(new GridLayout(15,1,5,5));
        add(jPanel);
        add(jPanel1);

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jTextField.getText().toString().trim());
                msgGoodbye = "";
                repaint();
            }
        });

        editButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                msgGoodbye = "Goodbye";
                msgHello = "";
                repaint();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setResizable(true);
        setVisible(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//Constructor

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Font font = new Font("cordie", Font.BOLD, 16);
        graphics.setFont(font);
        graphics.setColor(color2);
        graphics.drawString(msgHello,100,100);
        graphics.setColor(color1);
        graphics.drawString(msgGoodbye,100,100);

    }//Graphics


}//Main Class
