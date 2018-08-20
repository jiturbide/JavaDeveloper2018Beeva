package com.curso.model;

public class ItemCarga extends ItemBean {
    private int status = -100;

    {  //Inicializador de instancia
       System.out.println("Inicializador instancia ItemCarga " + this); 

       this.init(); 
    }
    
    private ItemCarga(){
        //super();
        
        System.out.println("Creando ItemCarga() " + this);
        status = -300;
        this.init();
    }
    
    public ItemCarga(String msg){
        super(msg);
        //this();
        System.out.println("Creando ItemCarga(String) " + this);
    }
    
    private void init() { System.out.println("Inicializando ..."); }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + " ItemCarga{" + "status=" + status + '}';
    }
    
    

}
