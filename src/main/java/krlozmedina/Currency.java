package krlozmedina;

import java.text.DecimalFormat;

public class Currency {
    private String[] currencies =               {"USD", "EUR",  "GBP",  "JPY",  "KRW",      "COP"};
    private double[] valueCurrenciesFromUSD =   {1,     0.94,   0.83,   136.01, 1299.32,    4732.01};
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
