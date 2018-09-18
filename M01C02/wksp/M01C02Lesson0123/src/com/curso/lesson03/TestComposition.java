package com.curso.lesson03;

import java.util.HashMap;


public class TestComposition {
    {
        new MyConfig();
        
        new MyConfigD();
    }
}

//Herencia
class MyConfig extends HashMap<String, String>{
    void addProperty(String k, String v) {}
}

//Delegacion, Composicion
class MyConfigD {
    private HashMap<String, String> values;
    
    void addProperty(String k, String v) {}
}