package com.curso.model;

import java.io.Serializable;

public class ItemBean implements Serializable {
    private int itemID = -1;
    private String desc = "No especificado";
    private double price;
    private int quantity; 
    
    {
        System.out.println("Inicializador Instancia ItemBean " + this);
    }
    
    // Constructores
    public ItemBean() {
        System.out.println("Creando ItemBean()");
        System.out.println("Creando ItemBean() " + this);
    }
    // Constructores
    public ItemBean(String msg) {
        System.out.println("Creando ItemBean(String) " + this);
    }
    

    /* Getters Setters */
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", desc=" + desc + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}