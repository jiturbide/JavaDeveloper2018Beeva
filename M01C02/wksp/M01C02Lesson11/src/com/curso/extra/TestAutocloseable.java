package com.curso.extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author JLIL
 */
public class TestAutocloseable {

    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        try (InputStream in
                = new FileInputStream("c:\\tmp\\missingfile.txt");
                MyConnection cnx = new MyConnection("192.168.1.1", 8080);) {
            //Logica
            //cnx = null;
            //System.out.println("Cierre explicito");
            //cnx.close();
            //System.out.println("Cierre exitoso");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin del programa");

        //try(MyConnection cnx = new MyConnection("192.168.1.1", 8080);  ){};
        // s tiene ambito limitado        
        /*  * /
        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
        } catch (Exception e) {
            s.nextInt(); // DOES NOT COMPILE
        } finally {
            s.nextInt(); // DOES NOT COMPILE
        }
        /**/
    }
}
