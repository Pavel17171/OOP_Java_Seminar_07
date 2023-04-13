package org.example.Model.MathOperations;

import org.example.Model.ComplexNumber;

public class Multiplication implements IMathOperation {

    @Override
    public double[] process(ComplexNumber a, ComplexNumber b) {
        double[] result = new double[2];
        result[0] = a.getA() * b.getA() + a.getI() * b.getI() * (-1);
        result[1] = a.getA() * b.getI() + b.getA() * a.getI();
        return result;
    }
}