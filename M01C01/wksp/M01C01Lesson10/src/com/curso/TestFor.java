package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestFor {
    public static void main(String[] args) {
        String arr [] = {"enum", "assert", "throws", null};
        List <String> notUsedKeywords = Arrays.asList("goto", "const");
        List <String> weirdKeywords = Arrays.asList("native", "strictfp");
        
        for (int i = 0; i < arr.length; i++) {
            String tmp = arr[i];
        }
        
        for (String tmp : arr) { //enhanced for
            if(tmp != null) {}
        }
        //System.out.println("" + tmp);
        
        Iterator <String>it = notUsedKeywords.iterator();
        while(it.hasNext()) {
            String item = it.next();
            System.out.println("item: " + item);
        }
        List lista = new ArrayList();
        lista.add("hola");
                
        for(Object tmp : lista) {
            System.out.println("item: " + ((String)tmp).toUpperCase());
            //lista.remove(tmp);
        }
        
        for(String tmp : notUsedKeywords) {
            System.out.println("item: " + tmp);
        }
        
        //weirdKeywords.remove(0);
        List trampa = weirdKeywords;
        trampa.remove(0);
    }
}
