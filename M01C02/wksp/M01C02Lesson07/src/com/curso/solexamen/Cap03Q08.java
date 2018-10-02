package com.curso.solexamen;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author JLIL
 */
public class Cap03Q08 {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
          // On
          // ONE One one
        
        for (int i = '1'; i < 'z'; i++) {
            System.out.println(i + " " + ((char) i));
        }
        
    }  // null3098675

}
