package org.example;

public class Operators {
    private double valueInDisplay;
    private String operator;
    private double total;

    public double getValueInDisplay() {
        return valueInDisplay;
    }

    public void setValueInDisplay(String valueInDisplay) {
        this.valueInDisplay = Double.parseDouble(valueInDisplay);
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String calculated(String value) {
        double newValue = Double.parseDouble(value);
        switch (getOperator()) {
            case "+" -> setTotal(getValueInDisplay() + newValue);
            case "-" -> setTotal(getValueInDisplay() - newValue);
            case "*" -> setTotal(getValueInDisplay() * newValue);
            case "/" -> setTotal(getValueInDisplay() / newValue);
            case "e" -> setTotal(Math.pow(getValueInDisplay(), newValue));
            default -> setTotal(0);
        }
        return String.valueOf(getTotal());
    }
}
