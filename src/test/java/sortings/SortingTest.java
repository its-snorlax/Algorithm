package sortings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public final void sortUsingSelectionSortOfAlreadySortedArray() {
        int[] input = {1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 2, 3, 4}, new SelectionSort().sort(input));
    }

    @Test
    public final void sortUsingSelectionSortOfArrayHaveSameValues() {
        int[] input = {1, 1, 1};
        assertArrayEquals(new int[]{1, 1, 1}, new SelectionSort().sort(input));
    }

    @Test
    public final void sortUsingSelectionSortOfUnsortedArray() {
        int[] input = new int[]{6, 2, 3, 4, 3};
        assertArrayEquals(new int[]{2, 3, 3, 4, 6}, new SelectionSort().sort(input));
    }

    @Test
    public final void sortUsingInsertionSortOfAlreadySortedArray() {
        int[] input = {1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 2, 3, 4}, new InsertionSort().sort(input));
    }

    @Test
    public final void sortUsingInsertionSortOfArrayHaveSameValues() {
        int[] input = {1, 1, 1};
        assertArrayEquals(new int[]{1, 1, 1}, new InsertionSort().sort(input));
    }

    @Test
    public final void sortUsingInsertionSortOfUnsortedArray() {
        int[] input = new int[]{6, 2, 3, 4, 3};
        assertArrayEquals(new int[]{2, 3, 3, 4, 6}, new InsertionSort().sort(input));
    }
}