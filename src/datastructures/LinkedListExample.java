package datastructures;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("LinkedList example");

        // LinkedList
        // - each item contains data and the address to the next item (a pointer)
        // - it doesn't have an index
        // - each node knows where the next node resides
        // - the tail item of the linked list contains an address of 'null'
        // - bad at searching the items (O(n))
        // - good at adding or deleting nodes
        // - a doubly linked list contains the prev and next address

        // Example uses?
        // - implementing Stacks/Queues
        // - GPS navigation
        // - music playlist

        // This is a doubly linked list by default
        System.out.println("\nCreating a linked list");
        LinkedList<String> linkedList = new LinkedList<>();

        // Linked lists in Java can also be treated as a stack or a queue
        System.out.println("\nAdding to a linked list like it's a stack (push)");
        System.out.println("Pushing items 'A', 'B', 'C', 'D', 'F'");
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        System.out.println("Current linked list: " + linkedList);

        System.out.println("\nPushing items from the linked list");
        linkedList.pop();
        linkedList.pop();
        System.out.println("Current linked list: " + linkedList);
        linkedList.clear();

        System.out.println("\nAdding to a linked list like it's a queue (offer)");
        System.out.println("Offering items 'A', 'B', 'C', 'D', 'F'");
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println("Current linked list: " + linkedList);

        System.out.println("\nPolling items from the linked list");
        linkedList.poll();
        linkedList.poll();
        System.out.println("Current linked list: " + linkedList);
        linkedList.clear();

        System.out.println("\nAdding items to a linked list");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("F");

        System.out.println("\nAdding item 'E' at the 4th 'index'");
        // The linked list still needs to use linear search to find the correct place
        linkedList.add(4, "E");
        System.out.println("Current linked list: " + linkedList);

        System.out.println("\nRemoving item 'E' from the linked list");
        linkedList.remove("E");
        System.out.println("Current linked list: " + linkedList);

        // Searching for an element
        System.out.println("Index of the element 'F': " + linkedList.indexOf("F"));

        // We can peek the head or the tail of a linked
        System.out.println("\nHead of the linked list: " + linkedList.peekFirst());
        System.out.println("Tail of the linked list: " + linkedList.peekLast());

        // Adding to the head or tail
        System.out.println("\nAdding to the head");
        linkedList.addFirst("0");
        System.out.println("Current linked list: " + linkedList);
        System.out.println("Adding to the tail");
        linkedList.addLast("1");
        System.out.println("Current linked list: " + linkedList);
        // Removing the current head or tail: removeFirst() or removeLast()
    }
}
