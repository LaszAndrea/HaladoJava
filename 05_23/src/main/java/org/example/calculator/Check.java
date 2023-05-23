package org.example.calculator;

public class Check {

    Operations operation = new Operations();

    double checker(String operator, double numbers[]) {

        if (operator.equals("+")) {
            return operation.plus(numbers[0], numbers[1]);
        }else if (operator.equals("-")) {
            return operation.minus(numbers[0], numbers[1]);
        }else if (operator.equals("*")) {
            return operation.multiple(numbers[0], numbers[1]);
        }else if (operator.equals("/")) {
            if (numbers[1] != 0) {
                return operation.per(numbers[0], numbers[1]);
            }else {
                RuntimeException ex = new RuntimeException("You cannot divide with 0");
                throw new InvalidExpressionException(ex);
            }
        }else {
            return -1;
        }
    }


}
