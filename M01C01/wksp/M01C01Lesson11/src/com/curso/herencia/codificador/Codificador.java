package com.curso.herencia.codificador;

public abstract class Codificador {
    public static final String VERSION = "v1.0";
    private static final Codificador instance = new CodificadorSustitucionNumeros();  
    
    public static void info() {
        System.out.println("Clase Base Codificador ");
    } 
    public String codificar(String msg) {return "C";}
    public String decodificar(String msg){return "D";}
//    public abstract String codificar(String msg) ;
//    public abstract String decodificar(String msg);
    
    //Patron Diseño Factory
    public static Codificador getInstance() {
        return instance;
    }
}
