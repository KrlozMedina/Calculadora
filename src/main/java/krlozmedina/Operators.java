package krlozmedina;

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

    private void calculatedAddition(double num1, double num2) {
        setTotal(num1 + num2);
    }

    private void calculatedSubtraction(double num1, double num2) {
        setTotal(num1 - num2);
    }

    private void calculatedMultiplication(double num1, double num2) {
        setTotal(num1 * num2);
    }

    private void calculatedDivision(double num, double den) {
        setTotal(num / den);
    }

    private void calculatedPow(double base, double exp) {
        setTotal(Math.pow(base, exp));
    }

    public String calculated(String value) {
        double newValue = Double.parseDouble(value);
        switch (getOperator()) {
            case "+" -> calculatedAddition(getValueInDisplay(), newValue);
            case "-" -> calculatedSubtraction(getValueInDisplay(), newValue);
            case "*" -> calculatedMultiplication(getValueInDisplay(), newValue);
            case "/" -> calculatedDivision(getValueInDisplay(), newValue);
            case "e" -> calculatedPow(getValueInDisplay(), newValue);
            default -> setTotal(0);
        }
        return String.valueOf(getTotal());
    }
}
