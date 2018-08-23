package com.curso.ejemplos.solucionmock01;

import java.util.ArrayList;

/*
Question 5
What will the following code print when compiled and run?
 */
public class Q05TestClass {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("111");
        al.add("222");
        System.out.println(al.get(al.size()));
    }
}
