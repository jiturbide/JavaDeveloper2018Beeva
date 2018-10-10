package com.curso.extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author JLIL
 */
public class TestExceptions02 {

    public static void main(String[] args) {
        System.out.println("Intentando abrir archivo");
        try (InputStream in
                = new FileInputStream("c:\\tmp\\missingfile2.txt")) {
            System.out.println("File open");
            int data = in.read();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
