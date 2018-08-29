package com.curso.herencia.soluciones;

/**
 * @author JLIL
 */
public class TestCodificador {
    public static void main(String[] args) {
        Codificador c = new CodificadorBase64();
        MessageService ms = new MessageService(c);

        String original = "Hola Mundo";
        ms.sendMessage(original);
        
        Codificador.info();
        CodificadorBase64.info();
        c.info();
        ((CodificadorBase64) c).info();
    }
    
}
