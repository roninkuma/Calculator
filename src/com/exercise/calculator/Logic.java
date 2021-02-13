package com.exercise.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
    public boolean checkArabianNumbers(String line) {
        Pattern pattern = Pattern.compile("[0-9]+\\s*[+-]*[*/]*\\s*[0-9]+");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }

    public boolean checkRomeNumbers(String line) {
        Pattern pattern = Pattern.compile("[I]*[V]*[X]*[I]*\\s*[+-]*[*/]*\\s*[I]*[V]*[X]*[I]*");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }

    public boolean checkValue(int value){
        return value <= 10;
    }

    private int addition(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    private int subtraction(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    private int multiplication(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    private int division(int firstValue, int secondValue) throws ArithmeticException {
        if (secondValue == 0) {
            throw new ArithmeticException();
        }
        return firstValue / secondValue;
    }

    public int getResult(int firstValue, int secondValue, char operator) throws UnsupportedOperationException, ArithmeticException {
        switch (operator) {
            case '+':
                return addition(firstValue, secondValue);
            case '-':
                return subtraction(firstValue, secondValue);
            case '*':
                return multiplication(firstValue, secondValue);
            case '/':
                return division(firstValue, secondValue);
            default:
                throw new UnsupportedOperationException("app expected the next operations: +, -, *, /");
        }
    }
}
