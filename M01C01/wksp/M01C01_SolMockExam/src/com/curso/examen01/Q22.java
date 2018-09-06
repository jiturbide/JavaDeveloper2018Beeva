package com.curso.examen01;

import java.time.LocalDate;
import java.time.Month;

public class Q22 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        LocalDate ld01 = date.plusDays(2);
        LocalDate ld02 = date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        System.out.println(ld01);
        System.out.println(ld02);
    }
}
/*
22. What is the output of the following code?
LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
A. 2018 APRIL 2
B. 2018 APRIL 30
C. 2018 MAY 2
D. 2021 APRIL 2
E. 2021 APRIL 30
F. 2021 MAY 2
G. A runtime exception is thrown.

R: B
*/