package com.curso.interfaces;

public class TestTimer {
    public static void main(String[] args) {
        System.out.println("Inicio del programa " + Thread.currentThread().getName());
        //  () -> ;        
        Runnable r = () -> {
                for (int i = 0; i < 10; i++) {
                    try { Thread.sleep(1000); 
                          System.out.println("C Anonima i=" + i);
                    } catch (InterruptedException ex) { }
                }
            };
        
        Thread t = new Thread(r);  t.setName("BartThread");
        t.start();
        System.out.println("Fin del programa " + Thread.currentThread().getName());
    }
}

