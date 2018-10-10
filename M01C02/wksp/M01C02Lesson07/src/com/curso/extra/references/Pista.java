package com.curso.extra.references;

/**
 * @author JLIL
 */
public class Pista extends Cancion{
    public Pista() {
        this(0, "Cancion Demo", "Las Ardillitas", "Infantil", 1980, 5);
    }
    public Pista(Pista c) {
        //Clon
        this(0, c.getNombre(), c.getCantante(), c.getGenero(), c.getAnio(), c.getRating());
    }
    
    public Pista(int id, String nombre, String cantante, String genero, int anio, int rating) {
        super(id, nombre, cantante, genero, anio, rating);
    }
    
//    public int hashCode() {
//        System.out.println("hashCode: " + getId());
//        return this.getId();
//    }
//    
//    public boolean equals(Pista p) {
//        return (this.id - p.id == 0)? true : false;
//    }
}
