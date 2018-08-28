package com.curso;

public class PetStore {
    public static void main(String[] args) {
        Animal <Raton, ? extends Residuo>g = new Gato(); //Parametrizacion
        
        g.comer(new Raton());
    }
}

class Animal <T, R extends Residuo> { //Generics
    public void saludar(){System.out.println("Hola!"); }
    public R comer(T o) { 
        System.out.println("Comiendo " + o);
        return null; }
}

class Felino <T> extends Animal  {
}  //Generics

class Gato extends Felino {}

class Raton extends Animal{}

class Residuo{}
class Pii extends Residuo{}
class Poo extends Residuo{}



