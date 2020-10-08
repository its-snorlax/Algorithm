package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void sample1() {
        int[] input = {-1, 0, 3, 5, 9, 12};
        int actual = new BinarySearch().search(input, 9);
        assertEquals(4, actual);
    }

    @Test
    public void sample2() {
        int[] input = {-1, 0, 3, 5, 9, 12};
        int actual = new BinarySearch().search(input, 2);
        assertEquals(-1, actual);
    }

    @Test
    public void sample3() {
        int[] input = {2, 5};
        int actual = new BinarySearch().search(input, 5);
        assertEquals(1, actual);
    }

    @Test
    public void sample4() {
        int[] input = {-1,0,3,5,9,12};
        int actual = new BinarySearch().search(input, 2);
        assertEquals(-1, actual);
    }

}