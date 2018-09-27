package com.curso.interfaces;

public class TestInterfaces1 {
    public static void main(String[] args) {
        Filtrable1 f = null;
        //f.printInfo();
        Filtrable1.printVersion();
        System.out.println("Filtrar: " + new FiltroPalabrotas1().filtrarSi("hola"));
    }
}
@FunctionalInterface
interface Filtrable1 {
    String VERSION = "1.2";
    public abstract boolean filtrarSi(String evaluar);
    default void printInfo(){ System.out.println("Filtrable"); }
    static void printVersion() { System.out.println("Version: " + VERSION); }
}

class FiltroPalabrotas1 implements Filtrable1 {
    public FiltroPalabrotas1() { this.printInfo(); }
    
    public boolean filtrarSi(String evaluar) {
        return evaluar.equalsIgnoreCase("shit");
    }
    public void printInfo(){ System.out.println("FiltroPalabrotas"); }
}