package com.curso;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        byte intentos = 5;
        byte rangomaximo = 10;
        Scanner input = new Scanner(System.in);
        byte guess = 0;
        
        //Recupera el rango de valores
        //Si no se proporciono un rango se debe usar del 1 al 10
        //El numero de intentos default es 5
        
        System.out.printf("Adivina un numero entre 0 y %d %n", rangomaximo);
        int aleatorio = new Random().nextInt(rangomaximo);

        System.out.println("Que numero?");
        guess = input.nextByte();
        System.out.println("guess: " + guess);
        
        //Ciclo de comparacion
        //{
            //Pide el valor
        
            //Compara contra el valor proporcionado, si es incorrecto decrementa los intentos y muestra
            //Si es correcto muestra el valor correcto
        //}
        
        //Extra: Imprimir Awesome si adivino a la primera
        //Extra: Preguntar si desea jugar de nuevo
    }
}
