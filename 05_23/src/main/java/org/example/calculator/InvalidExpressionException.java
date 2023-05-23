package org.example.calculator;

@SuppressWarnings("serial")
public class InvalidExpressionException extends RuntimeException {

	InvalidExpressionException(Throwable ex) {

		super(ex);

	}

}
