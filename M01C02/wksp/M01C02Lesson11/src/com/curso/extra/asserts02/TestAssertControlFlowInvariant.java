package com.curso.extra.asserts02;

//Control flow invariants son controles para probar que ciertos caminos nunca se van a alcanzar

import com.curso.extra.HTTPErrorEnum;

public class TestAssertControlFlowInvariant {
    public static void main(String[] args) {
        
    }
    //xxx -> 
    public String errorType(HTTPErrorEnum hee) {
        switch(hee) {
            /* */
            default:
                //throw new AssertionError("Codigo HTTP Erroneo");
                //assert false: "Codigo HTTP Erroneo";
                //break;
                return "Codigo HTTP Erroneo";
            /* */    
            case HTTP404:
                return hee.getDescription();
            case HTTP500:
                return hee.getDescription();
            case HTTP200:
                return hee.getDescription();
        }
    }
}

