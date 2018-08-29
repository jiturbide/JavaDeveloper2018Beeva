package com.curso.herencia.codificador;

/**
 * @author JLIL
 */
public class MessageService {
    private Codificador codificador = null;
    public MessageService(Codificador codificador) {
        this.codificador = codificador;
        //c.info();
    }
    
    public void sendMessage(String msg) {
        String codificado = this.codificador.codificar(msg);
        String decodificado = this.codificador.decodificar(codificado);
        
        System.out.println("Original: " + msg);
        System.out.println("Codificando: " + codificado);
        System.out.println("Enviando mensaje ...");
        System.out.println("Decodificando: " + decodificado);
    }
}
