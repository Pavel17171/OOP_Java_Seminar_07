package org.example.Model.MathOperations;

import org.example.Model.ComplexNumber;

public class Subtraction implements IMathOperation {
    @Override
    public double[] process(ComplexNumber a, ComplexNumber b) {
        double[] result = new double[2];
        result[0] = a.getA() - b.getA();
        result[1] = a.getI() - b.getI();
        return result;
    }
}