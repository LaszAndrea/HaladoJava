package org.example;

import org.example.model.Calendar;
import org.example.model.Job;

import java.util.List;

public interface JobConverter {

    List<Job> conversion(List<Calendar> ci);

}
