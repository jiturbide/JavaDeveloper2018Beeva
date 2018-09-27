package com.curso.arrays;

/**
 * @author JLIL
 */
public class TestArraysOpers {
    public static void main(String[] args) {
        11: int[] numbers = {6,9,1,8};
12: Arrays.sort(numbers); // [1,6,8,9]
13: System.out.println(Arrays.binarySearch(numbers, 6)); // 1
14: System.out.println(Arrays.binarySearch(numbers, 3)); // -2


15: List<Integer> list = Arrays.asList(9,7,5,3);
16: Collections.sort(list); // [3, 5, 7, 9]
17: System.out.println(Collections.binarySearch(list, 3)); // 0
18: System.out.println(Collections.binarySearch(list, 2)); // -1
    }
}
