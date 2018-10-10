package com.curso.solexamen;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Cap04Q03 {

    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> {
            System.out.println(s + s); 
            return s + s;});
        boolean b1 = stream.noneMatch(predicate);
        boolean b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);

    }
}
// -- --- ---- ---- 
/*
What is the output of the following?
Predicate<? super String> predicate = s -> s.length() > 3;
Stream<String> stream = Stream.iterate("-", (s) -> s + s);
boolean b1 = stream.noneMatch(predicate);
boolean b2 = stream.anyMatch(predicate);
System.out.println(b1 + " " + b2);
A. false true
B. false false
C. java.util.stream.ReferencePipeline$3@4517d9a3
D. The code does not compile.   
E. An exception is thrown.
F. The code hangs.

R: E
*/