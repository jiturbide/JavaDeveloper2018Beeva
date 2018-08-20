package com.curso.cargas.model;

import com.curso.model.ItemBean;

class ItemCarga extends ItemBean {
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        //return super.toString() + " ItemCarga{" + "status=" + status + '}';
        return "Item{" + "itemID=" + this.getItemID() + ", desc=" + desc + ", price=" +
                this.getPrice() + ", quantity=" + this.getQuantity() + '}';

    }
    
}
