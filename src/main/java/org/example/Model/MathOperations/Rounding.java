package org.example.Model.MathOperations;

public class Rounding {

    /**
     * Округление числа
     *
     * @param value double число
     * @param count сколько знаков после запятой
     * @return возвращает округленное число
     */
    public double rounding(double value, int count) {
        double scale = Math.pow(10, count);
        return Math.ceil((value * scale)) / scale;
    }
}