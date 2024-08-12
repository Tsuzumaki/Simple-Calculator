package main;

import function.function;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
    public static JLabel inputs;
    public static JTextField Answer;
    public static JButton percent,ce,c,backspace,onedivx,squared,root,divide,times,subtraction,plus,equals,cSign,decimal;
    public static GridBagConstraints gbc;
    public static void main(String[] args){
        //Window 
        JFrame frame = new JFrame();

        //Window content
        JPanel mainPanel = new JPanel();

        //Window Properties
        frame.setTitle("Simple Calculator");
        frame.setSize(700,700);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Content Properties
        mainPanel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(1,1,1,1);
        

        //Dimension: 8x4

        //Contents 
        inputs = new JLabel("test");
        inputs.setHorizontalAlignment(SwingConstants.RIGHT);
        inputs.setForeground(Color.GRAY);
        gbc_set(0,0,4);
        mainPanel.add(inputs,gbc);

        Answer = new JTextField("test");
        Answer.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc_set(0, 1, 4);
        mainPanel.add(Answer,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        percent = new JButton("%");
        ce = new JButton("CE");
        c = new JButton("C");
        backspace = new JButton("<-");
        onedivx = new JButton("1/X");
        squared = new JButton("2^X");
        root = new JButton("2sqrtX");
        divide = new JButton("/");
        times = new JButton("*");
        subtraction = new JButton("-");
        plus = new JButton("+");
        equals = new JButton("=");
        cSign = new JButton("+/-");
        decimal = new JButton(".");

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");

        addButton(mainPanel,percent,0,2);
        addButton(mainPanel,ce,1,2);
        addButton(mainPanel,c,2,2);
        addButton(mainPanel,backspace,3,2);
        addButton(mainPanel,onedivx,0,3);
        addButton(mainPanel,squared,1,3);
        addButton(mainPanel,root,2,3);
        addButton(mainPanel,divide,3,3);
        addButton(mainPanel,seven,0,4);
        addButton(mainPanel,eight,1,4);
        addButton(mainPanel,nine,2,4);
        addButton(mainPanel,times,3,4);
        addButton(mainPanel,four,0,5);
        addButton(mainPanel,five,1,5);
        addButton(mainPanel,six,2,5);
        addButton(mainPanel,subtraction,3,5);
        addButton(mainPanel,one,0,6);
        addButton(mainPanel,two,1,6);
        addButton(mainPanel,three,2,6);
        addButton(mainPanel,plus,3,6);
        addButton(mainPanel,cSign,0,7);
        addButton(mainPanel,zero,1,7);
        addButton(mainPanel,decimal,2,7);
        addButton(mainPanel,equals,3,7);

        //Frame Content
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    static public void gbc_set(int x,int y,int width){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = width;
    }
    static public void addButton(JPanel panel,JButton button ,int x,int y){
        gbc_set(x, y, 1);
        panel.add(button,gbc);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button " + button.getText() + " clicked.");
            }
        });
    } 

}

