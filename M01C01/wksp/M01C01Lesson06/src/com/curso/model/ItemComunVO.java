package com.curso.model;

import java.io.Serializable;

/**
 * Clase que contiene los productos de una venta
 * @author jose.iturbide
 */
public class ItemComunVO implements Serializable {
    /* Variables de instancia */
    private int itemID;
    private String desc;
    private double price;
    private int quantity; 

    public ItemComunVO(int itemID, String desc, double price, int quantity) {
        this.itemID = itemID;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }    
    
    /* Getters Setters */
    public int getItemID() {
        return itemID;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", desc=" + desc + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}