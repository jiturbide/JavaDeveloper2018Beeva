package com.curso.model;

public class TestCodigoError {
    public static void main(String[] args) {
        // 404, 500, 302, 200
        manejaError(CodigoError.NOT_FOUND);
        
        CodigoErrorEnum exito = null;
        
        CodigoErrorEnum fallo = CodigoErrorEnum.INTERNAL_SERVER_ERROR;
        
        System.out.println("Fallo: " + fallo + ", " + fallo.getCodigo());

        System.out.println("Otros valores: " + fallo.INTERNAL_SERVER_ERROR.NOT_FOUND);
        
        System.out.println("?: " + exito);
        System.out.println("?: " + exito.NOT_FOUND);
        
        switch(fallo) {
            default:
                System.out.println(""); 
            case NOT_FOUND: 
                System.out.println(""); break;
            case INTERNAL_SERVER_ERROR:
                System.out.println(""); break;
            case SUCCESS: 
                System.out.println(""); break;
        }
        
        
        
        
    }
    
    public static void manejaError(CodigoError codigo) {
        
    }
}
