package com.curso.cargas.model;

import com.curso.cargas.model.ItemCarga;

//Esta clase si tiene acceso a la clase ItemCarga porque esta en el mismo paquete
public class TetsItemCarga {
    public static void main(String[] args) {
        ItemCarga i = new ItemCarga();
        i.setStatus(100);
        
        System.out.println("i: " + i);
        
        
    }
}
