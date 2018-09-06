package com.curso.examen01;

public class Q37 {
  public static void main(String[] args) {
    DoSomething.main(new String[]{});
  }
}

class DoSomething {
 public void go() {
  System.out.print("A");
  try {
   stop();
  } catch (ArithmeticException e) {
  System.out.print("B");
  } finally {
  System.out.print("C");
  }
  System.out.print("D");
 }
 public void stop() {
  System.out.print("E");
  Object x = null;
  x.toString();
  System.out.print("F");
  }
  public static void main(String[] args) {
    new DoSomething().go();
 }
}

/*
37. What is printed besides the stack trace caused by the NullPointerException from line 16?
1: public class DoSomething {
2: public void go() {
3: System.out.print("A");
4: try {
5: stop();
6: } catch (ArithmeticException e) {
7: System.out.print("B");
8: } finally {
9: System.out.print("C");
10: }
11: System.out.print("D");
12: }
13: public void stop() {
14: System.out.print("E");
15: Object x = null;
16: x.toString();
17: System.out.print("F");
18: }
19: public static void main(String[] args) {
20: new DoSomething().go();
21: }
22: }
A. AE
B. AEBCD
C. AEC
D. AECD
E. No output appears other than the stack trace.
R: C
*/