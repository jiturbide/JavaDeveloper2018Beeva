package com.curso.lesson03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestLocalDateTime {
    public static void main(String[] args) {
        LocalDate ld01 = LocalDate.now();
        /* * /
        ld01 = LocalDate.of(2018, 2, 29); //2018-2-29 DateTimeException
        /* */
        System.out.println("Fecha: " + ld01); 
        ld01 = ld01.minusDays(1);
        System.out.println("Fecha: " + ld01); 
        ld01 = ld01.plus(Period.ofDays(1));   //TemporalAmont <- Period
        ld01 = ld01.plus(1, ChronoUnit.DAYS); //TemporalUnit <- ChronoUnit
        System.out.println("Fecha: " + ld01); 
        
        LocalTime lt01 = LocalTime.now();
        System.out.println("Hora: " + lt01);
        long nano = lt01.getNano();
        lt01 = lt01.plusNanos(-nano);
        System.out.println("Hora: " + lt01);
        long seconds = lt01.getSecond();
        lt01 = lt01.minus(Duration.ofSeconds(seconds)); //TemporalAmount <- Duration
        System.out.println("Hora: " + lt01);
        lt01 = lt01.minus(1, ChronoUnit.SECONDS); //TemporalUnit <- ChronoUnit
        System.out.println("Hora: " + lt01);
        
        //Parsing
        System.out.println("------------------------");
        LocalDate dt = LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1); //java.time.format.DateTimeParseException
        System.out.println("dt: "  +dt);
              

    }
}
