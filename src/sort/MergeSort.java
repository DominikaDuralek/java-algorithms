package sort;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Merge sort");

        // Merge sort
        // - divide and conquer algorithm
        // - divides a collection in 2 ('left' and 'right' sub-collection)
        // - it's recursive (at the end of an iteration we merge sort again)
        // - merge sort is called until sub-collections have a size of 1
        // - then elements get merged back together in order
        // - runtime complexity: O(n log n)
        // - in large data sets it's quicker than insertion, selection and bubble sort
        // -> but it does use more space than those algorithms

        int[] array = {9, 1, 8, 7, 3, 6, 4, 2, 5};

        mergeSort(array);

        for (int number : array) {
            System.out.print(number);
        }
    }

    // Recursive merge sort function
    private static void mergeSort(int[] array) {
        int length = array.length;
        // Base case
        if (length <= 1) return;

        // Create two sub-arrays
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Left array counter
        int i = 0;
        // Right array counter
        int j = 0;

        for (; i < length; i++) {
            if (i < middle) leftArray[i] = array[i];
            else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        // Indices for: array, leftArray, rightArray
        int i = 0, l = 0, r = 0;

        // Check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
