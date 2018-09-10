package com.curso.opers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeOperations {

    public static void main(String[] args) {
        //Formas de creacion
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        //Llamadas invalidas
        /* * /
        LocalDate d = new LocalDate(); // No compila
        LocalDate.of(2015, Month.JANUARY, 32) // Lanza DateTimeException
        /* */
        
        //Modificar valores -------------------------------------
        /* * /
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);

        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28

        LocalDate date01 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time01 = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date01, time01);
        System.out.println(dateTime); // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30
        /* */
        
        //Encadenar llamadas
        /* * /
        LocalDate date03 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time03 = LocalTime.of(5, 15);
        LocalDateTime dateTime03 = LocalDateTime.of(date03, time03)
        .minusDays(1).minusHours(10).minusSeconds(30);

        LocalDate date04 = LocalDate.of(2020, Month.JANUARY, 20);
        date04.plusDays(10);
        System.out.println(date04);
        /* */        
    }
}
