package com.curso.examen01;

public class Q20 {

}
/*
20. What is the output of the following code?
1: package rope;
2: public class Rope {
3: public static int LENGTH = 5;
4: static {
5: LENGTH = 10;
6: }
7: public static void swing() {
8: System.out.print("swing ");
9: }
10: }
1: import rope.*;
2: import static rope.Rope.*;
3: public class Chimp {
4: public static void main(String[] args) {
5: Rope.swing();
6: new Rope().swing();
7: System.out.println(LENGTH);
8: }
9: }
A. swing swing 5
B. swing swing 10
C. Compiler error on line 2 of Chimp.
D. Compiler error on line 5 of Chimp.
E. Compiler error on line 6 of Chimp.
F. Compiler error on line 7 of Chimp.
R: B
*/