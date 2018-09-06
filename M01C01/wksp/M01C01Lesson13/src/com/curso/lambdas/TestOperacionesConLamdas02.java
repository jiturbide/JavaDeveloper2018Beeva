package com.curso.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestOperacionesConLamdas02 {
    public static void main(String[] args) {
        List <String>meses = Arrays.asList("enero", "abril", "mayo", "febrero", "marzo");

        meses.forEach(  (x) -> { System.out.println(x.toUpperCase()); }  );
        
        recorrer(meses);
    }
    //Logica fija, para variarla necesito crear otro metodo
    public static void recorrer(List <String>lista) {
        for (String string : lista) {
            System.out.println("A:" + string);
        }
    }
    
}

