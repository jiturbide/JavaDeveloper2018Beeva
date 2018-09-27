package com.curso.lesson03;

import java.util.HashMap;
import java.util.Map;

public class TestComposition {
    {
        new MyConfig();
        //new MyConfigD();
        MyConfigD.getInstance().addProperty("ip", "192.168.1.1");
    }
}

//Herencia
class MyConfig extends HashMap<String, String>{
    void addProperty(String k, String v) {}
}

//Delegacion, Composition over Inheritance 
//Poo: Encapsulacion
//DP Creational: Factory Method
final class MyConfigD {
    private static final MyConfigD instance = new MyConfigD();
    private Map<String, String> values = new HashMap<>();

    private MyConfigD(){}
    
    public static MyConfigD getInstance() {
        return instance;
    }
    
    void addProperty(String k, String v) {}
}
