package com.curso;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        int anio = 2018, mes = 8;
        
        //Validar que se hayan proporcionado 2 argumentos
        if(args.length != 2) {
            System.out.println("Uso correcto: java TestCalendar anio mes");
        }
        //Convertir los argumentos en enteros
        
        //Crear un calendar con los valores proporcionados
        
        Calendar c = Calendar.getInstance();
        c.set(anio, mes, 1);
        System.out.println(c.getTime());

        System.out.println("First week day: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Last day of month: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
        
        //Iniciar ciclo de impresion de numeros
        
        System.out.printf("Año: Mes: %n", anio, mes);
        System.out.println("Do Lu Ma Mi Ju Vi Sa");
        System.out.println("--------------------");
                          //          1  2  3  4  
                          // 5  6  7  8  9 10 11
                          //12 13 14 15 16 17 18
    }
}
