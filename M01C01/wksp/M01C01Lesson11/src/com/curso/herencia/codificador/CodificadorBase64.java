package com.curso.herencia.codificador;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodificadorBase64 extends Codificador {
    public static final String VERSION = "v1.7";
    
    public static void info() {
        System.out.println("Clase CodificadorBase64 " + VERSION);
    } 

    @Override
    public String codificar(String msg)  {
        Base64.Encoder e = Base64.getEncoder();
        String res = null;
        try {
            res = e.encodeToString(msg.getBytes("UTF-8")); //UTF-8
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CodificadorBase64.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public String decodificar(String msg) {
        Base64.Decoder d = Base64.getDecoder();
        String res = new String(d.decode(msg));
        return res;
    }

}
