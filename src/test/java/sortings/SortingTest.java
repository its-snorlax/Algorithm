package sortings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public final void sortUsingSelectionSortOfAlreadySortedArray() {
        int[] input = {1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 2, 3, 4}, SelectionSort.sort(input));
    }

    @Test
    public final void sortUsingSelectionSortOfArrayHaveSameValues() {
        int[] input = {1, 1, 1};
        assertArrayEquals(new int[]{1, 1, 1}, SelectionSort.sort(input));
    }

    @Test
    public final void sortUsingSelectionSortOfUnsortedArray() {
        int[] input = new int[]{6, 2, 3, 4, 3};
        assertArrayEquals(new int[]{2, 3, 3, 4, 6}, SelectionSort.sort(input));
    }

    @Test
    public final void sortUsingInsertionSortOfAlreadySortedArray() {
        int[] input = {1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 2, 3, 4}, InsertionSort.sort(input));
    }

    @Test
    public final void sortUsingInsertionSortOfArrayHaveSameValues() {
        int[] input = {1, 1, 1};
        assertArrayEquals(new int[]{1, 1, 1}, InsertionSort.sort(input));
    }

    @Test
    public final void sortUsingInsertionSortOfUnsortedArray() {
        int[] input = new int[]{6, 2, 3, 4, 3};
        assertArrayEquals(new int[]{2, 3, 3, 4, 6}, InsertionSort.sort(input));
    }
}