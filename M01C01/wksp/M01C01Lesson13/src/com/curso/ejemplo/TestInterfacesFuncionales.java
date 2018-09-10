package com.curso.ejemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
        
public class TestInterfacesFuncionales {
    public static void main(String[] args) {
        List <String>lista = Arrays.asList("Enero", "Febrero", "Marzo");
        recorrer(lista);
        modificar(lista);
        recorrer(lista);

        Consumer mc = new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        };
        
        String ss = "Hola ";
        
        recorrer(mc, lista);
        recorrer( (s) -> {System.out.println(s);}, lista);
        recorrer( s -> System.out.println(s), lista);
        
        lista.forEach(s -> System.out.println(s+ ss) );
        
//        lista.stream().forEach(mc);
//        lista.stream().peek(mc);
//        lista.stream().filter(lista);
    }
    public static void recorrer(List <String>lista) {
        for(String s : lista) {
            System.out.println(s);
        }
    }
    public static void modificar(List <String>lista) {
        for (int i=0; i < lista.size() ; i++) {
            lista.set(i, lista.get(i).toUpperCase());
        }
    }
    public static void recorrer(Consumer mc, List <String>lista) {
        for(String s: lista) {
            mc.accept(s);
        }
    }
}


//interface MyPredicate<T> { //extends Predicate{
//    boolean test(T toTest);
//}
//interface MyUnaryOperator<T>{
//    T apply(T input);
//}
//interface MyFunction<T,R> {
//    R apply(T input);
//}
//interface MyConsumer<T> {
//    void accept(T input);
//    default void init(){};
//}
//interface MySupplier<T> {
//    T get(T input);
//}