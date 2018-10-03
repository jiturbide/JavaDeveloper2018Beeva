package com.curso.extra.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @author JLIL
 */
public class TestDeque {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        System.out.println("---------------------");
        
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        System.out.println("---------------------");
        //Agregar numeros 
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.offer(4);
        deque.offerFirst(5);
        deque.offerLast(6);
        deque.push(7);

        deque.forEach(x -> System.out.print(x + ", "));
        System.out.println("\n ---------------------");
        
        //Echar un vistazo
        System.out.println("deque.peek(): " + deque.peek());
        System.out.println("deque.peekFirst(): " + deque.peekFirst());
        System.out.println("deque.peekLast(): " + deque.peekLast());

        //Recuperarlos
        System.out.println("deque.getFirst(): " + deque.getFirst());
        System.out.println("deque.getLast(): " + deque.getLast());        
        System.out.println("deque.element(): " + deque.element());

        //Removerlos
        deque.remove();
        deque.poll();
        deque.pollFirst();
        deque.pollLast();
        deque.pop();
        
        deque.forEach(x -> System.out.print(x + ", "));
        
        
    }
}

/*
ArrayDeque Que

*/

/* 
peek()  Q vacia -> null      Echa un vistazo 
offer() boolean   Agrega un elemento
poll()  remove elemento o null si esta vacia

add()   boolean, IllegalStateException Agrega un elemento
remove() remueve el elemento o NoSuchElementException
element() Q vacia -> NoSuchElementException Echa un vistazo
*/
