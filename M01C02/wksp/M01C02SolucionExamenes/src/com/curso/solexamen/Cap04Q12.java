package com.curso.solexamen;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Cap04Q12 {
    public static void main(String[] args) {
        
         Supplier<String> x = String::new;   //F ó G cumplen
         BiConsumer<String, String> y = (a, b) -> System.out.println();
         UnaryOperator<String> z = a -> a + a;
         
    }
}
/*
A. BiConsumer<String, String>
B. BiFunction<String, String>
C. BinaryConsumer<String, String>
D. BinaryFunction<String, String>
E. Consumer<String>
F. Supplier<String>
G. UnaryOperator<String>
H. UnaryOperator<String, String>

R: A,F,G
*/