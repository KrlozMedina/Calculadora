package krlozmedina;

import java.text.DecimalFormat;

public class Currency {
    private String[] currencies = {"USD", "COP", "EUR", "MXN"};
    private double[] valueCurrenciesFromUSD = {1, 4788.63, 0.94, 17.96};
    private double valueActual;
    private double valueInUSD;
    private double currencyOther;
    private double valueConverted;

    public String[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String[] currencies) {
        this.currencies = currencies;
    }

    public double getValueCurrenciesFromUSD(int currency) {
        return valueCurrenciesFromUSD[currency];
    }

    public void setValueCurrenciesFromUSD(double[] valueCurrenciesFromUSD) {
        this.valueCurrenciesFromUSD = valueCurrenciesFromUSD;
    }

    public double getValueActual() {
        return valueActual;
    }

    public void setValueActual(double valueActual) {
        this.valueActual = valueActual;
    }

    public double getValueInUSD() {
        return valueInUSD;
    }

    public void setValueInUSD(double valueInUSD) {
        this.valueInUSD = valueInUSD;
    }

    public double getCurrencyOther() {
        return currencyOther;
    }

    public void setCurrencyOther(double currencyOther) {
        this.currencyOther = currencyOther;
    }

    public double getValueConverted() {
        return valueConverted;
    }

    public void setValueConverted(double valueConverted) {
        this.valueConverted = valueConverted;
    }

    public String calculatedCurrency(int currencyActual, int currencyToConvert, String inputCurrency) {
        this.setValueActual(Double.parseDouble(inputCurrency));

        if (currencyActual != 0) {
            this.setCurrencyOther(1 / this.getValueCurrenciesFromUSD(currencyActual));
            this.setValueInUSD(this.getValueActual() * this.getCurrencyOther());
        } else {
            this.setValueInUSD(this.getValueActual());
        }

        this.setValueConverted(this.getValueInUSD() * this.getValueCurrenciesFromUSD(currencyToConvert));
        DecimalFormat format = new DecimalFormat("#.########");

        return String.valueOf(format.format(this.getValueConverted()));
    }
}
