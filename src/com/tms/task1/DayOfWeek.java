package com.tms.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DayOfWeek{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E");
        String text = date.format(formatter);
        System.out.println(text);
    }

}
