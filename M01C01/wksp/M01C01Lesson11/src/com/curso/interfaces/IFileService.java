package com.curso.interfaces;

/**
 * Interface funcional: Solo tiene 1 metodo pendiente de implementacion
 * @author JLIL
 */
@FunctionalInterface
public interface IFileService {
    void init();
    //void stop();
    default void printInfo() {
        System.out.println("Estoy en IFileService ");
    }
}

class ConnectDirect implements IFileService {
    public void init() {
        System.out.println("Init en Connect Direct");
    }    
    public void printInfo() {
        System.out.println("Estoy en Connect Direct");
    }
}