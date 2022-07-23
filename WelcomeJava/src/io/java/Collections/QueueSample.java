package io.java.Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
// Revision 2

public class QueueSample {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Apple");
        queue.add("Orange");
        queue.add("Grapes");
        queue.add("Guava");
        queue.add("Watermelon");
//        queue.poll();


//        queue.remove();

        for(String fruits: queue){
            System.out.println(fruits);
        }
    }
}
