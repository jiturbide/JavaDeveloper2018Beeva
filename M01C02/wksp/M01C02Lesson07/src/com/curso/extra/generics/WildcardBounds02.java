package com.curso.extra.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JLIL
 */
public class WildcardBounds02 {


    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
        birds.add(new Sparrow()); // DOES NOT COMPILE
        birds.add(new Bird()); // DOES NOT COMPILE
    }
}

class Sparrow extends Bird { }

class Bird { }
