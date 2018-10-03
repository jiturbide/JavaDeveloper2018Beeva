package com.curso.solexamen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JLIL
 */
public class Cap03Q03 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add(7);
        for (String s : list) {
            System.out.print(s);
        }
    }
}
