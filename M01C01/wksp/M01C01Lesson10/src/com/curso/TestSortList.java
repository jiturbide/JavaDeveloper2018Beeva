package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSortList {
    public static void main(String[] args) {
        List <String>notUsedKeywords = new ArrayList<String>(); //Java 5.0
        List <String>notUsedKeywords2 = new ArrayList<>(); //Java 7
        List <String>notUsedKeywords3 = new ArrayList(); //Java 5.0
        List notUsedKeywords4 = new ArrayList();  //Tipica <= 1.4
        
        List notSafe = new ArrayList<Integer>();
        
        List <Integer> ii = notSafe;
        
        //List <Integer> iii = notUsedKeywords;
        
        
        //String x =  new Integer(3);
        
        /*  * /
        List <String>array0 = new ArrayList<String>();
        List notSafe2 = array0;
        List <Integer> enteros = notSafe2;
        enteros.add(new Integer(2));
        
        System.out.println("Tipo: " + enteros.get(0).getClass());
        /*  */
        
        List <Integer> numeros = new ArrayList<>(); //LinkedList 
        numeros.add(new Integer(7)); 
        numeros.add(3);
        numeros.add(5);
        numeros.add(0);
        
        Collections.sort(numeros);  //sorted != ordered
        
        for(Integer i : numeros) {
            System.out.println("num: " + i);
        }
        
        notUsedKeywords.add("goto");
        notUsedKeywords.add("const");
        
        Collections.sort(notUsedKeywords);
        
        System.out.println("keywords: " +notUsedKeywords);
        
        String nuk[] = {"10", "90", "1"};
        System.out.println("nuk: " + Arrays.toString(nuk));
        
        List <String> listaNumeros = Arrays.asList("100", "90", "1", "-3");
        Collections.sort(listaNumeros);
        System.out.println("lista numeros: " + listaNumeros);
        
        //Operaciones
        
        //listaNumeros.
        
        
                
                
    }
    
    public void procesar(List a) {}
    
}
