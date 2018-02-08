public class Sort {

    /**
     * Check whether the array of integers is sorted in ascending order.
     *
     * This method runs in O(array.length).
     *
     * @param array Array of integers to check for sortedness.
     * @return Boolean stating whether or not the array is sorted in ascending order.
     */
    public static boolean isSorted (int[] array) {
        int current = array[0];
        for (int i : array) {
            if (current <= i) {
                current = i;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Return the same array of integers sorted in ascending order
     * using insertion sort.
     *
     * This method runs in O(array.length^2).
     *
     * @param array Array of integers to be sorted.
     * @return Same array of integers sorted in ascending order.
     */
    public static int[] insertionSort (int[] array) {
        /*
            Insertion sort partitions the list into (initially empty)
            sorted sublist and another sublist containing the remaining
            elements. Then it will pick the first element in the
            'remaining' sublist and put it in the right place in the
            sorted sublist.
         */
        for (int remain = 1; remain < array.length; remain++) {
            int current = array[remain];
            int i = remain-1;
            while (i >= 0 && array[i] > current) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = current;
        }
        return array;
    }
    /**
     * Return the same array of integers sorted in ascending order
     * using selection sort.
     *
     * This method runs in O(array.length^2).
     *
     * @param array Array of integers to be sorted.
     * @return Same array of integers sorted in ascending order.
     */
    public static int[] selectionSort (int[] array) {
        /*
            Selection sort partitions the list into (initially empty)
            sorted sublist and another sublist containing the remaining
            elements. Then it will pick the smallest element in the
            'remaining' sublist and put it at the end of the sorted
            sublist.
         */
        for (int remain = 0; remain < array.length - 1; remain++) {
            int smallest = array[remain];
            int smallestIndex = remain;
            for (int i = remain + 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                    smallestIndex = i;
                }
            }
            array[smallestIndex] = array[remain];
            array[remain] = smallest;
        }
        return array;
    }
    
}
