package com.curso.extra;

public class MyConnection implements AutoCloseable{
    private String server;
    private int port;
    
    @Override
    public void close() /**/ throws Exception /**/{
        System.out.println("Cerrando conexion a ..." + this);
        server = null;
    }   

    public MyConnection(String server, int port) {
        this.server = server;
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "MyConnection{" + "server=" + server.toLowerCase() + ", port=" + port + '}';
    }
    
    
}
