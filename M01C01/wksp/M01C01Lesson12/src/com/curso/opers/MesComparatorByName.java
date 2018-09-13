package com.curso.opers;

import java.util.Comparator;

public class MesComparatorByName implements Comparator<Mes>{

    @Override
    public int compare(Mes o1, Mes o2) {
        
        return o1.getNombre().compareTo(o2.getNombre());
    }

}
