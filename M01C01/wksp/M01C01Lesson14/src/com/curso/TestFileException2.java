package com.curso;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileException2 {
    public static void main(String[] args) {
        try {        
            new TestFileException2().procesarArchivo();
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


