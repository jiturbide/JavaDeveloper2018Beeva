package com.curso.herencia.soluciones;

import java.util.Base64;

/**
 * @author JLIL
 */
public class CodificadorBase64 extends Codificador {
    //public static final String VERSION = "v1.1";
    
    public static void info() {
        System.out.println("Codificacion en Base64 " + VERSION);
    }
    
    @Override
    public String codificar(String msg) {
        Base64.Encoder e = Base64.getEncoder();
        return (e.encodeToString(msg.getBytes()));
    }

    @Override
    public String decodificar(String msg) {
        Base64.Decoder d = Base64.getDecoder();
        return new String(d.decode(msg));
    }

}
