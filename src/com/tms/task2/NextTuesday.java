package com.tms.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NextTuesday {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        while (!getDayOfWeek(date).equals("вт")) {
            date = date.plusDays(1);
        }
        System.out.println(date);
    }

    private static String getDayOfWeek(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E");
        String text = date.format(formatter);
        return text;
    }
}
