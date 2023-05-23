package org.example.calculator;

public class Parser {

    double[] parser(String[] input) {

        double[] szamok = new double[2];

        for (int i = 0; i < input.length; i++) {
            try {
                double szam = Double.parseDouble(input[i]);
                szamok[i] = szam;

            } catch (NumberFormatException e) {

                throw new InvalidExpressionException(e);

            }
        }
        return szamok;
    }

}
