package com.curso.herencia.soluciones;

/**
 * @author JLIL
 */
public abstract class CodificadorFactory {
    public static final String VERSION = "v0.0";
    
    public static Codificador getIinstance() {
        return new CodificadorBase64();
    }
    public static void info() {
        System.out.println("Clase Base Codificador Factory"  + VERSION);
    } 
}
