package com.curso.herencia;

/**
 * @author JLIL
 */
public abstract class Service {
    public void init(){};
    public abstract Message getMessage();
    void destroy() {}
    
    private void reset(){}
}

class Message {}

class MailMessage extends Message{}

class GmailMailMessage extends MailMessage{}