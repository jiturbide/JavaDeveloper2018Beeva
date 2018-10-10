package com.curso.extra.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

/**
 * @author JLIL
 */
public class TestMapOperations {
    public static void main(String[] args) {
        //Map <String, String>config = new HashMap<>();
        Map <String, String>config = new TreeMap<>();
        //hashCode no se llama
        
        config.put("server.web.ip", "192.168.1.1");
        config.put("server.web.port", "80");
        config.put("server.bd.ip", "192.168.2.2");
        config.put("server.bd.port", "1521");
        config.put("server.web.ip", "172.1.1.200");
        config.putIfAbsent("server.web.port", "443");
        config.put("server.bd.Port", "80");
        
        
        
        /* */
        config.put("server.ws.port", null);
        config.put("server.ws.ip", null);
        //config.put(null, "0.0.0.0");
        /* */
        System.out.println(config);
        
        System.out.println(config.containsKey("server.web.ip"));
        System.out.println(config.containsValue(null));
    
        //Merge
        /* * /
        BiFunction <String, String, String> regla = (x,newval) -> x.equals("80") ? newval : x;
        
        System.out.println("cambio?: " + config.merge("server.web.port", "8080", regla));
        System.out.println("cambio?: " + config.merge("server.bd.Port", "2230", regla));
        System.out.println("cambio?: " + config.merge("server.bd.port", "1111", regla));
        /* */
        config.forEach((k,v) -> System.out.println(k + ":" + v));
        
        //Ciclo para sustituir valores null por "NOT-SET"
        //Si el Valor es null la regla simplemente deja el nuevo vaor que se pasa desde merge
        System.out.println("============================");
        
        BiFunction<String, String, String> regla2 = (x, newval) -> x == null ? newval : x;
        
        config.forEach((k,v) -> config.merge(k, "NOT-SET", regla2));
        config.forEach((k,v) -> System.out.println(k + ":" + v) );

        //config.forEach((k,v) -> config.merge(k, "NOT-SET", regla2));

        
    }
}
