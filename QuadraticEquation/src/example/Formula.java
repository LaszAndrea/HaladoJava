package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Formula {

    double a, b, c;

    public Formula(double a, double b, double c) {

        if(a==0){
            NumberFormatException ex = new NumberFormatException("Ha az 'a' 0 akkor ez nem egy másodfokú egyenlet.");
            throw new LineaEquationException(ex);
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<Double> solution(){

        double diszkriminans = getDiszkriminans(a, b, c);

        if(diszkriminans<0) {
            NumberFormatException ex = new NumberFormatException("A diszkrimináns nem lehet kisebb, mint nulla.");
            throw new NoSolution(ex);
        }else{

            double solution1 = (-b + sqrt(diszkriminans)) / 2*a;
            double solution2 = (-b - sqrt(diszkriminans)) / 2*a;

            return getAllSolutions(solution1, solution2);

        }

    }

    private List<Double> getAllSolutions(double solution1, double solution2) {
        List<Double> solutions = new ArrayList<>();

        if(solution1 == solution2){
            solutions.add(solution1);
        }else{
            solutions.add(solution1);
            solutions.add(solution2);
        }

        return solutions;
    }

    private double getDiszkriminans(double a, double b, double c) {
        return pow(b, 2) - 4 * a * c;
    }

}
