package com.curso.examen01;

import java.time.LocalDate;
import java.util.Calendar;


public class Q15 {
    public static void main(String[] args) {
        LocalDate date = new LocalDate(2014, 6, 21);
        System.out.println("Date: " + date);
    }
}
/*
15. Which of the following can be inserted into the blank to create a date June 21, 2014?
(Choose all that apply)
import java.time.*;
public class StartOfSummer {
public static void main(String[] args) {
LocalDate date = ____________________________
}
}
A. new LocalDate(2014, 5, 21);
B. new LocalDate(2014, 6, 21);
C. LocalDate.of(2014, 5, 21);
D. LocalDate.of(2014, 6, 21);
E. LocalDate.of(2014, Calendar.JUNE, 21);
F. LocalDate.of(2014, Month.JUNE, 21);
R: D,F
*/