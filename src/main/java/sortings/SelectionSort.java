package sortings;

public class SelectionSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {    
                swap(array, i, minIndex);
            }
        }
        return array;
    }

    private static void swap(int[] input, int i, int minIndex) {
        int temp = input[i];
        input[i] = input[minIndex];
        input[minIndex] = temp;
    }
}
