package com.curso;

import java.util.Calendar;

public class TestCalendar1 {
    public static void main(String[] args) {
        int anio = 2018, mes = 8;
        
        //Validar que se hayan proporcionado 2 argumentos
        if(args.length != 2) {
            System.out.println("Uso correcto: java TestCalendar anio mes");
            //System.exit(-1);
        } else {
            //Convertir los argumentos en enteros
            anio = Integer.parseInt(args[0]);
            mes = Integer.parseInt(args[1]);
        }
        
        //Crear un calendar con los valores proporcionados
        Calendar c = Calendar.getInstance();
        c.set(anio, mes, 1);
        System.out.println(c.getTime());

        int primerDiaSemana = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("First week day: " + primerDia);
        int ultimoDia = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Last day of month: " + ultimoDia);
        
        //Iniciar ciclo de impresion de numeros
        
        System.out.printf("Año: %d Mes: %d %n", anio, mes);
        System.out.println("Do Lu Ma Mi Ju Vi Sa");
        System.out.println("--------------------");
                          //          1  2  3  4  
                          // 5  6  7  8  9 10 11
                          //12 13 14 15 16 17 18
        for (int i = 1; i <= ultimoDia; i++) {
            if(i < primerDiaSemana) {
                continue;
            }
        }
        
    }
}
