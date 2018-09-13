package com.curso.opers;

public class Mes{
    private String nombre;
    private int numero;
    private int dias; 

    public Mes(String nombre, int numero, int dias) {
        this.nombre = nombre; this.numero = numero; this.dias = dias;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public int getDias() { return dias; }

    public void setDias(int dias) { this.dias = dias; }    

    @Override
    public String toString() {
        return "Mes{" + "nombre=" + nombre + ", numero=" + numero + ", dias=" + dias + '}';
    } 
    
}
