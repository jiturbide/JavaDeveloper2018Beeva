package com.curso.solexamen;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author JLIL
 */
public class Cap03Q07 {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));  //X
        numbers.add(null);
        //numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
        
        
    }  // null3098675
    
    
    
}
