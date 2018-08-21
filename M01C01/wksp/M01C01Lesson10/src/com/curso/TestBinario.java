package com.curso;

import java.util.Scanner;

public class TestBinario {
    public static void main(String[] args) {
        
        System.out.println("Dame un numero: ");
        Scanner input = new Scanner(System.in);
        byte request = input.nextByte();
        byte division = request;
                
        StringBuilder sb = new StringBuilder(); 
        //Ciclo de divisiones y modulo
        while(division != 0) {
            byte tmp = (byte) (division % 2);
            sb.insert(0,tmp);
            division /= 2;
        }
        System.out.printf("El binario de %d es:", request);
        System.out.printf("%s %n", sb.toString());
    }
}
