package com.curso.herencia.soluciones;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author JLIL
 */
public class TestStaticReferences {
    public static void main(String[] args) {
        Codificador c = new Codificador();
        String res = c.codificar("HolaMundo");
        System.out.println(res);
        System.out.println(c.decodificar(res));
    }
}


