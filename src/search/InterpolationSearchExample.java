package search;

public class InterpolationSearchExample {
    public static void main(String[] args) {
        System.out.println("Interpolation search");

        // Interpolation search - improvement over binary search
        // - guesses where the target value is based on calculated probe results
        // - if probe is incorrect, search area is narrowed
        // - then a new probe is calculated
        // - average case: O(log(log n))
        // - worst case: O(n) (values increase exponentially)
        // - works well with evenly distributed data

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = interpolationSearch(array, 8);

        if (index != -1) System.out.println("Target found at index: " + index);
        else System.out.println("Target not found");
    }

    private static int interpolationSearch(int[] array, int value) {
        // Start of the array
        int low = 0;
        // End of the array
        int high = array.length - 1;

        // Using a while loop to continue guessing
        while (value >= array[low] && value <= array[high] && low <= high) {
            // Guessing the target value index
            int probe = (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: " + probe);

            if (array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe - 1;
        }

        // Sentinel value (target not found):
        return -1;
    }
}
