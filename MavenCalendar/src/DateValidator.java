package org.example;

import org.example.model.Job;

public class DateValidator {

    public static void validate(Job item) {

        if(item.getStart().isAfter(item.getEnd())){

            DateException d = new DateException();
            throw d;

        }

    }
}
