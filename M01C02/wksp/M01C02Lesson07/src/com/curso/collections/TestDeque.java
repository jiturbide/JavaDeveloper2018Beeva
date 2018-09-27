package com.curso.collections;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author JLIL
 */
public class TestDeque {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null
    }
}
