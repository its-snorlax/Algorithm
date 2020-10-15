package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RotateArrayTest {
    @Test
    public void sample1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(new RotateArray().rotate(input, 3)));
    }

    @Test
    public void sample2() {
        int[] input = {-1, -100, 3, 99};
        assertEquals("[3, 99, -1, -100]", Arrays.toString(new RotateArray().rotate(input, 2)));
    }
}