package com.curso;

public class TestOperadores {
    public static void main(String[] args) {
        
        int i = 127;
        byte b = 127;
        System.out.println(" i == b " + (i==b) );
        
        Integer ii = 127; //autoboxing:  ii = new Integer(127);
        Integer ii2 = new Integer(127);
        Byte bb = 127; 
        
        //Esto no se puede porque estamos comparanto referencias 
        // a tipos diferentes
        //System.out.println(" ii == bb " + (ii==bb) ); 
        System.out.println(" ii == ii2 " + (ii==ii2) );
        
        //Factura f;
        //Ticket t;
        
        //t == f;
        
        i = i + ii.shortValue(); //unboxing
        i = i + ii; //autounboxing
        
        String p = "Homero Simpson";
        String pp = new String("Homero Simpson");
        String n = null;
        
        System.out.println("p==pp " + (p==pp));
        
        /* * /
        if(n.equals(p)) {
            System.out.println("Iguales");
        }
        /* */
        
        if("Homero Simpson".equals(n)) {
            System.out.println("Iguales");
        }

        if(n != null & evaluar(n==p) ) {
            System.out.println("Verdadero");
        } else {
            System.out.println("No es verdadera la condicion");
        }
        
        //Operador ternario   ? :
        
        String eval = (n==p) ? ((4<6) ? "Iguales y 4<5" : "iguales 4>5")
                : "Diferentes".toLowerCase(); 
  
        
        eval = (n==p) ? (eval = (4<6) ? "Iguales y 4<5" : "iguales 4>5")
                : "Diferentes".toLowerCase(); 
                
        if(n == (eval="")) {
            
        }
        //"hola";
        if(p==n) ; System.out.println("verdadero");
        
        
        
        
        
        
    }
    
    public static boolean evaluar(boolean b){
        System.out.println("b es: " + b);
        return !b;
    }
    
    
    
    
}
