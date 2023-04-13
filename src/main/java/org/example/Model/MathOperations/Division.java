package org.example.Model.MathOperations;

import org.example.Model.ComplexNumber;

public class Division implements IMathOperation {
    @Override
    public double[] process(ComplexNumber a, ComplexNumber b) {
        Rounding round = new Rounding();
        double[] result = new double[2];
        double first = a.getA() * b.getA() - a.getI() * b.getI() * (-1);
        double second = b.getA() * a.getI() - a.getA() * b.getI();
        double third = Math.pow(b.getA(), 2) - Math.pow(b.getI(), 2) * (-1);
        result[0] = round.rounding((first / third), 2);
        result[1] = round.rounding((second / third), 2);
        return result;
    }
}