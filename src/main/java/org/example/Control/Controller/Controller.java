package org.example.Control.Controller;

import org.example.Control.Number.GetNumber;
import org.example.Control.Sign.GetOperationSign;
import org.example.Model.ComplexNumber;
import org.example.Model.Logger.Logger;
import org.example.Model.Logger.LoggerString;
import org.example.Model.MathOperations.Addition;
import org.example.Model.MathOperations.Division;
import org.example.Model.MathOperations.Multiplication;
import org.example.Model.MathOperations.Subtraction;
import org.example.View.View;

public class Controller implements IControl {
    @Override
    public void program() {
        GetNumber getNumber = new GetNumber();
        GetOperationSign getSign = new GetOperationSign();
        View view = new View();
        Logger logger = new Logger();
        LoggerString loggerString = new LoggerString();
        double[] result;
        boolean flag = true;
        while (flag) {
            double aNumOne = getNumber.number("Вещественная часть первого числа: ");
            double iNumOne = getNumber.number("Мнимая часть первого числа");
            double aNumTwo = getNumber.number("Вещественная часть второго числа: ");
            double iNumTwo = getNumber.number("Мнимая часть второго числа");
            String sign = getSign.operationSign("Выберите математическаю операцию ( + , - , * , / )");
            ComplexNumber numOne = new ComplexNumber(aNumOne, iNumOne);
            ComplexNumber numTwo = new ComplexNumber(aNumTwo, iNumTwo);
            logger.update(numOne, "Первое число: ");
            loggerString.update(sign, "Действие: ");
            logger.update(numTwo, "Второе число: ");
            switch (sign) {
                case "+" -> {
                    Addition addition = new Addition();
                    result = addition.process(numOne, numTwo);
                    view.print(new ComplexNumber(result[0], result[1]));
                }
                case "-" -> {
                    Subtraction subtraction = new Subtraction();
                    result = (subtraction.process(numOne, numTwo));
                    view.print(new ComplexNumber(result[0], result[1]));
                }
                case "*" -> {
                    Multiplication multiplication = new Multiplication();
                    result = (multiplication.process(numOne, numTwo));
                    view.print(new ComplexNumber(result[0], result[1]));
                }
                case "/" -> {
                    Division division = new Division();
                    result = (division.process(numOne, numTwo));
                    view.print(new ComplexNumber(result[0], result[1]));
                }

            }

            String answer = getSign.operationSign("Ещё раз?\n" +
                                                  "Y - да\n" +
                                                  "N - нет");
            switch (answer.toLowerCase()) {
                case "y" -> {
                }
                case "n" -> {
                    flag = false;
                }
            }
        }
    }
}
