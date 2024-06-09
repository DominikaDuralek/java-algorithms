package sort;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion sort");

        // Insertion sort
        // - in an unsorted array collection:
        // - for each element, check if elements on the 'left' are greater
        // - if yes, shift the greater element to the 'right'
        // - do it until a smaller element is found or no more elements left
        // - runtime complexity: O(n^2)
        // - decent for small data sets
        // - bad for big data sets
        // - fewer steps than bubble sort
        // - best case is O(n) compared to selection sort O(n^2)

        int[] array = {9, 1, 8, 7, 3, 6, 4, 2, 5};

        insertionSort(array);

        for (int number : array) {
            System.out.print(number);
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // A base element for comparison
            int temp = array[i];
            // Index to the left of i
            int j = i - 1;

            // Compare until out of elements or a smaller element is found
            while (j >= 0 && array[j] > temp) {
                // Shifting an element to the right
                array[j + 1] = array[j];
                // Move further to the left
                j--;
            }
            // Insert the value found within temp into an opening
            array[j + 1] = temp;
        }
    }
}
