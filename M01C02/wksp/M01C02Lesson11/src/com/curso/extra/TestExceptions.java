package com.curso.extra;

import java.io.Serializable;
import java.util.stream.Stream;

public class TestExceptions {
    public static void main(String[] args) {
        class MyException extends Exception implements Serializable{};
        Throwable t = new MyException();
        
        System.out.println("t instanceof Error: " + (t instanceof Error));
        System.out.println("t instanceof Throwable: " + (t instanceof Throwable));
        System.out.println("t instanceof RuntimeException: " + (t instanceof RuntimeException));
        System.out.println("t instanceof Exception: " + (t instanceof Exception));
        System.out.println("t instanceof Object: " + (t instanceof Object));
        System.out.println("t instanceof Serializable: " + (t instanceof Serializable));
        //System.out.println("t instanceof String: " + (t instanceof Boolean));

        class MyError extends Error implements Serializable{};
        Throwable e = new MyError();
        
        Stream.generate(() -> "-").limit(20).forEach(System.out::print);
        
        System.out.println("e instanceof Error: " + (e instanceof Error));
        System.out.println("e instanceof Throwable: " + (e instanceof Throwable));
        System.out.println("e instanceof RuntimeException: " + (e instanceof RuntimeException));
        System.out.println("e instanceof Exception: " + (e instanceof Exception));
        System.out.println("e instanceof Object: " + (e instanceof Object));
        System.out.println("e instanceof Serializable: " + (e instanceof Serializable));
        
    }
}
