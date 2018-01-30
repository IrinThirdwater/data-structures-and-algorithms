public class Sort {

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
            elements.
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

}