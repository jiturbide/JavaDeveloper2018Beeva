package com.curso.boxing;

public class TestBoxing {
    public static void main(String[] args) {
        //boxing
        Integer ii = new Integer(2);
        //unboxing
        int a = ii.intValue();
        //autoboxing
        ii = 2;
        //autounboxing
        a = ii + 1;
        
        //Byte b = new Byte(null); 
        Byte b1 = new Byte((byte)3);
        
        Character c01 = new Character('a');
        c01 = new Character(Character.MAX_VALUE);
        
        Boolean b01 = new Boolean("truE");
        
        System.out.println(b01);
        
    }
}
