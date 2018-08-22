package com.curso.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TestDateTimes {
	public static void main(String[] args) {
		System.out.println("LocalDate ---------------------------- ");
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(LocalDate.of(2018, 1, 1));
		System.out.println(LocalDate.of(2018, Month.APRIL, 28));
		
		System.out.println("LocalTime ---------------------------- ");
		LocalTime lt = LocalTime.now();
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(ld, lt));
		System.out.println(LocalDateTime.MIN);
		System.out.println(LocalDateTime.MAX);
		LocalDateTime ldt = LocalDateTime.of(1910, 11, 20, 23, 0, 0, 1);
		System.out.println(ldt);
		System.out.println(ldt.get(java.time.temporal.ChronoField.MONTH_OF_YEAR));

		//Son inmutables
		System.out.println(ldt.minusNanos(1));
		System.out.println(ldt);

		//Operaciones
		System.out.println(ldt.minus(1, java.time.temporal.ChronoUnit.NANOS));

		System.out.println(ldt.minusMonths(1).minusHours(1).minusYears(1));

		//System.out.println(ldt.minus(-1 * Duration.ofNanos(1)));
		
		//Factory
		
		//Exceptions
		//Que excepciones se pueden genera?
		
		//Period Fechas
		Period unmes = Period.ofMonths(1);
		System.out.println(ldt.plus(unmes));
		//Duration Tiempo 
		
		//Period no se puede encadenar
		Period incorrecto = Period.ofYears(1).ofWeeks(1); // every week
		
		//Lo que en realidad sucede
		Period wrong = Period.ofYears(1);
		wrong = Period.ofWeeks(7);
		
		
		//Conversiones
		Calendar c = Calendar.getInstance();
		
		LocalDateTime ldt2 = LocalDateTime.ofEpochSecond(c.getTimeInMillis(), 0, ZoneOffset.UTC);
		
		System.out.println(ldt2);
		
		
		//Operaciones no permitidas
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period)); // 2015-02-20
		System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
		//System.out.println(time.plus(period));
		//TemporalAmount Period, Duration
		//TemporalField ChronoField
		
		dateTime = LocalDateTime.of(date, time);
		System.out.println("Format: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Format: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println("Format: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		LocalDateTime ldt3 = LocalDateTime.of(1910, 11, 20, 25, 0, 0, 1);

		//Que Ecepxiones se pueden generar?
		/** /
		java.time.DateTimeException
		java.time.UnsupportedTemporalTypeException
		/**/
		
		//Formatting
		
		//Parsing
		
		
		
	}

}
