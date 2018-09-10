package com.curso.opers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMes {
    public static void main(String[] args) {
        List <Mes>meses = new ArrayList<>();
        meses.add(new Mes("Septiembre", 9, 30));
        meses.add(new Mes("Febrero", 2, 28));
        meses.add(new Mes("Marzo", 3, 31));
        
        System.out.println("1. meses: " + meses);
        Collections.sort(meses, new MesComparator());
        System.out.println("2. meses: " + meses);

        meses.add(new Mes("Enero", 1, 31));
        System.out.println("3. meses: " + meses);

        Collections.sort(meses, new MesComparator());
        System.out.println("4. meses: " + meses);
        
        Comparator <Mes> comp = (x,y) -> { };
        
        Collections.sort(meses, comp);
        System.out.println("5. meses con Lamda: " + meses);

        /*
        */
        //No se toma en cuenta equals ni hashcode
        
    }
}
