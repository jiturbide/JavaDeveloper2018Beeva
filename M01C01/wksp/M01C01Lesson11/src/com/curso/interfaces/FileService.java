package com.curso.interfaces;

/**
 * @author JLIL
 */
public class FileService implements IService{

    @Override
    public void init(String tipo) {
        System.out.println("Inicializando servicio " + tipo);
    }
    
}
