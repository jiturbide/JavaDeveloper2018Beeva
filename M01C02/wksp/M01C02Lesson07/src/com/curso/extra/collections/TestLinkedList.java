package com.curso.extra.collections;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList <String>ll = new LinkedList();
        
        ll.add("Febrero");
        ll.add("Abril");
        ll.add("Mayo");
        ll.addFirst("Enero");
        ll.addLast("Noviembre");
        /* * /
        ll.addAll(ll);        
        ll.removeFirstOccurrence("Noviembre");
        /* */
        System.out.println("list: " + ll);
        
        
    }
}
