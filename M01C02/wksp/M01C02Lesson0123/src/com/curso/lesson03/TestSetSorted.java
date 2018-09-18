package com.curso.lesson03;

import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author JLIL
 */
public class TestSetSorted {
    public static void main(String[] args) {
        Set <Alumno> grupo = new TreeSet<>(); //TreeSet SortedSet
        //Set <Alumno> grupo = new HashSet<>();
        
        //Set no permite agregar elementos que equals considere duplicados
        //Los elementos se clasifican
        
        grupo.add(new Alumno(99, "Pedrito", 'M'));
        grupo.add(new Alumno(99, "Pedrito", 'M'));
        grupo.add(new Alumno(10, "Pedrito", 'M'));
        grupo.add(new Alumno(10, "Pedrito", 'M'));
        grupo.add(new Alumno(22, "Pedrito", 'M'));
        grupo.add(new Alumno(22, "Pedrito", 'M'));

//          Alumno a = new Alumno(3, "Pedrito", 'M');
//          grupo.add(a);
//          grupo.add(a);
//          grupo.add(a);

        grupo.forEach(i -> System.out.println(i));
    }
}


class Alumno implements Comparable<Alumno>{
    private int id;
    private String nombre;
    private char genero;

    public Alumno(int id, String nombre, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public char getGenero() {
        return genero;
    }

//    @Override
//    public int hashCode() {
//        return this.id;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Alumno other = (Alumno) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        if (!Objects.equals(this.nombre, other.nombre)) {
//            return false;
//        }
//        if (this.genero != other.genero) {
//            return false;
//        }
//        return true;
//    }

    
    
    @Override
    public String toString() {
        //return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + '}';
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int compareTo(Alumno a) {
        int result = this.id < a.id? -1 : this.id>a.id? 1 : 0;
        return result;
    }
}