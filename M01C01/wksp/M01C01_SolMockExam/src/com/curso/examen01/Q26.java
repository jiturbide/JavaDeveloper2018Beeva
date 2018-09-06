package com.curso.examen01;

public class Q26 {
  public static void main(String[] args) {
    System.out.print(Order.result + " ");
    System.out.print(Order.result + " ");
    new Order();
    new Order();
    System.out.print(Order.result + " ");
  }
}
class Order {
    static String result = "";
    { result += "c"; }
    static
    { result += "u"; }
    { result += "r"; }
  }
/*
26. What is the result of the following?
1: public class Order {
2: static String result = "";
3: { result += "c"; }
4: static
5: { result += "u"; }
6: { result += "r"; }
7: }
1: public class OrderDriver {
2: public static void main(String[] args) {
3: System.out.print(Order.result + " ");
4: System.out.print(Order.result + " ");
5: new Order();
6: new Order();
7: System.out.print(Order.result + " ");
8: }
9: }
A. curur
B. ucrcr
C. u ucrcr
D. u u curcur
E. u u ucrcr
F. ur ur urc
G. The code does not compile.
R: E
*/