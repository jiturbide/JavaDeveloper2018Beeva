package com.curso.nested;

import java.io.Serializable;

public class TopLevel {
    protected String nombre;
    {
        int ii = 10;
    }
    //Clase miembro anidada
    protected abstract class IP extends Base implements Serializable{
        //protected String nombre;
    }  //private, protected, default, public
    public class IPv6 extends IP{
        public int ii = 10;
        
        public void baz() {
            System.out.println("salida:" + nombre);
        }
    }
    
    public void foo() {
        //var local
        int iiiii = 7;
        
        //clase local
        class Bar extends Base implements Serializable{
            public void algo() {
                System.out.println("i: " + iiiii + " nombre: "  + nombre);
            }
        }
        class Bar2 extends Base implements Serializable{
            public void algo() {
                System.out.println("i: " + iiiii + " nombre: "  + nombre);
            }
        }
        
        Bar b = new Bar();
        b.toString();
        
        //return b;
    }
    
    //Anidad estatica
    public static class MyStatic extends Base implements Serializable{} //private, protected, default, public
    
    public static void main(String[] args) {
        int par = 2;
        
        TopLevel r = new TopLevel() {
            public void run(){
                //par = 4;
                System.out.println("dato:" + this.nombre + " par: " + par);
            }
        };
        
        TopLevel r2 = new TopLevel() {
            public void run(){
                //par = 4;
                System.out.println("dato:" + this.nombre + " par: " + par);
            }
        };
        
        //Top Level
        TopLevel tl = new TopLevel();
        
        //Crear clase anidada miembro (de instancia)
        //IP ip = tl.new IP();
        //IP ip2 = new TopLevel().new IP();
        
        //Crear clase estatica 
        MyStatic my = new MyStatic();
        
        
    }
    
}

class Base{}

