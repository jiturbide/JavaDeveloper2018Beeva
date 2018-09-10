package com.curso.examen01.q19.my.city;     //1
import com.curso.examen01.q19.my.school.*;  //2
public class School {                       //3
public static void main(String[] args) {    //4
System.out.println(Classroom.globalKey);    //5 B
Classroom room = new Classroom(101, ""Mrs. Anderson"); //6 C
System.out.println(room.roomNumber);        //7 D
System.out.println(room.floor);             //8 E
System.out.println(room.teacherName); } }   //9 F
