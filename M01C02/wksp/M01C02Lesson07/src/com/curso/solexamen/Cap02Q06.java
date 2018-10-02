package com.curso.solexamen;

import java.util.function.Predicate;

/**
 * @author JLIL
 */
public class Cap02Q06 {
    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        
        Predicate r01 = new MiPrueba();
        Panda.check(p1, r01); // h1
        Panda.check(p1, p -> p.age < 5); // h1
                
    }
}

class Panda {
    int age;

    public static void check(Panda panda, Predicate<Panda> pred) { // h2
        String result = pred.test(panda) ? "match" : "not match"; // h3
        System.out.print(result);
    }
}

class MiPrueba implements Predicate<Panda> {
    public boolean test(Panda p) {
        return p.age > 5;
    }    
}

/*
interface MyPredicate <T>{
    boolean test(T tipo);
}
*/
