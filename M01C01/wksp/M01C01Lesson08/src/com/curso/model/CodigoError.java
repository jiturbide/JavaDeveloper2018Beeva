package com.curso.model;

public class CodigoError {
    public static final CodigoError NOT_FOUND = new CodigoError(404, "NotFound");
    public static final CodigoError INTERNAL_SERVER_ERROR = new CodigoError(500, "ISE");
    private int codigo;
    private String msg;
    
    private CodigoError(int codigo, String msg) { 
        this.codigo = codigo;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CodigoError{" + "codigo=" + codigo + ", msg=" + msg + '}';
    }

    
    
}
