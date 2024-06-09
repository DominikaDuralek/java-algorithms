package sort;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection sort");

        // Selection sort
        // - keeps track of the collection's min value during each iteration
        // - at the end of each iteration - swap elements if new min found
        // - one iteration for each element
        // - runtime complexity: O(n^2)
        // - okay for small data sets
        // - bad for large data sets

        int[] array = {9, 1, 8, 7, 3, 6, 4, 2, 5};
        
        selectionSort(array);

        for (int number : array) {
            System.out.print(number);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Current min:
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                // Check to see if new min found
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            // Swap elements
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
