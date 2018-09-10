package com.curso.examen01.q19.my.city;     //1
import com.curso.examen01.q19.my.school.*;  //2
public class School1 extends Classroom {                       //3
    public School1(){super(1,"");}
public static void main(String[] args) {    //4
//System.out.println(Classroom.globalKey);    //5
Classroom room = new Classroom(101, "Mrs. Anderson"); //6
//System.out.println(room.roomNumber);        //7
//System.out.println(room.floor);             //8
System.out.println(room.teacherName); 
} 
    void foo() {
       this.teacherName = "Skinner";
    }


}   //9