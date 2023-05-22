package org.example;

public class Main {

    private static Storage storage = new Storage();
    private static FactoryImpl f = new FactoryImpl(storage);

    public static void main(String[] args){

        f.assemble("SUV", "blue");
        storage.put(new Car("1234", "Audi", "SUV", "black"));
        Car newc = storage.get("1234");

        System.out.print("\n aaaa: " + newc);

    }

}
