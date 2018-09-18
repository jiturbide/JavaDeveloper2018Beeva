package com.curso.lesson03.classdesign.example;

/**
 * @author JLIL
 */
public class Ticket {
    private int number;
    private TicketType type;
    private double fee;
}

enum TicketType{ PROMO, KID_ACCESS, ADULT_ACCESS, VOUCHER}

class PromoTicket { //TODO 02 Completar clase para tener Mensaje publicitario
    
}

class AccessTicket { //TODO 02 Completar clase para tener Numero de asiento, costo
    
}

class VoucherTicket { // @TODO 02 Completar clase para tener Numero autorizacion
    
}