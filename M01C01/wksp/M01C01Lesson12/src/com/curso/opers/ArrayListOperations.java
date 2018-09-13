package com.curso.opers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
        List meses = Arrays.asList("Diciembre", "Abril", "Septiembre");
        System.out.println("1. meses: " + meses);
        
        Collections.sort(meses);
        System.out.println("2. meses: " + meses);
        
        meses.set(0, "Noviembre");
        System.out.println("3. meses:" + meses);
        //meses.add("Agosto");
        
        List months = new ArrayList(meses);
        months.add("Febrero");
        System.out.println("4. months: " + months);
        
        months.remove(args);

    }
}

/*
add()
remove()
set()
isEmpty() and size()
clear()
contains()
equals()
Collections.sort(list);

*/
