package com.curso.herencia.codificador;


/**
 * @author JLIL
 */
public class TestCodificador {
    public static void main(String[] args) {
        //Codificador c = new CodificadorBase64();
        Codificador c = Codificador.getInstance();
        MessageService ms = new MessageService(c);

        String original = "Hola Mundo !!!";
        ms.sendMessage(original);
        
        Codificador.info();
        CodificadorBase64.info();        
        
        c.info();
        ((CodificadorBase64) c).info();
        
        System.out.println("Version: " + c.VERSION);
        System.out.println("Version: " + ((CodificadorBase64) c).VERSION);
        
    }
    
}
