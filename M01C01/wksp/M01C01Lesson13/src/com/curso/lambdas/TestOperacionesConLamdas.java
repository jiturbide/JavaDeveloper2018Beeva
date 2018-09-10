package com.curso.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestOperacionesConLamdas {
    public static void main(String[] args) {
        List <String>meses = Arrays.asList("enero", "abril", "mayo", "febrero", "marzo");
        Collections.sort(meses);
        for (String string : meses) {
            System.out.println(string);
        }
        meses.forEach(  (x) -> { System.out.println(x.toUpperCase()); }  );
    }
}

