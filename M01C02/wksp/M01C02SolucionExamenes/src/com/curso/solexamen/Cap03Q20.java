package com.curso.solexamen;

import java.util.HashMap;
import java.util.Map;

public class Cap03Q20 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.contains("123"));        
    }
}
