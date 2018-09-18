package com.curso.hashcodeequals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCancion {
    public static void main(String[] args) {
        Set <Cancion>canciones = new TreeSet<>(new InterpreteComparator());  //HashSet 
        
        Set <String> nombres = new HashSet<>();
        
        nombres.add("El Rey");
        nombres.add("El Rey");
        nombres.add("Sapito");
        nombres.add("Sapito");
        
        nombres.forEach( nombre -> System.out.println(nombre)  );
        
        canciones.add(new Cancion("Sapito", "Xuxa", 3, 5000));
        canciones.add(new Cancion("El Rey", "Vicente Fernandez", 3, 5000));
        canciones.add(new Cancion("El Rey", "Jose Alfredo", 5, 10000));
        canciones.add(new Cancion("El Rey", "Luis Miguel", 5, 10006));
        canciones.add(new Cancion("Sapito", "Xuxa", 3, 5002));
        
        canciones.forEach(c -> { System.out.println(c); });

        System.out.println(" -------------------------------- ");
//        Cancion c0 = new Cancion("El Rey", "Jose Alfredo", 5, 10000);
//        canciones.add(c0);
//        canciones.add(c0);
//        canciones.add(c0);
//        canciones.add(c0);
        
//        canciones.forEach(c -> { System.out.println(c); });
        
        List <Cancion>canciones2 = new ArrayList<>();
        
        System.out.println("----------------------");
        canciones2.add(new Cancion("Sapito", "Xuxa", 3, 5000));
        canciones2.add(new Cancion("El Rey", "Vicente Fernandez", 3, 5000));
        canciones2.add(new Cancion("El Rey", "Jose Alfredo", 5, 10000));
        canciones2.add(new Cancion("El Rey", "Luis Miguel", 5, 10006));
        canciones2.add(new Cancion("Sapito", "Xuxa", 3, 5002));
        
        Collections.sort(canciones2, new InterpreteComparator());
                
        canciones2.forEach(c -> { System.out.println(c); });
        
        
        
    }
}


class Cancion implements Comparable {
    private String nombre;
    private String interprete;
    private int ranking;
    private int id;

    public Cancion(String nombre, String interprete, int ranking, int id) {
        this.nombre = nombre;
        this.interprete = interprete;
        this.ranking = ranking;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getRanking() {
        return ranking;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", interprete=" + interprete + ", ranking=" + ranking + ", id=" + id + '}';
    }

    @Override
    public int hashCode() {
        int hash = this.id + this.getNombre().hashCode();
        return hash;
    }

    //Jose Luis -> 600 
    //Luis Jose -> 600
    //Jose Luis -> 630 
    //Random() Mala impementacion
    //Devolver una constante return 2; 
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
//        if ( obj instanceof Cancion) {
//            return false;
//        }
        final Cancion other = (Cancion) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        // -1  0  1
        if(o == null) return 0;
        if(o.getClass() != this.getClass()) {
            return 0;
        }
        Cancion c = (Cancion) o;
        return this.getNombre().compareTo(c.getNombre());
    }
} //Fin de la clase

class InterpreteComparator implements Comparator<Cancion>{
    public int compare(Cancion o1, Cancion o2) {
        return -o1.getInterprete().compareTo(o2.getInterprete());  // -1  0  1
    }
}

/*
    nombre -1 0 1    x  1000000
    Interprete  -1 0 1  x 1000
    id        10

    1000000 + 1000 + 10 = 10001010;
*/

/*
Comparable compareTo() implementa directamente por la clase 
Comparator compare()


*/