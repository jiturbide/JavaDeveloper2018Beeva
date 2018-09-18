package com.curso.nested2;

//import com.curso.nested2.TopLevel2.Clonable;
//import com.curso.nested2.TopLevel2.Parametrizable;

public class TestNestedInterface {
    public static void main(String[] args) {
        class Clon implements TopLevel2.Clonable{
            
        }
        
        class Parametro implements TopLevel2.Parametrizable{
            public void parametrizar() {
            }
        }
        
    }
}
