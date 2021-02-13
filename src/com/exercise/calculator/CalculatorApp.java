package com.exercise.calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        Engine engine = new Engine();
        try {
            System.out.println(engine.execute(line));
        } catch (UnsupportedSyntaxException e) {
            e.printStackTrace();
        }
    }
}
