package com.curso.opers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysOperations {
    public static void main(String[] args) {
        
        //Sort
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print (numbers[i] + " ");
        }
        System.out.println("------------------------");
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.print(string + " ");
        }        
        
        //Busqueda binaria en arreglo clasificado
        /*  Caso                    Resultado
            Elemento existe     =>  retorna index
            Elemento no existe  =>  valor negativo donde una coincidencia
                                    necesita insertarse para preservar el orden 
            Arreglo no ordenado =>  REsultado no predecible
        */
        int[] numbers1 = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers1, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers1, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers1, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers1, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers1, 9)); // -5
        
        /*
        int [] numbers2 = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers2, 2));
        System.out.println(Arrays.binarySearch(numbers2, 3));
        */
    }
}
