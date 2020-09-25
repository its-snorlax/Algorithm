package sortings;

public abstract class SortingAlgo {
    abstract int[] sort(int[] array);

    protected static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
