package com.curso.examen01.q19.my.school;

public class Classroom1 {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;
    public Classroom1(int r, String t) {
    roomNumber = r;
    teacherName = t; } 
}

/*
19. Given the following my.school.ClassRoom and my.city.School class definitions, which
line numbers in main() generate a compiler error? (Choose all that apply)
1: package my.school;
2: public class Classroom {
3: private int roomNumber;
4: protected String teacherName;
5: static int globalKey = 54321;
6: public int floor = 3;
7: Classroom(int r, String t) {
8: roomNumber = r;
9: teacherName = t; } }
1: package my.city;
2: import my.school.*;
3: public class School {
4: public static void main(String[] args) {
5: System.out.println(Classroom.globalKey);
6: Classroom room = new Classroom(101, ""Mrs. Anderson");
7: System.out.println(room.roomNumber);
8: System.out.println(room.floor);
9: System.out.println(room.teacherName); } }
A. None, the code compiles fine.
B. Line 5
C. Line 6
D. Line 7
E. Line 8
F. Line 9

R: B,C,D,F
*/