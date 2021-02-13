package com.exercise.calculator;

public class Engine {
    public String execute(String line) throws UnsupportedSyntaxException {
        Logic logic = new Logic();
        Converter converter = new Converter();
        String output = "";
        if (logic.checkArabianNumbers(line)) {
            try {
                String[] values = converter.parseValues(line);
                int firstValue = Integer.parseInt(values[0].trim());
                int secondValue = Integer.parseInt(values[1].trim());
                if (logic.checkValue(firstValue)&&logic.checkValue(secondValue)){
                    int result = logic.getResult(firstValue, secondValue, converter.getOperator());
                    output = String.valueOf(result);
                } else {
                    throw new IllegalArgumentException("Value " + firstValue + " or " + secondValue + " more than 10 " );

                }
            } catch (UnsupportedOperationException | ArithmeticException | IllegalArgumentException e) {
                e.printStackTrace();
            }
        } else if (logic.checkRomeNumbers(line)) {
            try {
                String[] values = converter.parseValues(line);
                int firstValue = converter.convertFromRomeToInteger(values[0]);
                int secondValue = converter.convertFromRomeToInteger(values[1]);
                int result = logic.getResult(firstValue, secondValue, converter.getOperator());
                output = converter.convertFromIntegerToRome(result);
            } catch (UnsupportedOperationException | ArithmeticException | IllegalArgumentException e) {
                e.printStackTrace();
            }
        } else {
            throw new UnsupportedSyntaxException("invalid input syntax! expected \"Ex: 1 + 4\" or \"Ex: I + IV\"");
        }
        return output;
    }
}
