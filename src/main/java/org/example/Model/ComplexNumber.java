package org.example.Model;

public class ComplexNumber {
    private double a;
    private double i;

    public ComplexNumber(double a, double i) {
        this.a = a;
        this.i = i;
    }

    public double getA() {
        return a;
    }

    public double getI() {
        return i;
    }

    @Override
    public String toString() {
        ConvertToString cts = new ConvertToString();
        return cts.convertToString(a, i);
    }
}