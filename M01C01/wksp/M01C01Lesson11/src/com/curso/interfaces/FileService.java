package com.curso.interfaces;

/**
 * @author JLIL
 */
public class FileService implements IServiceOld{
    public static final String VERSION = "v2.0.0";
    public void info() {
        System.out.println("Fileservice " + VERSION);
    }

    @Override
    public void init(String tipo) {
        System.out.println("Inicializando servicio " + tipo);
    }
    
}
