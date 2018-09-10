package com.curso.opers;

import java.util.Comparator;

public class MesComparator implements Comparator{

    public int compare(Object o1, Object o2) {
        int decision = 0;
        Mes m1 = (Mes) o1;
        Mes m2 = (Mes) o2;
        
        //Si mes1 equivalente ó igual a mes2 => retorna 0 
        if(m1.getNumero() == m2.getNumero()) return 0;
        //Si en criterio Mes 1 es Mayor a Mes 2 => retorna 1
        if(m1.getNumero() > m2.getNumero()) return 1;
        //Si en creiterio Mes 1 es Menor a Mes 2 => retorna -1
        if(m1.getNumero() < m2.getNumero()) return -1;
                
        return decision;
    }

}
