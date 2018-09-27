package com.curso.lesson03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author JLIL
 */
public class TestSetSorted {
    public static void main(String[] args) {
        Set <Alumno> grupo = new TreeSet<>(); //TreeSet SortedSet
        //Set <Alumno> grupo = new HashSet<>();
        
        //Set no permite agregar elementos que equals considere duplicados
        //Los elementos se clasifican
        
        grupo.add(new Alumno(97, "Pedrito", 'M'));
        grupo.add(new Alumno(99, "Pedrito", 'M'));
        grupo.add(new Alumno(11, "Juanito", 'M'));
        grupo.add(new Alumno(10, "Juanito", 'M'));
        grupo.add(new Alumno(20, "Pepito", 'M'));
        grupo.add(new Alumno(22, "Pepito", 'M'));

//          Alumno a = new Alumno(3, "Pedrito", 'M');
//          grupo.add(a);
//          grupo.add(a);
//          grupo.add(a);

        grupo.forEach(i -> System.out.println(i));
        
        
        System.out.println("--------------------------");
        
        List <Alumno>list = new ArrayList<>();
        list.add(new Alumno(99, "Pedrito", 'M'));
        list.add(new Alumno(97, "Pedrito", 'M'));
        list.add(new Alumno(11, "Juanito", 'M'));
        list.add(new Alumno(10, "Juanito", 'M'));
        list.add(new Alumno(22, "Pepito", 'M'));
        list.add(new Alumno(20, "Pepito", 'M'));

        list.forEach(a -> System.out.println(a));
        
        //Comparator
        //Comparable        
        
        System.out.println("--------------------------");
        Collections.sort(list, (o1,o2) -> o1.getId() + o1.getNombre().compareTo(o2.getNombre()) );
        
        list.forEach(a -> System.out.println(a));
        
    }
}
/*
1 * 1000000 * 87
1 * 1000 * 83
1 * 10 * 7
   187 830 010
*/







class BaseBean {
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }    
}

class Alumno extends BaseBean implements Comparable<Alumno>{
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + this.genero;
        return hash;
    }
    
    //Jose Luis = 560     -> 1
    //Jorge Luis = 620    -> 1
    //Luis Jose = 560     -> 1
    //El algorito debe considerar alguna propiedad del objeto
    //Random 
    //Constante: Ineficiente 
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        return true;
    }

    
    
//    @Override
//    public String toString() {
//        //return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + '}';
//        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
//    }

    @Override
    public int compareTo(Alumno a) {
        //int result = this.id < a.id? 1 : this.id>a.id? -1 : 0;
        int result = this.nombre.compareTo(a.getNombre());
        return result;
    }
    
    // < 0 es menor
    // 0 equivalentes
    // > 0 es mayor
}