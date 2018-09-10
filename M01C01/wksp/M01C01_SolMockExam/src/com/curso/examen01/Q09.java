package com.curso.examen01;

/**
 * @author JLIL
 */
public class Q09 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");        
    }
}
/*
Question 09.
Which of the following are output by this code?
(Choose all that apply)
3: String s = "Hello";
4: String t = new String(s);
5: if ("Hello".equals(s)) System.out.println("one");
6: if (t == s) System.out.println("two");
7: if (t.equals(s)) System.out.println("three");
8: if ("Hello" == s) System.out.println("four");
9: if ("Hello" == t) System.out.println("five");
A. one
B. two
C. three
D. four
E. five
F. The code does not compile.

R: A,C,D
*/
