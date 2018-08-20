package com.curso.model;

/**
 * Clase que contiene los productos de una venta
 * @author jose.iturbide
 */
public class Item {
    /* Variables de instancia */
    private int itemID;
    private String desc;
    private double price;
    private int quantity; 
    
    // Constructores
    
    
    /* Metodos de negocio */
    public void updateItem() {
        
    }
    
    public void finishStock() {
        
    }
    
    private void init() {
        
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