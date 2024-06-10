package datastructures;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        System.out.println("HashTable example");

        // Hash table - a collection of key value pairs
        // - each pair is known as an entry
        // - hash table stores entries after using a key.hashCode() method on them
        // - hashcode = where it's placed on the hash table (index)
        // - if multiple entries are stored in the same place, they become a linked list
        // -> this is called a bucket
        // - hash table's size is dynamic
        // - not ideal for small data sets
        // - great for large data sets
        // - fast insertion, look up and deletion of key/value pairs
        // - runtime complexity:
        // best case: O(1) - no collisions
        // worst case: O(n) - all collisions (like a linked list)

        int hashTableSize = 10;
        Hashtable<Integer, String> hashTable = new Hashtable<>(hashTableSize);

        // Add elements to a hash table
        System.out.println("\nAdding 5 entries and printing a hash table:");
        hashTable.put(100, "item1");
        hashTable.put(123, "item2");
        hashTable.put(321, "item3");
        hashTable.put(555, "item4");
        hashTable.put(777, "item5");
        System.out.println(hashTable);

        // Getting a specific value by key
        System.out.println("\nValue for key 100: " + hashTable.get(100));
        System.out.println("Value for key 123: " + hashTable.get(123));

        System.out.println("\nAll entries");
        for (Integer key : hashTable.keySet()) {
            System.out.println(key + " : " + hashTable.get(key));
        }

        System.out.println("\nAll entries with hash codes");
        for (Integer key : hashTable.keySet()) {
            System.out.println(key.hashCode() + " : " + key + " : " + hashTable.get(key));
        }

        System.out.println("\nAll entries with indices from hash codes");
        for (Integer key : hashTable.keySet()) {
            System.out.println(key.hashCode() % hashTableSize + " : " + key + " : " + hashTable.get(key));
        }

        // Hash table with strings as keys
        System.out.println("\nHash table with strings as keys");
        Hashtable<String, String> hashTableStrings = new Hashtable<>(hashTableSize);
        System.out.println("Adding 5 entries and printing a hash table:");
        hashTableStrings.put("key1", "item1");
        hashTableStrings.put("key2", "item2");
        hashTableStrings.put("key3", "item3");
        hashTableStrings.put("key4", "item4");
        hashTableStrings.put("key5", "item5");
        System.out.println(hashTable);

        System.out.println("\nAll entries with hash codes");
        for (String key : hashTableStrings.keySet()) {
            System.out.println(key.hashCode() + " : " + key + " : " + hashTableStrings.get(key));
        }

        System.out.println("\nAll entries with indices from hash codes");
        for (String key : hashTableStrings.keySet()) {
            System.out.println(key.hashCode() % hashTableSize + " : " + key + " : " + hashTableStrings.get(key));
        }
    }
}
