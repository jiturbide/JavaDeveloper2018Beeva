package com.curso.lesson03;

public class TestEqualsHashCode {
    public static void main(String[] args) {
        Alumno a = new Alumno(20, "Jluis", 'M');
        Alumno a1 = new Alumno(20, "Jluis", 'F');
        System.out.println(a);
        
        //equals y hashcode
        
        System.out.println("Iguales: " + "Hola".equals(new String("Hola")) );
        
        System.out.println("Iguales: " + a.equals(a1));
        
        
    }
}
