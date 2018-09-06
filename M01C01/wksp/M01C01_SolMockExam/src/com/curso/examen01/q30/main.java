package com.curso.examen01.q30;

/* A * /
class main { public void main(String[] args) { System.out.println("hello"); } }
/* */

/* B * /
public static void main4(String[] args) { System.out.println("hello"); } 
/* */

/* C * /
public class anotherone{ } 
class main { 
  public static void main(String[] args) { System.out.println("hello"); } } 

/* D * /
class anothermain{ 
  public static void main(String[] args) { System.out.println("hello2"); } } 
class main { 
  public final static void main(String[] args) { System.out.println("hello"); } }
/* */

/*
30. The options below contain the complete contents of a file (the name of the file is not specified). Which of these options can be run with the following command line once compiled? java main
Select 1 option
A.
//in file main.java class main { public void main(String[] args) { System.out.println("hello"); } }
B.
//in file main.java public static void main4(String[] args) { System.out.println("hello"); }
C.
//in file main.java public class anotherone{ } class main { public static void main(String[] args) { System.out.println("hello"); } }
D.
//in file main.java class anothermain{ public static void main(String[] args) { System.out.println("hello2"); } } class main

R: D
*/
