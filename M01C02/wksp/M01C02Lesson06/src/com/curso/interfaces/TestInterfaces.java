package com.curso.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        Filtrable f = new FiltroPalabrotas();
        f.printInfo();
        //
        Filtrable.printVersion();   //1.2
        FiltroPalabrotas.printVersion(); //1.0
        //f.printVersion();   //No nos permite
        System.out.println("----------");
        ((FiltroPalabrotas)f).printVersion();  //1.0
        System.out.println("----------");
        
        System.out.println("Filtrar: " + new FiltroPalabrotas().filtrarSi("hola"));
    }
}

class FiltroPalabrotas implements Filtrable {
    public static final String VERSION = "1.0 >>>> FiltroPalabrotas";
    public FiltroPalabrotas() { this.printInfo(); }
    
    public boolean filtrarSi(String evaluar) { return evaluar.equalsIgnoreCase("shit"); }
    
    public void printInfo(){ Filtrable.super.printInfo();
        System.out.println("FiltroPalabrotas"); 
    }
    
    public static void printVersion() { System.out.println("Version: " + VERSION);}
}

@FunctionalInterface
interface Filtrable {
    String VERSION = "1.2";
    public abstract boolean filtrarSi(String evaluar);
    default void printInfo(){ System.out.println("Filtrable"); }
    static void printVersion() { System.out.println("Version: " + VERSION); }
}