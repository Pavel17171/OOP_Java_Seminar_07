package org.example.Model;

public class ConvertToString {

    public ConvertToString() {
    }

    public String convert(String a, String i, String sign) {
        String text = "";
        if (sign.equals("-")) {
            if (a.equals("null")) {
                text = i + "i";
            } else {
                text = a + i + "i";
            }
        } else if (sign.equals("+")) {
            if (a.equals("null")) {
                text = i + "i";
            } else {
                text = a + "+" + i + "i";
            }
        } else {
            if (a.equals("null")) {
                text = "0";
            } else {
                text += a;
            }

        }
        return text;
    }

    public String convertToString(double a, double i) {
        String aStr = "";
        String iStr = "";
        String sign = "";
        if (i < 0) {
            sign = "-";
        } else if (i > 0){
            sign = "+";
        }
        if (a == 0) {
            aStr += "null";
        } else if (a % 1 == 0) {
            aStr += (int) a;
        } else {
            aStr += a;
        }
        if (i == 0) {
            iStr += "null";
        } else if (i % 1 == 0) {
            iStr += (int) i;
        } else {
            iStr += i;
        }
        return convert(aStr, iStr, sign);
    }
}