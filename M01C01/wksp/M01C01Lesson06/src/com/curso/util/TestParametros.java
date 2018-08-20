package com.curso.util;

public class TestParametros {
    public static void main(String[] args) {
        Parametros p = new Parametros();
        
        p.put("host.ip", "192.168.1.10");
        
        ParametrosComp pc = new ParametrosComp();
        pc.addParam("host.ip", "192.168.1.10");
    }
}
