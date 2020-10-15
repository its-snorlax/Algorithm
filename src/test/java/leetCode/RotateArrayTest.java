package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RotateArrayTest {
    @Test
    public void sample1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(new RotateArray().rotateRight(input, 3)));
    }

    @Test
    public void sample2() {
        int[] input = {-1, -100, 3, 99};
        assertEquals("[3, 99, -1, -100]", Arrays.toString(new RotateArray().rotateRight(input, 2)));
    }

    @Test
    public void sample3() {
        int[] input = {1, 2, 3, 4, 5};
        assertEquals("[5, 1, 2, 3, 4]", Arrays.toString(new RotateArray().rotateLeft(input, 4)));
    }

    @Test
    public void sample4() {
        int[] input = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        assertEquals("[77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77]",
                Arrays.toString(new RotateArray().rotateLeft(input, 10)));
    }

}