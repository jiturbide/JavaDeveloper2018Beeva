package com.curso.herencia;

/**
 * @author JLIL
 */
public class MailService extends Service {
    @Override
    public MailMessage getMessage() {
        return new GmailMailMessage();
    }
    
    @Override
    void destroy(){}
    
    //@Override
    private void reset(){}
}
