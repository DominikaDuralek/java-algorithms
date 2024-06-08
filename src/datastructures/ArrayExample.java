package datastructures;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Array example");

        // Array - stores multiple values in a single variable, has a static size

        System.out.println("\nCreating an empty array");
        String[] emptyArray = {};
        System.out.println("Array empty: " + ((emptyArray.length == 0) ? "true" : "false"));
        System.out.println("Size of the array: " + emptyArray.length);

        String[] items = {"item1", "item2", "item3", "item4"};
        System.out.println("\nArray empty: " + ((items.length == 0) ? "true" : "false"));
        System.out.println("Size of the array: " + items.length);

        System.out.println("\nAccessing element at index 0: " + items[0]);
        System.out.println("Accessing element at index 1: " + items[1]);

        System.out.println("\nCreating an empty array with a set size");
        int[] numbers = new int[5];
        System.out.println("Size of the array: " + numbers.length);

        System.out.println("\nAdding 5 elements to the empty array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length-1) System.out.print(numbers[i]);
            else System.out.print(numbers[i] + ", ");
        }
        System.out.print("]");

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSum of all the elements: " + sum);
    }
}
