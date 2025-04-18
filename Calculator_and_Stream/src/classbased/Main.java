package org.example.classbased;

import org.example.M;

public class Main {

    private static M m = new M();

    public static void main(String[] args) {

        //print.kezdes();

        //m.m1().m2().m3().m4();

        flow(new InputImpl(), new FilterImpl(), new OutputImpl());


    }

    public static void flow(Input input, Filter filter, Output output){

        int value = input.get();
        if(filter.isOk(value)){

            output.put(value);

        }

    }
}