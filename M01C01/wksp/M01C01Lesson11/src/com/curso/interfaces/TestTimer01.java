package com.curso.interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author JLIL
 */
public class TestTimer01 {
    public static void main(String[] args) {
        System.out.println("Inicio del programa " + Thread.currentThread().getName());
        Runnable r = new MiTimer();
        Thread t = new Thread(r);  t.setName("HomeroThread");
        t.start();
        System.out.println("Fin del programa " + Thread.currentThread().getName());
    }
}

class MiTimer implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try { Thread.sleep(1000); 
                  System.out.println(Thread.currentThread().getName() +  " i=" + i);
            } catch (InterruptedException ex) { }
        }
    }
}