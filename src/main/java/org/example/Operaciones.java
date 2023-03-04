package org.example;

import java.awt.event.ActionEvent;

public class Operaciones {
    // Variables globales
    private String valueDisplay = "";
    private String operator = "";
    private double numero1 = 0;
    double copiaNumero;

    //Getters Setters
    public String getValueDisplay() {
        return valueDisplay;
    }
    public void setValueDisplay(String valorPantalla) {
        this.valueDisplay = valorPantalla;
    }
    public String getOperator(String operator, String display) {
        setOperator(operator);
        if (display.length() != 0) {
            this.numero1 = Double.parseDouble(display);
        }
        return "";
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    // Metodos
    public String concatenarNumero(String valor, String display) {
            setValueDisplay(getValueDisplay() + valor);
            return getValueDisplay();
    }
    public void mostrarPantalla(Calculadora calculadora) {
//        Calculadora calculadora = new Calculadora();
        calculadora.getDisplay().setText("hola");
    }

//    public void actionPerformed(ActionEvent e) {
//        display.setText(this.concatenarNumero("4", display.getText()));
//    }
}
