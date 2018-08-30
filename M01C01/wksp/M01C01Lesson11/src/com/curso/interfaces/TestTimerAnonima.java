package com.curso.interfaces;

/**
 * @author JLIL
 */
public class TestTimerAnonima {
    public static void main(String[] args) {
        System.out.println("Inicio del programa " + Thread.currentThread().getName());
        
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try { Thread.sleep(1000); 
                          System.out.println("C Anonima i=" + i);
                    } catch (InterruptedException ex) { }
                }
            }
        };
        
        Thread t = new Thread(r);  t.setName("BartThread");
        t.start();
        System.out.println("Fin del programa " + Thread.currentThread().getName());
    }
}

