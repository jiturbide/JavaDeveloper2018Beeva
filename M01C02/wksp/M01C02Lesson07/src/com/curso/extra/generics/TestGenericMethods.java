package com.curso.extra.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JLIL
 */
public class TestGenericMethods {

    public static void main(String[] args) {
        queryOperations("Errors");

        TestGenericMethods.<String>queryOperations("Errors");
    }
    
    
    public static <T> List<T> queryOperations(T t) {
        System.out.println("Preparing " + t);
        List l = new ArrayList<T>();
        
        if(t.getClass() == String.class) {
            l.add("404");
        } else if(t.getClass() == Integer.class)  {
            l.add(404);
        }
        
        return l;
    }
}

