package com.curso;

public class UtilidadCarga2 {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");

        //Validacion  
        try {
            String entrada = args[0];
            String binario = Integer.toBinaryString(Integer.parseInt(entrada));
            System.out.println("El binario de " + entrada + " es: " + binario);
        } catch(Exception e) {
            System.out.println("Ocurrio un problema!");
            e.printStackTrace();
        }        
    }
}
