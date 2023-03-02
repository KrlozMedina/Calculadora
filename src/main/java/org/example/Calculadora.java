package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    String valorPantalla;
    String operador;
    double numero1;
    double copiaNumero;
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

    private void concatenarNumero(String valor) {
        if (display.getText() != "Seleccione el primer numero") {
            this.valorPantalla = display.getText();
            this.valorPantalla += valor;
            display.setText(this.valorPantalla);
        } else {
            display.setText(valor);
        }
    }

    private void getOperador(String operador) {
        this.operador = operador;
        if (display.getText().length() != 0) {
            this.numero1 = Double.parseDouble(display.getText());
        }
        display.setText("");
    }

    public Calculadora() {
        super("Calculadora");
        setContentPane(ventana);
        key4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("4");
            }
        });
        key5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("5");
            }
        });
        keyDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperador("/");
            }
        });
        key1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("1");
            }
        });
        key2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("2");
            }
        });
        keySubstraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperador("-");
            }
        });
        key0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("0");
            }
        });
        keyDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero(".");
            }
        });
        keyEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(display.getText());
//                double resultado = 0;
                switch (operador) {
                    case "+":
                        numero1 += valor;
                        break;
                    case "-":
                        numero1 -= valor;
                        break;
                    case "*":
                        numero1 *= valor;
                        break;
                    case "/":
                        if (valor != 0.0) {
                            numero1 /= valor;
                        } else {
                            System.out.println("No es posible dividir entre 0");
                        }
                        break;
                    case "e":
                        numero1 = Math.pow(numero1, valor);
                }
                display.setText(String.valueOf(numero1));
            }
        });
        key3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("3");
            }
        });
        key6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("6");
            }
        });
        key7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("7");
            }
        });
        key8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("8");
            }
        });
        key9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarNumero("9");
            }
        });
        KeyAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numero1 != 0) {
                    copiaNumero = numero1;
                }
                display.setText("");
                valorPantalla = "";
                operador = "";
                numero1 = 0;
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
                getOperador("+");
            }
        });
        keyMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperador("*");
            }
        });
        keyExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperador("e");
            }
        });
        keyAns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = copiaNumero;
                display.setText(String.valueOf(numero1));
            }
        });
    }
}
