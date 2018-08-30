package com.curso.interfaces;

/**
 * @author JLIL
 */
public class MiPrimerLambda {
    public static void main(String[] args) {
        Operacion s = new Suma();
        int a = 1, b=2;
        int r = s.calcular(a, b);
        
        Operacion m = new Operacion() {
            public int calcular(int a, int b) { return a*b;}
        };
        r = m.calcular(a, b);
        
        Operacion d = (x , y) -> { return x/y; };
        
        System.out.println("Multiplicar: " + m.calcular(3, 6));
        System.out.println("Dividir: " + d.calcular(9, 3));
        
        ejecutarOperacion(d);
        
        ejecutarOperacion(   (x, y) -> { return x % y; }   );

        ejecutarOperacion(   (x, y) -> x % y );
        
    }
    
    public static void ejecutarOperacion(Operacion o) {
        System.out.println("Resultado: " + o.calcular(10, 5));
    }
    
    
}
//Libreria
interface Operacion {
    int calcular(int a, int b);
}
class Suma implements Operacion {
    public int calcular(int a, int b) { return a+b; }    
}
class Resta implements Operacion {
    public int calcular(int a, int b) {return a-b;}
}
