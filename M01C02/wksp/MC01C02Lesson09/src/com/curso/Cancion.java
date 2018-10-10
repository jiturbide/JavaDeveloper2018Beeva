package com.curso;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
    private String nombre;
    private String cantante;
    private String genero;
    private int id;
    private int anio;
    private int rating;
    private double precio;

    public Cancion() {
        this(0, "Las Ardillitas", "Cancion Demo", "Infantil", 1980, 5, 10.0);
    }
    public Cancion(Cancion c) {
        //Clon
        this(0, c.getNombre(), c.getCantante(), c.getGenero(), c.getAnio(), c.getRating(), c.getPrecio());
    }
    
    public Cancion(int id, String cantante, String nombre, String genero, int anio, int rating, double precio) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.genero = genero;
        this.id = id;
        this.anio = anio;
        this.rating = rating;
        this.precio = precio;
    }
    
    public static List<Cancion> demoList() {
        Deque <Cancion>lista = new ArrayDeque<>();
        lista.push(new Cancion(1, "Luis Miguel", "Bikina", "Ranchero", 1990, 5, 10.0));
        lista.push(new Cancion(2, "Arjona", "Historia de Taxi", "Varios", 1994, 3, 10.0));
        lista.push(new Cancion(3, "Michael Jackson", "Thriller", "Pop", 1982, 5, 20.0));
        lista.push(new Cancion(4, "Depeche Mode", "Walking in my shoes", "ElectroPop", 1993, 5, 20.0));
        lista.push(new Cancion(5, "Enigma", "Return to Innocence", "New Age", 1993, 4, 10.0));
        lista.push(new Cancion(6, "Luis Fonsi", "Despacito", "Regaeton", 2017, 4, 10.0));
        lista.push(new Cancion(7, "Lagrimita", "Las Mañanitas", "Varios", 2000, 2, 10.0));
        lista.push(new Cancion(8, "U2", "Beautiful Day", "Rock", 2003, 4, 10.0));
        lista.push(new Cancion(9, "Shakira", "Perro fiel", "Regaeton", 2017, 3, 10.0));
        lista.push(new Cancion(10, "Molotov", "Gimme tha power", "Funk Rock", 2017, 4, 10.0));
        
        return new ArrayList(lista);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public String getGenero() {
        return genero;
    }

    public int getId() {
        return id;
    }

    public int getAnio() {
        return anio;
    }

    public int getRating() {
        return rating;
    }

    public void printCancionInfo() {
        System.out.println(this);
    }

    public static void printInfo(Cancion c) {
        System.out.println(c);
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", cantante=" + cantante + ", genero=" + genero + ", id=" + id + ", anio=" + anio + ", rating=" + rating + ", precio=" + precio + '}';
    }

    


    public int hashCode() {
        System.out.println("hashCode: " + getId());
        return this.getId();
    }
        
    @Override
    public boolean equals(Object obj) {
        System.out.print("equals?");
        
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.cantante, other.cantante)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.rating != other.rating) {
            return false;
        }
        System.out.println(true);
        return true;
    }

    public int compareTo(Cancion o) {
        System.out.println("compareTo(Cancion o) " + this + "##" + o);
        return this.id - o.id;
    }
    
     
}
