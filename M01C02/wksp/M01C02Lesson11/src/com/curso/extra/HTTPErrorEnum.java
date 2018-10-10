package com.curso.extra;

public enum HTTPErrorEnum {
    HTTP404(404, "Not Found"), HTTP500(500, "Internal Server Error"), HTTP200(200, "Success");
    private int code;
    private String description;

    private HTTPErrorEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    } 
}