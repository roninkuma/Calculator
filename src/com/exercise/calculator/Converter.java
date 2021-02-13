package com.exercise.calculator;

public class Converter {
    private char plus = '+';
    private char minus = '-';
    private char multiply = '*';
    private char divide = '/';
    private char operator;

    public String[] parseValues(String line) throws UnsupportedOperationException {
        if (line.contains("+")) {
            operator = plus;
            return line.split("[\\+]");
        } else if (line.contains("-")) {
            operator = minus;
            return line.split("[\\-]");
        } else if (line.contains("*")) {
            operator = multiply;
            return line.split("[\\*]");
        } else if (line.contains("/")) {
            operator = divide;
            return line.split("/");
        } else {
            throw new UnsupportedOperationException("app expected the next operations: +, -, *, /");
        }
    }

    public int convertFromRomeToInteger(String value) throws IllegalArgumentException {
        String valueWithoutSpaces = value.trim();
        switch (valueWithoutSpaces) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("unsupported value:" + value);
        }
    }

    public String convertFromIntegerToRome(int value) throws IllegalArgumentException {
        String[] enumeration = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII","XXIV","XXV",
                 "XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX",
                "XL", "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI",  "LII",  "LIII", " LIV ",
                "LV", "LVI",  "LVII", "LVIII",  "LIX", "LX",  "LXI",  "LXII", "LXIII",  "LXIV",  "LXV",  "LXVI",  "LXVII",  "LXVIII" , "LXIX",
                "LXX",  "LXXI",  "LXXII",  "LXXIII",  "LXXIV",  "LXXV", "LXXVI", "LXXVII",  "LXXVIII",  "LXXIX", "LXXX" , "LXXXI" ,"LXXXII" ,
                "LXXXIII",  "LXXXIV",  "LXXXV",  "LXXXVI",  "LXXXVII" , "LXXXVIII" , "LXXXIX" , "XC" , "XCI" , "XCII",  "XCIII",  "XCIV",
                "XCV", "XCVI",  "XCVII"  ,"XCVIII",  "XCIX",  "C" };
        for (int i = 0; i < enumeration.length; i++) {
            if ((i + 1) == value) {
                return enumeration[i];
            }
        }
        throw new IllegalArgumentException("unsupported value:" + value);
    }

    public char getOperator() {
        return operator;
    }
}
