package org.example.calculator;

public class Checker {

	Operations operation = new Operations();

	double checker(String operator, double[] szam) {

		if (operator.equals("+")) {
			return operation.plus(szam[0], szam[1]);
		}

		else if (operator.equals("-")) {
			return operation.minus(szam[0], szam[1]);
		}

		else if (operator.equals("*")) {
			return operation.multiple(szam[0], szam[1]);
		} else if (operator.equals("/")) {

			if (szam[1] != 0) {

				return operation.divide(szam[0], szam[1]);
			}

			else {
				return -1;
			}

		}

		else {
			return -1;
		}
	}
}
