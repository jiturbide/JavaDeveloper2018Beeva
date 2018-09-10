package com.curso.lambdas;

import java.util.Arrays;
import java.util.List;


public class TestOperacionesConLamdas03 {
    public static void main(String[] args) {
        List <String>meses = Arrays.asList("enero", "abril", "mayo", "febrero", "marzo");

        meses.forEach(  (x) -> { System.out.println(x.toUpperCase()); }  );
        
        Procesable p = new Procesable() {
           public void procesar(List items) {
               for (Object o : items) {
                   System.out.println("B:" + o);
               }
           } 
        };
        recorrer(p, meses);
    }
    //Logica fija, para variarla necesito crear otro metodo
    public static void recorrer(Procesable tarea, List items) {
        tarea.procesar(items);
    }    
}

interface Procesable{
    void procesar(List items);
}

