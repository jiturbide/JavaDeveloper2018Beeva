package com.curso.examen01;

public class Q29 {
    public static void main(String[] args) {
    new Create(100);
    new Create(1000L);
    }
}
class Create {
    Create() {
    System.out.print("1 ");
    }
//    Create(int num) {
//    System.out.print("2 ");
//    }
    Create(Integer num) {
    System.out.print("3 ");
    }
    Create(Object num) {
    System.out.print("4 ");
    }
    Create(int... nums) {
    System.out.print("5 ");
    }
}
/*
29. Which of the following are true about the following code? (Choose all that apply)
public class Create {
Create() {
System.out.print("1 ");
}
Create(int num) {
System.out.print("2 ");
}
Create(Integer num) {
System.out.print("3 ");
}
Create(Object num) {
System.out.print("4 ");
}
Create(int... nums) {
System.out.print("5 ");
}
public static void main(String[] args) {
new Create(100);
new Create(1000L);
}
}
A. The code prints out 2 4.
B. The code prints out 3 4.
C. The code prints out 4 2.
D. The code prints out 4 4.
E. The code prints 3 4 if you remove the constructor Create(int num).
F. The code prints 4 4 if you remove the constructor Create(int num).
G. The code prints 5 4 if you remove the constructor Create(int num).
R: A, E
*/