package com.curso.interfaces;

import java.util.Arrays;
import java.util.List;

public class TestFiltroOld {
    public static void main(String[] args) {
        List <String>lista = Arrays.asList("hola", "shit", "damn", "chin");
        
        FiltroPalabrotas fp = new FiltroPalabrotas();
        //Filtrar palabrotas
        for (String w : lista) {
            if(fp.filtrarSi(w)) continue;
            else System.out.println(w);
        }
        
        
    }
}
