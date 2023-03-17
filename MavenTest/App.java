package org.example;

import java.time
        .LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {

        /*Methods m = new Methods();

        LocalDate d = LocalDate.parse("2023-03-07");
        LocalDate d2 = LocalDate.parse("2023-03-11");
        LocalDate d3 = LocalDate.parse("2023-03-12");
        LocalDate d4 = LocalDate.parse("2023-03-14");
        LocalDate d5 = LocalDate.parse("2023-03-18");


        CalendarItem egy = new CalendarItem(d, "job1", true, "job neve", 2);
        CalendarItem k = new CalendarItem(d2, "", false, "", 3);
        CalendarItem h = new CalendarItem(d3, "job2", true, "job neve2", 6);
        CalendarItem n = new CalendarItem(d4, "job3", true, "job neve3", 1);
        CalendarItem ö = new CalendarItem(d5, "", false, "", 3);


        List<CalendarItem> list = new ArrayList<CalendarItem>();
        list.add(egy);
        list.add(k);
        list.add(h);
        list.add(n);
        list.add(ö);

        List<JobItem> j = m.conversion(list);

        for (int i = 0; i < j.size(); i++) {

            System.out.println(j.get(i).getId() + "   " + j.get(i).getName() + "   " + j.get(i).getStart() + "   " + j.get(i).getEnd() + "\n");

        }*/

        Calculator c = new Calculator();

        char operator;
        Double number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        c.calculate(operator, number1, number2);

        input.close();

    }

}
