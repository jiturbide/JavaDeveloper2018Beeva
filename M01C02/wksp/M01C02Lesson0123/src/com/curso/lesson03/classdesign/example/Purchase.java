package com.curso.lesson03.classdesign.example;

import java.util.ArrayList;
import java.util.Collection;

public class Purchase {
    private Event event;
    Collection<Ticket> items = new ArrayList<>();

    public Purchase(Event e) {
        this.event = e;
    }

    public void addTicket(Ticket item) {
        //TODO El costo del boleto es: 
        // En caso de ser adulto importe completo, en caso de ser niño 50% del costo del evento
        
        this.items.add(item);
    }

    public void removeTicket(Ticket item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        // TODO Calcular el total
        return sum;
    }
}
