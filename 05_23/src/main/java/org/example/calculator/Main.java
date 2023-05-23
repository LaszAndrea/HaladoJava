package org.example.calculator;

public class Main {

        static Reader reader = new Reader();
        static Writer writer = new Writer();
        static Parser parse = new Parser();
        static Check check = new Check();


        public static void main(String[] args) {


            writer.writeOut(check.checker(reader.readInOperation(), parse.parser(reader.readIn())));

        }
}