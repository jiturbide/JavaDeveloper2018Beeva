package com.curso.extra.collections;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author JLIL
 */
public class TestDeque {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(10);
        
        //
        
        
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null
    }
}

/* 
peek()  Q vacia -> null      Echa un vistazo 
offer() boolean   Agrega un elemento
poll()  remove elemento o null si esta vacia

add()   boolean, IllegalStateException Agrega un elemento
remove() remueve el elemento o NoSuchElementException
element() Q vacia -> NoSuchElementException Echa un vistazo
*/
