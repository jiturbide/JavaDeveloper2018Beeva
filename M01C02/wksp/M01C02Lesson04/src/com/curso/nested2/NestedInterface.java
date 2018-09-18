package com.curso.nested2;

/**
 * @author JLIL
 */
public class NestedInterface {

    static interface Mammal {
    }

    static class Furry implements Mammal {
    }

    static class Chipmunk extends Furry {
    }

    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        Mammal m = c;
        Furry f = c;
        int result = 0;
        if (c instanceof Mammal) {
            result += 1;
            System.out.println("c instanceof Mammal");
        }
        if (c instanceof Furry) {
            result += 2;
            System.out.println("c instanceof Furry");
        }
        if (c instanceof Chipmunk) {
            result += 4;
            System.out.println("c instanceof Chipmunk");
        }
        if (null instanceof Chipmunk) {
            result += 8;
            System.out.println("null instanceof Chipmunk");
        }
        System.out.println(result);
    }
}
