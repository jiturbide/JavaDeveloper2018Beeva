package com.curso.examen01;

public class Q34 {
    {}
}

interface Climb {
 boolean isTooHigh(int height, int limit);
}

class Climber {
 public static void main(String[] args) {
  check((h, l) -> h.append(l).isEmpty(), 5);
 }
 private static void check(Climb climb, int height) {
  if (climb.isTooHigh(height, 10))
  System.out.println("too high");
  else
  System.out.println("ok");
 }
}
/*
34. What is the result of the following code?
1: interface Climb {
2: boolean isTooHigh(int height, int limit);
3: }
4:
5: public class Climber {
6: public static void main(String[] args) {
7: check((h, l) -> h.append(l).isEmpty(), 5);
8: }
9: private static void check(Climb climb, int height) {
10: if (climb.isTooHigh(height, 10))
11: System.out.println("too high");
12: else
13: System.out.println("ok");
14: }
15: }
A. ok
B. too high
C. Compiler error on line 7.
D. Compiler error on line 10.
E. Compiler error on a different line.
F. A runtime exception is thrown.

R: C
*/