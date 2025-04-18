package org.example.calculator;

public class Calculator {

	
	static Reader reader = new Reader();
	static Writer writer = new Writer();
	static Parse parse = new Parse();
	static Checker check = new Checker();
	
	
	public static void main(String[] args) {

		writer.write(check.checker(reader.operatorReader(), parse.parser(reader.readIn())));

	}
}
