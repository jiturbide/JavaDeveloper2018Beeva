package com.curso;

public class TestArrays {
    static public void main(String [] s) {
        //3 pasos.
        //Declaracion
        int [] array = null;
        //asignacion de espacio
        array = new int[3];
        array = new int[]{1,2,3};
        //asignacion de valores;
        array[0] = 100;
        
        // 1 linea
        int array2[] = {1, 2, 3, 4, 6};
        int array3[] = new int[]{1,1,2,3,5,8};
        
        //int array4[5];
        int array5[] = null;
        //array5 = new int[5]{1,2,3};
        //array5 = {1,2,3};
        
        int [] array7[] = {};
        int [] array8[] = {{}, {}};
        int [] array9[] = {{}, null, {1,2,3}};
        
        
        String [] array10, array11;
        array10 = new String[]{"Hola", "Mundo", "!"};        
        array11 = new String[3]; 
        array11[2] = array10[2];
        
        String array12[] = new String[]{"hola", "mundo", "!"};
        String array13[] = {"hola", "mundo", new String("!"), null};
        
        String []array14[] = {};
        String []array15[] = {{}, null};
        String []array16[] = { null, {null}, {"Homero"} };
        
        String []array17[] = {  new String[]{}, {} };
        
        String []array18[] = new String[][]{  new String[]{}, {} };
        
        
    }
}
