package com.curso.interfaces;

/**
 * @author JLIL
 */
@FunctionalInterface
public interface IService {
    public static final String VERSION = "v1.0.0";
    default public void info() {
        System.out.println("ISErvice " + VERSION);
    }
    void init(String tipo);
    //void execute();
}
