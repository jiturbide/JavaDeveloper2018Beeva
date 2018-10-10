package com.curso.extra.asserts02;

//Invariantes de clase se refiere a validaciones de parametros y de poscondiciones 
public class TestAssertClassInvariant {
    public static void main(String[] args) {

    }
    public void adjustZoom(Camera c, int increment) {
        // Precondition:
        assert isValid(increment) : "Zoom increment invalid.";
        // Proceed with the adjustment.
        c.zoomUp(increment);
        // Postcondition 
        assert isImageStable() : "Image not stable.";
    }    
    private boolean isValid(int value){return value >= 0;}
    private boolean isImageStable(){return true;}
}

class Camera{
    private int zoom;
    public void zoomUp(int increment) {zoom+=increment;}
    public boolean zoomDown() {zoom--; return (zoom>=0)? true: false;}
    
}