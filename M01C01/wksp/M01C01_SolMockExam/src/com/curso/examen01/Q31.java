package com.curso.examen01;


public class Q31 {

}

interface Base {
  boolean m1 ();
  byte m2(short s);
}

/*
31. Given the following,
1. interface Base {
2. boolean m1 ();
3. byte m2(short s);
4. }
Which code fragments will compile?
(Choose 2 options)
A. interface Base2 implements Base { }
B. abstract class Class2 extends Base {
public boolean ml() { return true; } }
C. abstract class Class2 implements Base { }
D. abstract class Class2 implements Base {
public boolean m1() { return (true); } }
E. class Class2 implements Base {
boolean m1( ) { return false; }
byte m2(short s) { return 42; } }
R: C,D
*/