package org.example.Control.Number;

import java.util.Scanner;

public class GetNumber implements IGetNum {
    Scanner sc;

    @Override
    public double number(String massage) {
        double temp;
        sc = new Scanner(System.in);
        while (true) {
            System.out.println(massage);
            String num = sc.next();
            try {
                temp = Integer.parseInt(num);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("ERROR! Incorrect enter!");
            }
        }
        return temp;
    }
}
