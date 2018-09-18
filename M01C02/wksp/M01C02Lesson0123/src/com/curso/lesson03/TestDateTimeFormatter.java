package com.curso.lesson03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static java.lang.System.out;
import java.time.format.FormatStyle;

/**
 * @author JLIL
 */
public class TestDateTimeFormatter {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        out.println(date.getDayOfWeek());
        out.println(date.getMonth()); // SEPTEMBER
        out.println(date.getYear()); // 2018
        out.println(date.getDayOfYear());

        date = LocalDate.parse("2020-01-20");
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        out.println("ISO_LOCAL_DATE: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        out.println("ISO_LOCAL_TIME: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        out.println("ISO_LOCAL_DATE_TIME: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime = null;
        shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        out.println(shortDateTime.format(dateTime)); // 1/20/20
        out.println(shortDateTime.format(date)); // 1/20/20
        //out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

        shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        out.println(dateTime.format(shortDateTime));
        out.println(date.format(shortDateTime));
        //out.println(time.format(shortDateTime)); // UnsupportedTemporalTypeException

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
        
        f = DateTimeFormatter.ofPattern("hh:mm");
        f.format(dateTime);
        //f.format(date);   //java.time.temporal.UnsupportedTemporalTypeException
        f.format(time);
    }
}
