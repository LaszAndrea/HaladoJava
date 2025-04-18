package org.example;

public class M {

    M m1(){
        System.out.print("meghívták az m1-et");
        m2();
        return this;
    }

    M m2(){
        System.out.print("meghívták az m2-et");
        m3();
        return this;
    }

    M m3(){
        System.out.print("meghívták az m3-et");
        m4();
        return this;
    }

    M m4(){
        System.out.print("meghívták az m4-et");
        return this;
    }

}
