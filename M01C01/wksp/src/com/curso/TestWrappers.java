package com.curso;

public class TestWrappers {

   public static void main(String args[]) {
       Byte b1 = new Byte((byte)2); //Toma el valor del PCW
       Byte b2 = 2;   //Autoboxing
       Byte b3 = 2;   //Autoboxing

       System.out.println("b1==b2: " + (b1==b2));
       System.out.println("b2==b3: " + (b2==b3));
       System.out.println("b1 equals b2: " + (b1.equals(b2)));

       Integer i1 = 127;
       Integer i2 = 127;
       System.out.println("i1==i2: " + (i1==i2)); //?

   }

}
