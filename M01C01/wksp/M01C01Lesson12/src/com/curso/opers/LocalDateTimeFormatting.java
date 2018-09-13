package com.curso.opers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeFormatting {

    public static void main(String[] args) {
        LocalDate date0 = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date0.getDayOfWeek()); // MONDAY
        System.out.println(date0.getMonth()); // JANUARY
        System.out.println(date0.getYear()); // 2020
        System.out.println(date0.getDayOfYear()); // 20

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date
                .format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        /* * /
        DateTimeFormatter shortDateTime
                = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
        System.out.println(
                shortDateTime.format(time)); // UnsupportedTemporalTypeException
        /* */
        
        //Formateo con constantes predefinidas ----------------------------
        /* * /
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        DateTimeFormatter shortF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime1)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime1)); // Jan 20, 2020 11:12:34 AM

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f)); // January 20, 2020, 11:12

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
        f1.format(dateTime);
        f1.format(date);
        f1.format(time);
        /* */
        
        //Parsing
        /* * /
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date2 = LocalDate.parse("01 02 2015", f2);
        LocalTime time2 = LocalTime.parse("11:22");
        System.out.println(date2); // 2015-01-02
        System.out.println(time2); // 11:22
        /* */
    }
}
