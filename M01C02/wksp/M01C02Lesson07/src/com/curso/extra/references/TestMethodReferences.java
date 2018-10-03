package com.curso.extra.references;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author JLIL
 */
public class TestMethodReferences {
    public static void main(String[] args) {
        List <Cancion> list = Cancion.demoList();
        
        //list.stream().peek( x -> System.out.println(x)).forEach(System.out::println);
        System.out.println("---------------------------");
//        list.stream().filter(c -> c.getGenero().equals("Ranchero")).forEach(Cancion::printInfo);
        List <Cancion> filtrada = list.stream().filter(c -> c.getGenero().equals("Ranchero")).collect(Collectors.toList());
//        filtrada.stream().peek(Cancion::new).forEach(Cancion::printInfo);
        filtrada.stream().map(Cancion::new).forEach(Cancion::printInfo);
    }
    
    
}
/*
filter()
map()
peek()
sorted()
collect()
*/