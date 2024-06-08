package datastructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        System.out.println("PriorityQueue example");

        // PriorityQueue = FIFO (First In First Out) data structure
        // - serves elements with the highest priority first
        // - then serves the elements with lower priority

        // Creating a new queue (LinkedList, because Queue is just an interface)
        System.out.println("\nCreating a queue");
        Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        System.out.println("Current queue: " + queue);

        // Show and remove each item of the queue
        System.out.println("\nShowing and removing each item from the queue");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // PriorityQueues store their elements in a heap
        // (a min heap by default, but this can be changed with Collections.reverseOrder() passed to the constructor).
        // This data structure only guarantees that the first element, or the element received from poll()
        // will be the smallest element in the queue based on the natural ordering of the elements.

        // Creating a new priority queue
        System.out.println("\nCreating a priority queue");
        Queue<Double> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3.0);
        priorityQueue.offer(2.5);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.0);
        System.out.println("Current priority queue: " + priorityQueue);

        System.out.println("\nShowing and removing each item from the priority queue");
        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }


        // Reversed priority queue
        System.out.println("\nReversed priority queue");
        Queue<Double> reversedPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        reversedPriorityQueue.offer(3.0);
        reversedPriorityQueue.offer(2.5);
        reversedPriorityQueue.offer(4.0);
        reversedPriorityQueue.offer(1.5);
        reversedPriorityQueue.offer(2.0);
        System.out.println("Current reversed priority queue: " + reversedPriorityQueue);

        System.out.println("\nShowing and removing each item from the reversed priority queue");
        while(!reversedPriorityQueue.isEmpty()) {
            System.out.println(reversedPriorityQueue.poll());
        }

        // Priority queues containing something other than numbers
        System.out.println("\nCreating a priority queue with Strings");
        Queue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.offer("B");
        priorityQueue2.offer("C");
        priorityQueue2.offer("A");
        priorityQueue2.offer("F");
        priorityQueue2.offer("D");
        System.out.println("Current priority queue: " + priorityQueue2);

        System.out.println("\nShowing and removing each item from the priority queue");
        while(!priorityQueue2.isEmpty()) {
            System.out.println(priorityQueue2.poll());
        }
    }
}
