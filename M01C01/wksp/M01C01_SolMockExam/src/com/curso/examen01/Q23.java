package com.curso.examen01;


public class Q23 {
  public void print(byte x) {
  System.out.print("byte");
  }
  public void print(int x) {
  System.out.print("int");
  }
  public void print(float x) {
  System.out.print("float");
  }
  public void print(Object x) {
  System.out.print("Object");
  }
  public static void main(String[] args) {
  Q23 t = new Q23();
  short s = 123;
  t.print(s);
  t.print(true);
  t.print(6.789);
  }        
}
/*
23. What is the result of the following statements?
1: public class Test {
2: public void print(byte x) {
3: System.out.print("byte");
4: }
5: public void print(int x) {
6: System.out.print("int");
7: }
8: public void print(float x) {
9: System.out.print("float");
10: }
11: public void print(Object x) {
12: System.out.print("Object");
13: }
14: public static void main(String[] args) {
15: Test t = new Test();
16: short s = 123;
17: t.print(s);
18: t.print(true);
19: t.print(6.789);
20: }
21: }
A. bytefloatObject
B. intfloatObject
C. byteObjectfloat
D. intObjectfloat
E. intObjectObject
F. byteObjectObject
*/