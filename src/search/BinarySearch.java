package search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary search");

        // Binary search - finds target position within a sorted array
        // - half of the array eliminated during each step
        // - runtime complexity: 0(log n)
        // - efficient in large data sets
        // - not optimal for small data sets
        // -> find a middle value in a sorted collection
        // -> compare the middle value to target value
        // -> eliminate the half of the array that won't match the target
        // -> repeat until target value found or the array size is 1

        int array[] = new int[1000];
        int target = 701;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Built in binary search
        int index = Arrays.binarySearch(array, target);
        if(index == -1) System.out.println(target + " not found");
        else System.out.println("Element " + target + " found at: " + index);

        // DIY binary search
        int index2 = binarySearch(array, target);
        if(index == -1) System.out.println('\n' + target + " not found");
        else System.out.println("Element " + target + " found at: " + index);
    }

    // Binary search function
    private static int binarySearch(int[] array, int target) {
        // Start of the array
        int low = 0;
        // End of the array
        int high = array.length - 1;

        while(low <= high) {
            // Find middle value
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println("Middle value: " + middle);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            // Target found in the middle:
            else return middle;
        }

        // Sentinel value (target not found):
        return -1;
    }
}
