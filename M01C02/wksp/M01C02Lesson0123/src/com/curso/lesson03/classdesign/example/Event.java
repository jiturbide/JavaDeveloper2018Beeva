package com.curso.lesson03.classdesign.example;

import java.time.LocalDateTime;

/**
 * @author JLIL
 */
public class Event {
    private String nameEvent;
    private LocalDateTime date;

    //TODO 01 Generar un metodo Factory que genere un Evento default "El Cascanueces" $100
    
    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
