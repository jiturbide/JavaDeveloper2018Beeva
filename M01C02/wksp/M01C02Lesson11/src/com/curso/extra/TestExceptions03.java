package com.curso.extra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * @author JLIL
 */
public class TestExceptions03 {

    public static void main(String[] args) {
        
        System.out.println("1. Intentando abrir archivo");
        //BufferedReader in = null;
        try (BufferedReader in
                = new BufferedReader(new FileReader("c:\\tmp\\missingfile.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("c:\\tmp\\missingfile_copy.txt"));
             //System.out.println("File open");   
                ) {
            System.out.println("2. Copiando archivo");
            String line = "";
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
                }
            System.out.println("3. Copia terminada");
        } catch (FileNotFoundException | NullPointerException e) {
            //e effective final
            //e = null;
            System.out.println(e.getMessage());
        } catch(IOException e) {
            //e = null;
            e.printStackTrace();
        }
        
        //try{}finally{}
    }
}
