package com.curso;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilidadCarga {
    public static void main(String[] args) {
        try {        
            new UtilidadCarga().procesarArchivo();
        } catch (SystemException ex) {
            
        }
    }
    
    //public void procesarArchivo() throws FileNotFoundException, SQLException {
    public void procesarArchivo() throws SystemException {
        String linea = "";
        BufferedInputStream bis = null;

        try {
        bis = new BufferedInputStream(
                new FileInputStream("c:\\tmp\\archivo.txt")); 
            System.out.println("Leyendo archivo");
        
        if(bis != null) {
                try{
                 bis.close();
                } catch(IOException ioe) {
                    throw new SystemException("Panic!", ioe);
                }
            }    
        } catch(FileNotFoundException fe) {
            throw new SystemException("No hay archivo", fe); 
        }
    }
}

class AppException extends SystemException {
    public AppException() {super("Error!",null);}
}

class SystemException extends Exception {
    private final String msg;
    private final Throwable nestedEx;
    
    public SystemException(String msg) { this(msg, null); }

    public SystemException(String msg, Throwable nestedEx) {
        this.msg = msg;
        this.nestedEx = nestedEx;
    }
    public String getMsg() { return msg; }
    public Throwable getNestedEx() { return nestedEx; }    
}
