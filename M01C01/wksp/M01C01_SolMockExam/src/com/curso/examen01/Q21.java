package com.curso.examen01;

import java.util.ArrayList;
//import static java.util.Collections.*;
import static java.util.Collections.sort;
import static java.lang.System.out;

public class Q21 {
}
class Imports {
  public void method(ArrayList<String> list) {
    sort(list);
    out.println(list);
  }
}
/*
21. Which of the following can replace line 2 to make this code compile?
(Choose all that apply)
1: import java.util.*;
2: // INSERT CODE HERE
3: public class Imports {
4: public void method(ArrayList<String> list) {
5: sort(list);
6: }
7: }
A. import static java.util.Collections;
B. import static java.util.Collections.*;
C. import static java.util.Collections.sort(ArrayList<String>);
D. static import java.util.Collections;
E. static import java.util.Collections.*;
F. static import java.util.Collections.sort(ArrayList<String>);
R: B
*/