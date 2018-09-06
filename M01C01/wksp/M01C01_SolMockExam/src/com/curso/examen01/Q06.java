package com.curso.examen01;

public class Q06 {
    public static void main(String[] args) {
     final char a = 'A', d = 'D';
     char grade = 'B';
     switch(grade) {
     case a:
     case 'B': System.out.print("great");
     case 'C': System.out.print("good"); break;
     case d:
     case 'F': System.out.print("not good");
    }
  }
}
/*
Question 06.
What is the result of the following code snippet?
3: final char a = 'A', d = 'D';
4: char grade = 'B';
5: switch(grade) {
6: case a:
7: case 'B': System.out.print("great");
8: case 'C': System.out.print("good"); break;
9: case d:
10: case 'F': System.out.print("not good");
11: }
A. great
B. greatgood
C. The code will not compile because of line 3.
D. The code will not compile because of line 6.
E. The code will not compile because of lines 6 and 9.

R: B
*/