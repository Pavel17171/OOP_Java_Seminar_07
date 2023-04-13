package org.example.Control.Sign;

import java.util.Scanner;

public class GetOperationSign implements IOperationSign {

    @Override
    public String operationSign(String enterSing) {
        String answer = "";
        boolean flag = true;
//        answer = sc.nextLine();
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println(enterSing);
            answer = "" + sc.next();
            if (answer.equals("+") ||
                    answer.equals("-") ||
                    answer.equals("*") ||
                    answer.equals("/") ||
                    answer.equals("y") ||
                    answer.equals("Y") ||
                    answer.equals("n") ||
                    answer.equals("N")) {
                flag = false;
            }
        }
        return answer;
    }
}
