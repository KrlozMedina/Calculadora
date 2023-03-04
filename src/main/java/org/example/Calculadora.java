package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    Operaciones operaciones = new Operaciones();
    private JButton key5;
    private JPanel ventana;
    private JLabel display;
    private JButton keyDivision;
    private JButton keyEqual;
    private JButton key4;
    private JButton key0;
    private JButton key1;
    private JButton keySubstraction;
    private JButton key2;
    private JButton keyDot;
    private JButton key8;
    private JButton KeyAC;
    private JButton key7;
    private JButton keyExp;
    private JButton key3;
    private JButton key6;
    private JButton key9;
    private JButton keyAns;
    private JButton keyAddition;
    private JButton keyMultiplication;
    private JButton keyDeletion;

    // Metodo
    public JLabel getDisplay() {
        return display;
    }
    public void setDisplay(JLabel display) {
        this.display = display;
    }

    // Constructor
    public Calculadora() {
        super("Calculator");
        setContentPane(ventana);
        key4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("4", display.getText()));
            }
        });
        key5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("5", display.getText()));
            }
        });
        keyDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.getOperator("/", display.getText()));
            }
        });
        key1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("1", display.getText()));
            }
        });
        key2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("2", display.getText()));
            }
        });
        keySubstraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.getOperator("-", display.getText()));
            }
        });
        key0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("0", display.getText()));
            }
        });
        keyDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero(".", display.getText()));
            }
        });
        keyEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() != 0) {
                    double valor = Double.parseDouble(display.getText());
                    switch (operaciones.operador) {
                        case "+":
                            operaciones.numero1 += valor;
                            break;
                        case "-":
                            operaciones.numero1 -= valor;
                            break;
                        case "*":
                            operaciones.numero1 *= valor;
                            break;
                        case "/":
                            if (valor != 0.0) {
                                operaciones.numero1 /= valor;
                            } else {
                                System.out.println("No es posible dividir entre 0");
                            }
                            break;
                        case "e":
                            operaciones.numero1 = Math.pow(operaciones.numero1, valor);
                            break;
                        case "":
                            operaciones.numero1 = valor;
                            break;
                    }
                    display.setText(String.valueOf(operaciones.numero1));
                } else {
                    System.out.println("No hay informacion suficiente para hacer un calculo");
                }
            }
        });
        key3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("3", display.getText()));
            }
        });
        key6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("6", display.getText()));
            }
        });
        key7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("7", display.getText()));
            }
        });
        key8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("8", display.getText()));
            }
        });
        key9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.concatenarNumero("9", display.getText()));
            }
        });
        KeyAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operaciones.numero1 != 0) {
                    operaciones.copiaNumero = operaciones.numero1;
                }
                display.setText("");
//                valorPantalla = "";
                operaciones.operador = "";
                operaciones.numero1 = 0;
            }
        });
        keyDeletion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = display.getText();
                if (valor.length() != 0) {
                    display.setText(valor.substring(0, valor.length() - 1));
                }
            }
        });
        keyAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.getOperator("+", display.getText()));
            }
        });
        keyMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.getOperator("*", display.getText()));
            }
        });
        keyExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.getOperator("e", display.getText()));
            }
        });
        keyAns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operaciones.numero1 = operaciones.copiaNumero;
                display.setText(String.valueOf(operaciones.numero1));
            }
        });
    }
}
