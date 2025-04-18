package org.example;

import org.example.input.CsvReader;
import org.example.model.Calendar;
import org.example.output.Printer;

import java.util.List;

public class CalendarEngineImpl implements CalendarEngine {

    private final CsvReader csvReader;
    private final Printer printer;
    private final JobConverter jobConverter;

    public CalendarEngineImpl(CsvReader csvReader, Printer printer, JobConverter jobConverter) {
        this.csvReader = csvReader;
        this.printer = printer;
        this.jobConverter = jobConverter;
    }

    @Override
    public void process(String fileName) {

        printer.print(
                jobConverter.conversion(
                        csvReader.load(fileName)
                )
        );

    }

}
