package com.curso;

public class TestStringBuilder {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        System.out.println("Inicio .......");
        
        String tmp = "";
        for (int i = 0; i <= 60000; i++) {
            tmp = tmp + i;
            
            if( (i % 1000) == 0 ) { 
                System.out.print(".");
            }
        }
        System.out.println("");
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido: " + (fin - inicio) );

        System.out.println("StringBuffer -----------------------------");
        inicio = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= 60000; i++) {
            sb.append(i);
            
            if( (i % 1000) == 0 ) { 
                System.out.print(".");
            }
        }
        System.out.println("");
        
        fin = System.nanoTime();
        System.out.println("Tiempo transcurrido (ns): " + (fin - inicio) );


        System.out.println("StringBuilder -----------------------------");
        inicio = System.nanoTime();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <= 60000; i++) {
            sb2.append(i);
            
            if( (i % 1000) == 0 ) { 
                System.out.print(".");
            }
        }
        System.out.println("");
        
        fin = System.nanoTime();
        System.out.println("Tiempo transcurrido (ns): " + (fin - inicio) );

        
        
        
        
        
    }
}
