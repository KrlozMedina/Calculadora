package krlozmedina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Calculator extends JFrame {
    Operators operators = new Operators();
    private JPanel window;
    private JLabel display;
    private JButton keyNum0;
    private JButton keyNum1;
    private JButton keyNum2;
    private JButton keyNum3;
    private JButton keyNum4;
    private JButton keyNum5;
    private JButton keyNum6;
    private JButton keyNum7;
    private JButton keyNum8;
    private JButton keyNum9;
    private JButton keyDot;
    private JButton keyAddition;
    private JButton keySubtraction;
    private JButton keyMultiplication;
    private JButton keyDivision;
    private JButton keyExp;
    private JButton keyEqual;
    private JButton keyDeletion;
    private JButton keyAns;
    private JButton keyClean;

    public String getDisplay() {
        return display.getText();
    }
    
    public void setDisplay(String value) {
        this.display.setText(value);
    }
    
    private void updateDisplay(String key) {
        switch (key) {
            case "AC" -> {
                setDisplay("");
                operators.setValueInDisplay("0");
                operators.setOperator("");
            }
            case "DEL" -> setDisplay(getDisplay().substring(0, getDisplay().length() - 1));
            case "ANS" -> setDisplay(String.valueOf(operators.getTotal()));
            default -> setDisplay(getDisplay() + key);
        }
    }

    private void returnValue(String sign) {
        if (Objects.equals(sign, "=")) {
            setDisplay(operators.calculated(getDisplay()));
        } else {
            operators.setValueInDisplay(getDisplay());
            setDisplay("");
            operators.setOperator(sign);
        }
    }
    
    public Calculator() {
        super("Calculator");

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/4, height/4);
        setLocationRelativeTo(null);
        setVisible(true);

        setContentPane(window);
        keyNum0.addActionListener(e -> updateDisplay("0"));
        keyNum1.addActionListener(e -> updateDisplay("1"));
        keyNum2.addActionListener(e -> updateDisplay("2"));
        keyNum3.addActionListener(e -> updateDisplay("3"));
        keyNum4.addActionListener(e -> updateDisplay("4"));
        keyNum5.addActionListener(e -> updateDisplay("5"));
        keyNum6.addActionListener(e -> updateDisplay("6"));
        keyNum7.addActionListener(e -> updateDisplay("7"));
        keyNum8.addActionListener(e -> updateDisplay("8"));
        keyNum9.addActionListener(e -> updateDisplay("9"));
        keyDot.addActionListener(e -> updateDisplay("."));
        keyAddition.addActionListener(e -> returnValue("+"));
        keySubtraction.addActionListener(e -> returnValue("-"));
        keyMultiplication.addActionListener(e -> returnValue("*"));
        keyDivision.addActionListener(e -> returnValue("/"));
        keyExp.addActionListener(e -> returnValue("e"));
        keyEqual.addActionListener(e -> returnValue("="));
        keyDeletion.addActionListener(e -> updateDisplay("DEL"));
        keyAns.addActionListener(e -> updateDisplay("ANS"));
        keyClean.addActionListener(e -> updateDisplay("AC"));
    }
}
