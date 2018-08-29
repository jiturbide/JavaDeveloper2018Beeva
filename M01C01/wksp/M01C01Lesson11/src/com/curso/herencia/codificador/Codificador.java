package com.curso.herencia.codificador;

/**
 * @author JLIL
 */
public abstract class Codificador {
    public static final String VERSION = "v1.0";
    public static void info() {
        System.out.println("Clase Base Codificador "  + VERSION);
    } 
//    public String codificar(String msg) {return "C";}
//    public String decodificar(String msg){return "D";}
    public abstract String codificar(String msg) ;
    public abstract String decodificar(String msg);
}
