package com.curso.solexamen;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cap04Q11 {
    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, x -> x++).limit(5).map(x -> "" + x).collect(Collectors.joining())); 
        
    }
}
/*
11. What changes need to be made for this code to print the string 12345? (Choose all that apply.)
Stream.iterate(1, x -> x++).limit(5).map(x -> x).collect(Collectors.joining());

A. Change Collectors.joining() to Collectors.joining("").
B. Change map(x -> x) to map(x -> "" + x) .
C. Change x -> x++ to x -> ++x.
D. Add forEach(System.out::print) after the call to collect().
E. Wrap the entire line in a System.out.print statement.
F. None of the above. The code already prints 12345.

*/

//R: B, E