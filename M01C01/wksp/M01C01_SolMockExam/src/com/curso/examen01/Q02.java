package com.curso.examen01;

public class Q02 {
  public static void main(String[] args) {
    Rabbit one = new Rabbit();
    Rabbit two = new Rabbit();
    Rabbit three = one;
    one = null;
    Rabbit four = one;
    three = null;
    two = null;
    two = new Rabbit();
    System.gc();
  } 
}

class Rabbit {
}

/*
Question 02.
Suppose we have a class named Rabbit. Which of the following statements are true?
(Choose all that apply)
1: public class Rabbit {
2: public static void main(String[] args) {
3: Rabbit one = new Rabbit();
4: Rabbit two = new Rabbit();
5: Rabbit three = one;
6: one = null;
7: Rabbit four = one;
8: three = null;
9: two = null;
10: two = new Rabbit();
11: System.gc();
12: } }
A. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 6.
B. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 8.
C. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 12.
D. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 9.
E. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 11.
F. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 12.

R: B: (three = null;)
*/