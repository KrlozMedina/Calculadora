package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Calculadora();
                frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }
}