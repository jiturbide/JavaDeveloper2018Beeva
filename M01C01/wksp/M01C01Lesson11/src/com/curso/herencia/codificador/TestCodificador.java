package com.curso.herencia.codificador;


/**
 * @author JLIL
 */
public class TestCodificador {
    public static void main(String[] args) {
        Codificador c = null;
        MessageService ms = new MessageService(c);

        String original = "Hola Mundo";
        ms.sendMessage(original);
        
    }
    
}
