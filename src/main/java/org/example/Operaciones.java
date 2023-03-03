package org.example;

import java.awt.event.ActionEvent;

public class Operaciones {


    // Variables globales
    private String valorPantalla = "";
    String operador = "";
    double numero1;
    double copiaNumero;

    //Getters Setters
    public String getValorPantalla() {
        return valorPantalla;
    }

    public void setValorPantalla(String valorPantalla) {
        this.valorPantalla = valorPantalla;
    }

    // Metodos
    public String concatenarNumero(String valor, String display) {
//            valorPantalla = display;
//            valorPantalla += valor;

            setValorPantalla(getValorPantalla() + valor);
            return getValorPantalla();
    }

    public String getOperador(String operador, String display) {
        this.operador = operador;
        if (display.length() != 0) {
            this.numero1 = Double.parseDouble(display);
        }
//        display.setText("");
        return "";
    }

    public void mostrarPantalla(Calculadora calculadora) {
//        Calculadora calculadora = new Calculadora();
        calculadora.getDisplay().setText("hola");
    }

//    public void actionPerformed(ActionEvent e) {
//        display.setText(this.concatenarNumero("4", display.getText()));
//    }
}
