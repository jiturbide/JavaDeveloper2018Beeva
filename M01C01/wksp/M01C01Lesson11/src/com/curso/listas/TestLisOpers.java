package com.curso.listas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JLIL
 */
public class TestLisOpers {
    public static void main(String[] args) {
        List <String> list = new ArrayList();
        list.add("Hola");
        list.add("Hola");
        list.add(new String("Hola"));
        list.add(new StringBuffer().insert(0, "Hola").toString());
        
        String s0 = "";
        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = "Ho" + "la" + s0;
        
        System.out.println("[0]: " + (list.get(0)=="Hola"));
        System.out.println("[1]: " + (list.get(1)=="Hola"));
        System.out.println("[2]: " + (list.get(2)=="Hola"));
        System.out.println("[3]: " + (list.get(3)=="Hola"));
        System.out.println("s1==s2: " + (s1==s2));
        System.out.println("s2==s3: " + (s2==s3));
        
    }
}
