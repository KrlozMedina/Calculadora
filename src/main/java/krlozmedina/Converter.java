package krlozmedina;

import javax.swing.*;
import java.awt.*;

public class Converter extends JFrame {
    Currency currency = new Currency();
    private JButton converter;
    private JTextField Value;
    private JLabel display;
    private JPanel window;
    private JButton buttonConvert;
    private JComboBox comboBoxCurrencyActual;
    private JTextField inputCurrency;
    private JComboBox comboBoxCurrencyConvert;
    private JLabel labelCurrency;

    private void assignLabelBox(JComboBox comboBox) {
        for (String currency : currency.getCurrencies()) {
            comboBox.addItem(currency);
        }
    }

    public Converter() {
        super("Converter");

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/4, height/4);
        setLocationRelativeTo(null);
        setVisible(true);

        setContentPane(window);

        assignLabelBox(comboBoxCurrencyActual);
        assignLabelBox(comboBoxCurrencyConvert);

        buttonConvert.addActionListener(e -> {
            labelCurrency.setText(currency.calculatedCurrency(comboBoxCurrencyActual.getSelectedIndex(), comboBoxCurrencyConvert.getSelectedIndex(), inputCurrency.getText()));
        });
    }
}
