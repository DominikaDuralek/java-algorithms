package sort;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble sort");

        // Bubble sort
        // - compares adjacent elements to see if they're in order
        // - if not, the elements are switched
        // - repeat the process until the end of the collection
        // - n-1 passes to sort n elements
        // - runtime complexity: O(n^2)
        // - okay for small data sets (but still not optimal)
        // - bad for large data sets

        int[] array = {9, 1, 8, 7, 3, 6, 4, 2, 5};
        bubbleSort(array);

        for (int number : array) {
            System.out.print(number);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
