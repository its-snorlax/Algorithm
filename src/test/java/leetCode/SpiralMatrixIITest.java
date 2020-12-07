package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SpiralMatrixIITest {
    @Test
    public void sample1() {
        int n = 3;
        int[][] expectedOutput = new SpiralMatrixII().generateMatrix(n);
        int[][] actualOutput = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

        for (int i = 0; i < n; i++)
            assertEquals(Arrays.toString(actualOutput[i]),
                    Arrays.toString(expectedOutput[i]));
    }

    @Test
    public void sample2() {
        int n = 1;
        int[][] expectedOutput = new SpiralMatrixII().generateMatrix(n);
        int[][] actualOutput = {{1}};
        for (int i = 0; i < n; i++)
            assertEquals(Arrays.toString(actualOutput[i]),
                    Arrays.toString(expectedOutput[i]));
    }
}