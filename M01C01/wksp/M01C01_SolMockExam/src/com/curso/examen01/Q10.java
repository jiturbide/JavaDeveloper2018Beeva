package com.curso.examen01;

public class Q10 {
    {
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));    
    }    
    public static void main(String[] args) {
        new Q10();
    }
}
/*
Question 10.
Which are the results of the following code?
(Choose all that apply)
String numbers = "012345678";
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.println(numbers.substring(7));
A. 12
B. 123
C. 7
D. 78
E. A blank line.
F. An exception is thrown.
G. The code does not compile.
R: A,D,E
*/