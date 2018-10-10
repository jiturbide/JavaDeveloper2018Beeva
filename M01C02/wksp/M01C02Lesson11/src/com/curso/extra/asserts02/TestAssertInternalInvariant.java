package com.curso.extra.asserts02;

import java.util.Random;

//Una asuncion se le conoce como Invariante Interna. Puede probarse con un assert 
public class TestAssertInternalInvariant {
    public static void main(String[] args) {
        int status = new Random().nextInt(2);
        if (status == 0) {
            System.out.println("Es 0");
        } else if (status > 0) {
            System.out.println("Es > 0");
        } else { // (1) Deberia ser negativo
            System.out.println("Debe ser < 0");
        }

        if (status == 0) {
            System.out.println("Es 0");
        } else if (status > 0) {
            System.out.println("Es > 0");
        } else { // Deberia ser negativo
            assert status < 0 : status; // (2)
        }
        
    }//main
}
