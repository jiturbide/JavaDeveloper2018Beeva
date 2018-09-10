package com.curso.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;
import java.util.function.Function;
*/

public class TestOperacionesConLamdas05 {
    public static void main(String[] args) {
        List <String>meses = new ArrayList(
                Arrays.asList("enero", "abril", "mayo", "febrero", "marzo"));

        meses.forEach(  (x) -> { System.out.println(x.toUpperCase()); }  );
        
        meses.removeIf((x) -> { return x.equals("mayo"); } );
        meses.removeIf((x) -> x.equals("mayo") );
        
        meses.forEach(  x -> System.out.println("nuevo item:" + x)  );
        
        System.out.println("----------------------------------");
        meses.stream().forEach(x -> System.out.println(x));
        
        meses.stream().map( (x) -> x.toUpperCase())
                      .forEach(x -> System.out.println(x));
        
        meses.stream().filter((x) -> x.contains("a") || x.contains("A"))
                .map( (x) -> x.toUpperCase())
                .forEach(x -> System.out.println("Filtado:" + x));
    }    
}

/*
public interface Predicate<T>{
    boolean test(T aProbar);
}
public interface Function<T,R>{
    R apply(T item);
}
public interface Consumer<T>{
    void accept(T item);
*/
