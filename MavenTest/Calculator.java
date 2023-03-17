package org.example;

import java.util.Scanner;

public class Calculator {

    public static void calculate(char operator, Double number1, Double number2) {

        check(number1, number2);

        double result = 0;

        switch (operator) {

            case '+':
                add(number1, number2);
                break;

            case '-':
                minus(number1, number2);
                break;

            case '*':
                times(number1, number2);
                break;

            case '/':
                divide(number1, number2);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    }

    public static double add(Double number1, Double number2){
        Double result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        return result;
    }

    public static double minus(Double number1, Double number2){
        Double result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        return result;
    }

    public static double times(Double number1, Double number2){
        Double result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        return result;
    }

    public static double divide(Double number1, Double number2){
        Double result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        return result;
    }

    public static void check(Double number1, Double number2){

        if(number1 == null || number2 == null) {
            IllegalArgumentException ex = new IllegalArgumentException();
            throw ex;
        }

    }

}
