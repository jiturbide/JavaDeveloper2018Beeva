package com.curso.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestFiltro {
    public static void main(String[] args) {
        List <String>lista = Arrays.asList("Hola", "shit", "damn", "chin", "mundo");
        
        FiltroPalabrotas fp = new FiltroPalabrotas();
        
        for (String w : lista) {
            if( !fp.filtrarSi(w)) System.out.println("w:" + w);
        }
        //Clase Anonima
        Predicate <String>r1 = new Predicate<String>(){
          public boolean test(String word) {
              //String word = "";
              return word.equalsIgnoreCase("shit") || word.equalsIgnoreCase("chin");
          }  
        };
        System.out.println("----------------------");
        for (String w : lista) {
            if( !r1.test(w)) System.out.println("w:" + w);
        }
        String extraRule = "fool";
        
        Filtrable r2 = (String word) -> { return word.equalsIgnoreCase("damn"); } ;
        
        Filtrable r3 = word -> { return word.equalsIgnoreCase("damn"); };
        
        Filtrable r4 = word -> word.equalsIgnoreCase("damn") ;

        Filtrable r5 = w -> w.equalsIgnoreCase("damn") || w.equalsIgnoreCase(extraRule) ;
        System.out.println("-----------------");
        
        Predicate <String>p = w -> !w.equalsIgnoreCase("damn");
        Consumer <String>c = w -> System.out.println(w);
        
        lista.stream().filter(p).forEach(c);
        
        
    }
}
