package com.curso.solexamen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cap04Q07 {
    public static void main(String[] args) {
        List <String> l = Arrays.asList("b", "z", "x", "a", "y", "c");
        
        System.out.println("l: " + sort(l));
        System.out.println("l2: " + sort2(l));
        
    }
    
    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }

    private static List<String> sort2(List<String> list) {
        return list.stream()
    .sorted((a, b) -> b.compareTo(a))
    .collect(Collectors.toList());
    }
}

/*
A. return list.stream()
    .compare((a, b) -> b.compareTo(a))
    .collect(Collectors.toList());
B. return list.stream()
    .compare((a, b) -> b.compareTo(a))
    .sort();
C. return list.stream()
    .compareTo((a, b) -> b.compareTo(a))
    .collect(Collectors.toList());
D. return list.stream()
    .compareTo((a, b) -> b.compareTo(a))
    .sort();
E. return list.stream()
    .sorted((a, b) -> b.compareTo(a))
    .collect();
F. return list.stream()
    .sorted((a, b) -> b.compareTo(a))
    .collect(Collectors.toList());

R: F
*/