package com.curso.examen01;

import java.util.ArrayList;

public class Q12 {
    {
      ArrayList<Integer> values = new ArrayList<>();
      values.add(4);
      values.add(5);
      values.set(1, 6);
      values.remove(0);
      for (Integer v : values) System.out.print(v);
    }
    public static void main(String[] args) {
        new Q12();
    }
}
/*
12. What is the result of the following statements?
3: ArrayList<Integer> values = new ArrayList<>();
4: values.add(4);
5: values.add(5);
6: values.set(1, 6);
7: values.remove(0);
8: for (Integer v : values) System.out.print(v);
A. 4
B. 5
C. 6
D. 46
E. 45
F. An exception is thrown.
G. The code does not compile.
R: C
*/