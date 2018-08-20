package com.curso.model;

public enum CodigoErrorEnum {
    NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "ISError"),
    SUCCESS(200);
    
    private int codigo;
    private String msg;
    
    CodigoErrorEnum(int codigo, String msg) { 
        this.codigo = codigo;
        this.msg = msg;
    }
    
    CodigoErrorEnum(int codigo) { 
        this.codigo = codigo;
        this.msg = "NOT DEFINED";
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMsg() {
        return msg;
    }
    
    
    
}
