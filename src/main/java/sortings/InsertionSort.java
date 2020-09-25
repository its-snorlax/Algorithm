package sortings;

public class InsertionSort extends SortingAlgo {
    @Override
    int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int m = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[m] < array[j]) {
                    swap(array, m, j);
                    m = j;
                }
            }
        }
        return array;
    }
}
