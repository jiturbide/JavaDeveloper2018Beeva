package com.curso.examen01;

public class Q40 {
 public static void main(String[] args) {
     System.out.println("foo:" + foo());
 }
 public static int foo() {
  int a=0, b=0;
  try {
   return a / b;
  } catch (RuntimeException e) {
      e.printStackTrace();
   return -1;
  } catch (ArithmeticException e) {
      e.printStackTrace();
   return 0;
  } finally {
   System.out.print("done");
  }
 }
}

/*
40. What is the output of the following snippet, assuming a and b are both 0?
3: try {
4: return a / b;
5: } catch (RuntimeException e) {
6: return -1;
7: } catch (ArithmeticException e) {
8: return 0;
9: } finally {
10: System.out.print("done");
11: }
A. -1
B. 0
C. done-1
D. done0
E. The code does not compile.
F. An uncaught exception is thrown.

R:E
*/