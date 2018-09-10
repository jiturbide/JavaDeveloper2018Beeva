package com.curso.opers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
        List meses = Arrays.asList("Diciembre", "Abril", "Septiembre");
        System.out.println("meses: " + meses);
        Collections.sort(meses);
        System.out.println("meses: " + meses);
        meses.set(0, "Noviembre");
        System.out.println("meses:" + meses);
        
        List months = new ArrayList(meses);
        months.add("Febrero");
        System.out.println("months: " + months);
        
        months.remove(args);

    }
}


