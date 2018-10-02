package com.curso.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestComparator {
    public static void main(String[] args) {
        Set <Alumno>lista = new TreeSet<>(new ChainingComparator());
        
        lista.add(new Alumno(1, "Homero", 'M', 7.0));
        lista.add(new Alumno(2, "Bart", 'M', 7.0));
        lista.add(new Alumno(3, "Lisa", 'F', 10.0));
        lista.add(new Alumno(4, "Marge", 'F', 9.0));
        
        System.out.println(lista);
    }
}

class ChainingComparator implements Comparator<Alumno> {
    public int compare(Alumno s1, Alumno s2) {
        Comparator<Alumno> c = Comparator.comparing(a -> a.getGenero());
        //c = c.reversed();
        c = c.thenComparing(a -> a.getNombre());
        return c.compare(s1, s2);
    }
}

class Alumno {
    private String nombre;
    private int nuLista;
    private double promedio;
    private char genero;

    public Alumno(int nuLista, String nombre, char genero, double promedio) {
        this.nombre = nombre;
        this.nuLista = nuLista;
        this.promedio = promedio;
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNuLista() {
        return nuLista;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nuLista=" + nuLista + ", promedio=" + promedio + ", genero=" + genero + '}' + "\n";
    }
    
    
}
