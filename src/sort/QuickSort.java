package sort;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("Quick sort");

        // Quick sort
        // - divide and conquer algorithm
        // - a pivot value is picked (typically at the middle or end of the collection)
        // - smaller elements are moved to the left of the pivot
        //  - recursively divides the collection into 2 partitions

        // - runtime complexity:
        // best case O(n log n)
        // average case O(n log n)
        // worst case O(n^2) if already sorted

        // space complexity O(log n) due to recursion

        int[] array = {9, 1, 8, 7, 3, 6, 4, 2, 5};

        quickSort(array, 0, array.length - 1);

        System.out.println("\nQuick sort approach 1:");
        for (int number : array) {
            System.out.print(number);
        }

        int[] array2 = {9, 1, 8, 7, 3, 6, 4, 2, 5};

        quickSort2(array2, 0, array2.length - 1);

        System.out.println("\n\nQuick sort approach 2:");
        for (int number : array2) {
            System.out.print(number);
        }
    }

    // Approach 1
    private static void quickSort(int[] array, int start, int end) {
        // Base case
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, pivot - 1);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        // Location of the pivot
        return i;
    }

    // Approach 2
    private static void quickSort2(int[] array, int lowIndex, int highIndex) {
        // If there's only one element left
        if (lowIndex >= highIndex) return;

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer <= rightPointer) {
            // Find the first element greater than or equal to pivot from the left
            while (leftPointer <= rightPointer && array[leftPointer] <= pivot) {
                leftPointer++;
            }

            // Find the first element less than or equal to pivot from the right
            while (leftPointer <= rightPointer && array[rightPointer] >= pivot) {
                rightPointer--;
            }

            if (leftPointer < rightPointer) {
                swap(array, leftPointer, rightPointer);
            }
        }

        // Swap the pivot element with the element at leftPointer
        swap(array, leftPointer, highIndex);

        // Recursively sort the elements before and after partition
        quickSort2(array, lowIndex, leftPointer - 1);
        quickSort2(array, leftPointer + 1, highIndex);
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
