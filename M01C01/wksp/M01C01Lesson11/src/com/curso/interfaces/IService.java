package com.curso.interfaces;

/**
 *
 * @author JLIL
 */
public interface IService {
    int VERSION = 2;  //public static final
    //int MAX_VALUE; //Esto no se puede
    
    void init();  //public abstract
    public abstract void destroy(); 
    public void doService();  //abstract
}

interface IMailService extends IService{
    void sendMail();
}

class ApacheMailService implements IMailService {
    int VERSION;
    
    //void sendMail() {} //Cuidado!!
    public void sendMail() {} //Cuidado!!

    public void init() {}

    public void destroy() {}

    public void doService() {}
    
}

