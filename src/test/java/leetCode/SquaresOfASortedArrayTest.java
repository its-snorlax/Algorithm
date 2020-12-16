package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SquaresOfASortedArrayTest {
    @Test
    public void sample1() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] expectedOutput = {0, 1, 9, 16, 100};
        int[] actualOutput = new SquaresOfASortedArray().sortedSquares(input);
        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(actualOutput));
    }

    @Test
    public void sample2 () {
        int[] input = {-7, -3, 2, 3, 11};
        int[] expectedOutput = {4, 9, 9, 49, 121};
        int[] actualOutput = new SquaresOfASortedArray().sortedSquares(input);
        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(actualOutput));
    }
}