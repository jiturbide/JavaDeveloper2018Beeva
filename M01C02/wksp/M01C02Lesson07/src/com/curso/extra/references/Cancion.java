package com.curso.extra.references;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author JLIL
 */
public class Cancion {
    private String nombre;
    private String cantante;
    private String genero;
    private int id;
    private int anio;
    private int rating;

    public Cancion() {
        this(0, "Cancion Demo", "Las Ardillitas", "Infantil", 1980, 5);
    }
    public Cancion(Cancion c) {
        //Clon
        this(0, c.getNombre(), c.getCantante(), c.getGenero(), c.getAnio(), c.getRating());
    }
    
    public Cancion(int id, String nombre, String cantante, String genero, int anio, int rating) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.genero = genero;
        this.id = id;
        this.anio = anio;
        this.rating = rating;
    }
    
    public static List<Cancion> demoList() {
        Deque <Cancion>lista = new ArrayDeque<>();
        lista.push(new Cancion(1, "Luis Miguel", "Bikina", "Ranchero", 1990, 5));
        lista.push(new Cancion(2, "Arjona", "Historia de Taxi", "Unknown", 1994, 3));
        lista.push(new Cancion(3, "Michael Jackson", "Thriller", "Pop", 1982, 5));
        lista.push(new Cancion(4, "Depeche Mode", "Walking in my shoes", "ElectroPop", 1993, 5));
        lista.push(new Cancion(5, "Enigma", "Return to Innocence", "New Age", 1993, 4));
        lista.push(new Cancion(5, "Luis Fonsi", "Despacito", "Regaeton", 2017, 4));
        
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

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", cantante=" + cantante + ", genero=" + genero + ", id=" + id + ", anio=" + anio + ", rating=" + rating + '}';
    }
    
}
