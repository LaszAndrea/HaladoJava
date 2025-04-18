package org.example;

import org.example.model.Calendar;

import java.time.LocalDate;

public class CalendarItemBuilder {

    private LocalDate datum;
    private String jobId;
    private boolean occupied;
    private String comment;
    private int dayOfWeek;

    public CalendarItemBuilder setDatum(LocalDate datum) {
        this.datum = datum;
        return this;
    }

    public CalendarItemBuilder setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public CalendarItemBuilder setOccupied(boolean occupied) {
        this.occupied = occupied;
        return this;
    }

    public CalendarItemBuilder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public CalendarItemBuilder setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public Calendar build(){
        return new Calendar(datum, jobId, occupied, comment, dayOfWeek);
    }

}
