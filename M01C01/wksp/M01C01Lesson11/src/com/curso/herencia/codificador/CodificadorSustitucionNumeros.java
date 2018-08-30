package com.curso.herencia.codificador;

import com.curso.herencia.soluciones.*;

/**
 * @author JLIL
 */
public class CodificadorSustitucionNumeros extends Codificador{
    public static void info() {
        System.out.println("Codificacion con sustitucion de numeros");
    }
    @Override
    public String codificar(String msg) {
        String res = msg.replace('a', '4');
        res = res.replace('e', '3');
        res = res.replace('i', '1');
        res = res.replace('o', '0');
        res = res.replace('u', '7');
        return res;
    }
    @Override
    public String decodificar(String msg)  {
        String res = msg.replace('4', 'a');
        res = res.replace('3', 'e');
        res = res.replace('1', 'i');
        res = res.replace('0', 'o');
        res = res.replace('7', 'u');
        return res;
    }
}
