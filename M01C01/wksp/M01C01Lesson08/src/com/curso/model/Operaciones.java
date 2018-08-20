package com.curso.model;

public class Operaciones {

    public static void main(String[] args) {
        //sumar( (byte) 1, (short) 2);
        sumar( (short) 1, 2);        
        sumar( 1, 2);
        sumar( (short) 1, (byte) 2);
        
        sumar( (byte) 1, (byte) 2);
    }
    
//    public static int sumar(byte a, byte [] b ) { 
//        byte suma = a;
//        for(byte tmp: b) { suma += tmp; }
//        System.out.println("sumar(byte ... b)"); return suma; }    

    public static int sumar(byte a, byte ... b ) { 
        byte suma = a;
        for(byte tmp: b) { suma += tmp; }
        System.out.println("sumar(byte ... b)"); return suma; }    
    
    public static int sumar(Short a, Byte b) { 
        System.out.println("sumar(Short a, Byte b)"); return a+b; }
    
    public static int sumar(short a, Integer b) { 
        System.out.println("sumar(short a, Integer b)"); return a+b; }

//    public static int sumar(byte a, byte b) { 
//        System.out.println("sumar(byte a, byte b)"); return a+b; }
    
//    public static int sumar(short a, short b) { 
//        System.out.println("sumar(short a, short b)"); return a+b; }

//    public static int sumar(byte a, short b) { 
//        System.out.println("sumar(byte a, short b)"); return a+b; }
    
//    public static int sumar(int a, int b) { 
//        System.out.println("sumar(int a, int b)"); return a+b; }
    
    public static int sumar(Integer a, Integer b) { 
        System.out.println("sumar(Integer a, Integer b)"); return a+b; }
    
}
