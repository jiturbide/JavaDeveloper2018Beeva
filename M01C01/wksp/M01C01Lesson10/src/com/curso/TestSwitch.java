package com.curso;

public class TestSwitch {
    enum SINO {SI, NO};
    public static void main(String[] args) {
        //switch acepta literales integrales  <= 1.4
        //soporta valores enumerados >= 5.0
        //soporta cadenas >= 7.0
        
        int i= 0;
        float f = 10.0F;
        /** /
        switch(i) {
            default: 
                break;
            case 1:
               break;
            //case 2, 3, 4, 5: break; 
            //case i:
               break; 
            case 4.0:
                break;
        }
        /**/
        SINO decision = SINO.SI;
        
        switch(decision){
            case SI:
                break;
            default :
                throw new IllegalStateException("Algo malo paso");
                //break;
        }
        
        String saludo = "Hola Mundo";
        final String mensaje = "Hola Mundo";
        
        switch(saludo) {
            case "Hello": 
                
                break;
            case mensaje:    
                break;
        }
        
        boolean b=false;
        int j = 9, x = 10;
        if( b = (j < x) ) {}
        
        final Byte bb = 127;
        final Long ll = 127L;
        
        switch(ll.intValue()) {
        //switch(ll) {
            case 127: 
                break;                
            case 128:
                break;                
            default:
                break;
        }
        
    }
}
