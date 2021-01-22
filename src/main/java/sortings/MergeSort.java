package sortings;

public class MergeSort extends SortingAlgo {
    @Override
    int[] sort(int[] array) {
        if (array.length <= 1) return array;
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {
        int[] list1 = new int[mid - low + 1];
        int[] list2 = new int[high - mid];

        for (int i = 0; i < list1.length; i++) list1[i] = array[i + low];
        for (int i = 0; i < list2.length; i++) list2[i] = array[mid + 1 + i];

        int i = 0, j = 0, pos = low;

        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) array[pos] = list1[i++];
            else array[pos] = list2[j++];
            pos++;
        }

        while (i < list1.length) array[pos++] = list1[i++];
        while (j < list2.length) array[pos++] = list2[j++];
    }
}
