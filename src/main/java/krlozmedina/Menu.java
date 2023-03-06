package krlozmedina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton buttonCalculator;
    private JButton buttonConvert;
    private JPanel panel;


    public Menu() {
        super("Calculator");
        setContentPane(panel);

        Dimension window = Toolkit.getDefaultToolkit().getScreenSize();
        int height = window.height;
        int width = window.width;
        setSize(width/4, height/4);
        setLocationRelativeTo(null);
        setVisible(true);

        buttonCalculator.addActionListener(e -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
            calculator.setSize(400, 250);
        });

        buttonConvert.addActionListener(e -> {
            Converter converter = new Converter();
            converter.setVisible(true);
            converter.setSize(400, 250);
        });
    }
}
