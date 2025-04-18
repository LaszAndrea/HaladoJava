package org.example.calculator;

import java.util.Scanner;

public class Reader {

	Scanner sc = new Scanner(System.in);
	
	String[] readIn() {
		String[] stringSzam = new String[2];


		for (int i = 0; i < stringSzam.length; i++) {
			System.out.println("Adja meg " + (i+1) + ". sz�mot!\n");

			String szam = sc.nextLine();
			stringSzam[i] = szam;

		}

		return stringSzam;

	}

	String operatorReader() {
		System.out.println("Adja meg a műveletet! (+, -, *, /)");
		String operator = sc.nextLine();

		return operator;
	}
}
