package com.curso.util;

import java.util.HashMap;
import java.util.Map;

public class ParametrosComp{
    private Map params = new HashMap();

    public void addParam(String param, String value) {
        this.params.put(param, value);
    }
    
    public String getValue(String param) {
        return (String) params.get(param);
    }
}
