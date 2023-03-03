package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    Operaciones operaciones = new Operaciones();
    private JButton key5;
    private JPanel ventana;

    public JLabel getDisplay() {
        return display;
    }

    public void setDisplay(JLabel display) {
        this.display = display;
    }

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

    public JButton getKey5() {
        return key5;
    }

    public void setKey5(JButton key5) {
        this.key5 = key5;
    }

    public JPanel getVentana() {
        return ventana;
    }

    public void setVentana(JPanel ventana) {
        this.ventana = ventana;
    }

    public JButton getKeyDivision() {
        return keyDivision;
    }

    public void setKeyDivision(JButton keyDivision) {
        this.keyDivision = keyDivision;
    }

    public JButton getKeyEqual() {
        return keyEqual;
    }

    public void setKeyEqual(JButton keyEqual) {
        this.keyEqual = keyEqual;
    }

    public JButton getKey4() {
        return key4;
    }

    public void setKey4(JButton key4) {
        this.key4 = key4;
    }

    public JButton getKey0() {
        return key0;
    }

    public void setKey0(JButton key0) {
        this.key0 = key0;
    }

    public JButton getKey1() {
        return key1;
    }

    public void setKey1(JButton key1) {
        this.key1 = key1;
    }

    public JButton getKeySubstraction() {
        return keySubstraction;
    }

    public void setKeySubstraction(JButton keySubstraction) {
        this.keySubstraction = keySubstraction;
    }

    public JButton getKey2() {
        return key2;
    }

    public void setKey2(JButton key2) {
        this.key2 = key2;
    }

    public JButton getKeyDot() {
        return keyDot;
    }

    public void setKeyDot(JButton keyDot) {
        this.keyDot = keyDot;
    }

    public JButton getKey8() {
        return key8;
    }

    public void setKey8(JButton key8) {
        this.key8 = key8;
    }

    public JButton getKeyAC() {
        return KeyAC;
    }

    public void setKeyAC(JButton keyAC) {
        KeyAC = keyAC;
    }

    public JButton getKey7() {
        return key7;
    }

    public void setKey7(JButton key7) {
        this.key7 = key7;
    }

    public JButton getKeyExp() {
        return keyExp;
    }

    public void setKeyExp(JButton keyExp) {
        this.keyExp = keyExp;
    }

    public JButton getKey3() {
        return key3;
    }

    public void setKey3(JButton key3) {
        this.key3 = key3;
    }

    public JButton getKey6() {
        return key6;
    }

    public void setKey6(JButton key6) {
        this.key6 = key6;
    }

    public JButton getKey9() {
        return key9;
    }

    public void setKey9(JButton key9) {
        this.key9 = key9;
    }

    public JButton getKeyAns() {
        return keyAns;
    }

    public void setKeyAns(JButton keyAns) {
        this.keyAns = keyAns;
    }

    public JButton getKeyAddition() {
        return keyAddition;
    }

    public void setKeyAddition(JButton keyAddition) {
        this.keyAddition = keyAddition;
    }

    public JButton getKeyMultiplication() {
        return keyMultiplication;
    }

    public void setKeyMultiplication(JButton keyMultiplication) {
        this.keyMultiplication = keyMultiplication;
    }

    public JButton getKeyDeletion() {
        return keyDeletion;
    }

    public void setKeyDeletion(JButton keyDeletion) {
        this.keyDeletion = keyDeletion;
    }

    private JButton keyDeletion;

    // Metodo

    // Constructor
    public Calculadora() {
        super("Calculadora");
        setContentPane(ventana);

//        operaciones.mostrarPantalla(this);
        key4.addActionListener(new ActionListener() {
//            @Override
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
                display.setText(operaciones.getOperador("/", display.getText()));
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
                display.setText(operaciones.getOperador("-", display.getText()));
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
                display.setText(operaciones.getOperador("+", display.getText()));
            }
        });
        keyMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.getOperador("*", display.getText()));
            }
        });
        keyExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(operaciones.getOperador("e", display.getText()));
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
