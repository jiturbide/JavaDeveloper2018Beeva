package com.curso.herencia;

/**
 * @author JLIL
 */
public class ServicioHTTP {
    public final static String VERSION = "HTTP Apache Server 2.0";
    
    public static class Logger {
        public static void debug(String msg) {
            System.out.println("msg: " + msg);
        }
        public void fatal(String msg) {
            System.out.println("msg fatal: " + msg);
        }
    }
    
    public class TipoError{
        public final static int NUM_MAX = 10;
        protected String tipo = "NO-DEFINIDO";

        public String getTipo() { return tipo; }

        public void setTipo(String tipo) { this.tipo = tipo; }
    }
    
    public void init() {
        System.out.println("init()");
    }
    
    public static void main(String[] args) {
        ServicioHTTP.TipoError te = new ServicioHTTP().new TipoError();
    }
}
