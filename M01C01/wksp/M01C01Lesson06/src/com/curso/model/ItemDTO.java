package com.curso.model;

import java.io.Serializable;

/**
 * Clase que contiene los productos de una venta
 * @author jose.iturbide
 */
public class ItemDTO implements Serializable {
    /* Variables de instancia */
    private int itemID;
    private String desc;
    private double price;
    private int quantity; 
    
    // Constructores
    public ItemDTO() {
    }

    public ItemDTO(int itemID, String desc, double price, int quantity) {
        this.itemID = itemID;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
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