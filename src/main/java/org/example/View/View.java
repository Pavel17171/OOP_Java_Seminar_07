package org.example.View;

import org.example.Model.ComplexNumber;
import org.example.Model.Logger.Logger;

public class View {
    public void print(ComplexNumber result) {
        Logger logger = new Logger();
        logger.update(result, "Результат: ");
        System.out.println(result.toString());
    }
}