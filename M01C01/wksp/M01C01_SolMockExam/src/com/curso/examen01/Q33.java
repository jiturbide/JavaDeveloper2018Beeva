package com.curso.examen01;

import java.util.function.*;

public class Q33 {
    
}

class Panda {
 int age;
 public static void main(String[] args) {
   Panda p1 = new Panda();
   p1.age = 1;
   check(p1, p -> p.age < 5);
 }
 private static void check(Panda panda, Predicate<Panda> pred) {
   String result = pred.test(panda) ? "match" : "not match";
   System.out.print(result);
 } }
/*
33. What is the result of the following class?
1: import java.util.function.*;
2:
3: public class Panda {
4: int age;
5: public static void main(String[] args) {
6: Panda p1 = new Panda();
7: p1.age = 1;
8: check(p1, p -> p.age < 5);
9: }
10: private static void check(Panda panda, Predicate<Panda> pred) {
11: String result = pred.test(panda) ? "match" : "not match";
12: System.out.print(result);
13: } }
A. match
B. not match
C. Compiler error on line 8.
D. Compiler error on line 10.
E. Compiler error on line 11.
F. A runtime exception is thrown.

R: A
*/