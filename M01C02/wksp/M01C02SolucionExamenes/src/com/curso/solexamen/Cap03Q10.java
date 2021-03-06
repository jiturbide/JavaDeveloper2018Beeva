package com.curso.solexamen;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author JLIL
 */
public class Cap03Q10 {
    public static void main(String[] args) {
        String[] values = {"123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for (String s : values) {
            System.out.print(s + " ");
        }
    }
}
//123  Abb aab
//123 aab Abb
//Abb aab 123
class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }
}
