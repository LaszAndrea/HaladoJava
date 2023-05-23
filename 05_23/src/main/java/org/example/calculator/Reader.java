package org.example.calculator;

import java.util.Scanner;

public class Reader {

    Scanner sc = new Scanner(System.in);

    String[] readIn() {

        String[] numberInString = new String[2];

        for (int i = 0; i < numberInString.length; i++) {
            System.out.println("Please give me the " + (i+1) + ". number!\n");

            String number = sc.nextLine();

            numberInString[i] = number;

        }

        return numberInString;

    }

    String readInOperation() {

        System.out.println("Please give me the operation! (+, -, *, or /)");
        String jel = sc.nextLine();

        return jel;

    }

}
