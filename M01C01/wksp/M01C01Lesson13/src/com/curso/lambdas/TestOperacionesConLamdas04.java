package com.curso.lambdas;

import java.util.Arrays;
import java.util.List;
/*
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;
*/
import java.util.function.Consumer;

public class TestOperacionesConLamdas04 {
    public static void main(String[] args) {
        List <String>meses = Arrays.asList("enero", "abril", "mayo", "febrero", "marzo");

        meses.forEach(  (x) -> { System.out.println(x.toUpperCase()); }  );
        
        Consumer <List>p = new Consumer<List>() {
           public void accept(List items) {
               for (Object o : items) {
                   System.out.println("B:" + o);
               }
           } 
        };
        recorrer(p, meses);
        recorrer((l) -> { 
              List lista = (List) l;
              for (Object x : lista) {
                   System.out.println("C:" + ((String)x).toUpperCase());
               }
        
        } , meses);
    }
    //Logica fija, para variarla necesito crear otro metodo
    public static void recorrer(Consumer tarea, List items) {
        tarea.accept(items);
    }    
}
