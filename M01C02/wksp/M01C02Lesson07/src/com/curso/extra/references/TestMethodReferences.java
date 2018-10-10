package com.curso.extra.references;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author JLIL
 */
public class TestMethodReferences {
    public static void main(String[] args) {
        List <Cancion> list = Cancion.demoList();
        /* * /
        list.stream().forEach( x -> System.out.println(x) );
        System.out.println("---------------------------");
        list.forEach( c -> c.printCancionInfo() );
        System.out.println("---------------------------");
        list.forEach( c -> Cancion.printInfo(c) );
        
        System.out.println("---------------------------");
        list.forEach(Cancion::printCancionInfo);
        System.out.println("---------------------------");
        list.forEach(Cancion::printInfo);
        /* */        
        
        Stream <Cancion>s1 = list.stream();
        
        s1.filter(c -> c.getRating() >= 4)
                .peek( x -> System.out.println(x))
                .filter(c -> c.getGenero().equalsIgnoreCase("Pop"))
                .forEach(System.out::println);
        
        s1.forEach(System.out::println);
        
        //list.stream().forEach(System.out::println);
        
        System.out.println("---------------------------");
        //list.stream().filter(c -> c.getGenero().equals("Ranchero")).forEach(Cancion::printInfo);
        
        //List <Cancion> filtrada = list.stream().filter(c -> c.getGenero().equals("Ranchero")).collect(Collectors.toList());
        
        //filtrada.stream().forEach(Cancion::printInfo);
        
        
        //filtrada.stream().map(Cancion::new).forEach(Cancion::printInfo);
    }
    
    
}
/*
filter()
map()
peek()
sorted()
collect()
*/