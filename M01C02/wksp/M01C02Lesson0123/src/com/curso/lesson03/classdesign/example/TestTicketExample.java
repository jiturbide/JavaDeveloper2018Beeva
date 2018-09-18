package com.curso.lesson03.classdesign.example;

import com.curso.lesson03.clapatternsentmodule.PaymentStrategy;


public class TestTicketExample {
    public static void main(String[] args) {
        System.out.println("Inicio .............................");

        //TODO Elegir evento
        Event e = null;
        
        //TODO Elegir forma de pago
        PaymentStrategy ps = null;
        
        //TODO Comprar boletos
        IPointOfSaleService pos = new PointOfSaleService();
        
        //TODO Imprimir boletos
        //Con numero de ticket
        //Por clasificacion, primero por Promo, Entrada, Voucher si aplica
        
        //Imprimir usando lambda
        
        System.out.println("Fin .............................");
    }
}
