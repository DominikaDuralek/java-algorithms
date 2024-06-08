package search;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear search");

        // Linear search - Iterate through a collection one element at a time
        // - runtime complexity: 0(n)
        // - slow for large data sets
        // - fast for small to medium data sets
        // - does not need sorted data
        // - useful for data structures without random access (like LinkedList)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array, 3);

        if(index != -1) System.out.println("Element found at index: " + index);
        else System.out.println("Element not found");
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        // Sentinel value:
        return -1;
    }
}
