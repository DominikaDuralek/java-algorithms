package datastructures;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        System.out.println("Queue example");

        // Queue = FIFO (First In First Out) data structure
        // - a collection designed for holding elements
        //   prior to processing linear data structure
        // - offer() = enqueue (add)
        // - poll() = dequeue (remove)
        // - any queue has a 'head' and a 'tail'

        // When is Queue useful?
        // - keyboard buffer (letters appear in order they're pressed)
        // - printer queue (pages printed in order)
        // - used in LinkedList, PriorityQueue and Breadth-first search

        // In Java - Queue is an interface, not a class
        // So it can't be instantiated -> Queue<String> queue = new Queue<String>();
        // We can only instantiate classes that implement the Queue
        // - LinkedList and PriorityQueue

        Queue<String> queue = new LinkedList<>();

        // Currently the queue is empty
        System.out.println("\nQueue empty: " + queue.isEmpty());

        // Adding items to the queue
        queue.offer("person1");
        queue.offer("person2");
        queue.offer("person3");
        queue.offer("person4");
        queue.offer("person5");

        System.out.println("\nAdded items: person1, person2, person3, person4, person5");
        System.out.println("Queue empty: " + queue.isEmpty());
        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Current queue: " + queue);

        // Checking the item at the head of the queue (without removing it)
        System.out.println("\nItem at the head: " + queue.peek());
        System.out.println("Current queue: " + queue);

        // Removing an element from the queue
        System.out.println("\nRemoving an item: " + queue.poll());
        System.out.println("Current queue: " + queue);

        // Removing more items
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println("\nRemoving 3 more items");
        System.out.println("Current queue: " + queue);

        // Re-adding items to the queue
        System.out.println("\nAdded items: person1, person2, person3, person4");
        queue.offer("person1");
        queue.offer("person2");
        queue.offer("person3");
        queue.offer("person4");
        System.out.println("Current queue: " + queue);

        // Checking if the queue contains a certain object
        System.out.println("\nDoes the queue contain person1: " + queue.contains("person1"));
        System.out.println("Does the queue contain person0: " + queue.contains("person0"));
    }
}
