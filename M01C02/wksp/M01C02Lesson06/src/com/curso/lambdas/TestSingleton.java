package com.curso.lambdas;

import java.util.Random;

/**
 * @author JLIL
 */
public class TestSingleton {
    public static void main(String[] args) {
        
    }
}

// Lazy instantiation
class FolioGeneratorLazy {
    private static FolioGeneratorLazy instance;
    private static int contador = 1;
    
    private FolioGeneratorLazy() { }

    public static FolioGeneratorLazy getInstance() {
        synchronized(FolioGeneratorLazy.class) {
            if (instance == null) {
                instance = new FolioGeneratorLazy(); // NOT THREAD-SAFE!
            }
        }
        return instance;
    }
    public String getFolio(){ return String.valueOf(contador++);}
}

class FolioGeneratorEager {
    private static FolioGeneratorEager instance = new FolioGeneratorEager();
    private static int contador = 1;
    
    private FolioGeneratorEager() { }

    public static FolioGeneratorEager getInstance() {
        return instance;
    }
    public String getFolio(){ return String.valueOf(contador++);}
}
