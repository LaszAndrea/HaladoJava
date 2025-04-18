package org.example.solution2;

import org.example.M;
import org.example.classbased.*;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    private static M m = new M();

    public static void main(String[] args) {

        flow(
                Main::randomSupplier,
                Main::negativeTest,
                Main::output
        );

        //Lambda kifejezések
        flow(
                ()-> new Random().nextInt(),
                (v) -> v % 2 == 0,
                (v) -> System.out.println(v)
        );

        flow(
                ()-> new Random().nextInt(),
                (v) -> v % 2 == 0,
                System.out::println
        );

        flow(
                new InputImpl()::get,
                new FilterImpl()::isOk,
                new OutputImpl()::put
        );



    }

    public static void flow(Supplier<Integer> input, Predicate<Integer> filter, Consumer<Integer> output){

        int value = input.get();
        if(filter.test(value)){

            output.accept(value);

        }

    }

    private static Integer randomSupplier(){
        return new Random().nextInt();
    }

    private static Boolean negativeTest(Integer value){
        return value < 0;
    }

    private static void output(Integer value){
        System.out.print(value);
    }




}