package com.curso.solexamen;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Cap03Q24 {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        
        //s.forEach(s -> { System.out.println(s); });

        //Consumer<String> c = (String s) -> { System.out.println(s); };

        Consumer <String> c02 = new Consumer() {
            public void accept(Object ss) {
                String s = "";
                System.out.println(s);
            }
        };
    }
}
