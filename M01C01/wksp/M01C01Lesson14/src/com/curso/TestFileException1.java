package com.curso;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileException1 {
    public static void main(String[] args) {
        
        String linea = "";
        BufferedInputStream bis = null;
        try {
           bis = new BufferedInputStream(
                new FileInputStream("c:\\tmp\\archivo.txt")); 
            System.out.println("Leyendo archivo");
           //bis.close();
        } catch(FileNotFoundException fnfe) {
            //Bloque para manejar la Excepcion
            fnfe.printStackTrace();
        } 
//        catch(IOException ioe) {
//            System.out.println("IOException ioe");
//            ioe.printStackTrace();
//        } 
        catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(bis != null) {
                try{
                 bis.close();
                } catch(IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            System.out.println("finally");
        }
        
        
        
        System.out.println(linea);
    }
}
