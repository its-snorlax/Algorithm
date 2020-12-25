package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DiagonalTraverseTest {
    @Test
    public void sample1() {
        int[][] inputs = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] actualOutput = new DiagonalTraverse().findDiagonalOrder(inputs);
        int[] expectedOutput = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(actualOutput));
    }
}