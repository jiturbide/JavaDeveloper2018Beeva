package com.curso.extra.generics;

import java.util.ArrayList;
import java.util.List;

public class TestWildcardBounds {

    public static void printList(List<Object> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords); // DOES NOT COMPILE

        /* * /
         List<Integer> numbers = new ArrayList<>(); numbers.add(new
         Integer(42)); List<Object> objects = numbers; // DOES NOT COMPILE
         objects.add("forty two"); System.out.println(numbers.get(1));
         
        /* */
        
        /* */
        //ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
        List<? extends Number> list = new ArrayList<Integer>();
        list.add(new Integer(1));
        /**/
    }
}


/*

 class A {}
 class B extends A { }
 class C extends B { }
 Ready? Can you figure out why these do or don’t compile? Also, try to figure out what
 they do.
 6: List<?> list1 = new ArrayList<A>();
 7: List<? extends A> list2 = new ArrayList<A>();
 8: List<? super A> list3 = new ArrayList<A>();
 9: List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
 10: List<? super B> list5 = new ArrayList<A>();
 11: List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE

 */
