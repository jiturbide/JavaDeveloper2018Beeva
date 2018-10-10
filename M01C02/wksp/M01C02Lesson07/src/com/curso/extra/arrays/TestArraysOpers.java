package com.curso.extra.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author JLIL
 */
public class TestArraysOpers {

    public static void main(String[] args) {
        int[] numbers = {6, 9, 1, 8};
        //                        0 1 2 3
        Arrays.sort(numbers); // [1,6,8,9]
        System.out.println(Arrays.binarySearch(numbers, 6)); // 1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2   pos:-1-1 = -2
        System.out.println(Arrays.binarySearch(numbers, 7)); // -3

        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        //                          0  1  2  3
        Collections.sort(list); // [3, 5, 7, 9]
        System.out.println(Collections.binarySearch(list, 3)); // 0
        System.out.println(Collections.binarySearch(list, 2)); // -1     -0 -1 = -1
        

    }
}
