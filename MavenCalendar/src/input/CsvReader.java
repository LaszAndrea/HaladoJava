package org.example.input;

import org.example.model.Calendar;

import java.util.List;

public interface CsvReader {

    List<Calendar> load(String fileName);

}
