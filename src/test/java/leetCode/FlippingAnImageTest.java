package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FlippingAnImageTest {
    @Test
    public void sample1() {
        int[][] input = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0,}};
        int[][] actualOutput = new FlippingAnImage().flipAndInvertImage(input);
        int[][] expectedOutput = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        assertEquals(expectedOutput.length, actualOutput.length);
        for (int i=0;i<actualOutput.length; i++) {
            assertEquals(Arrays.toString(expectedOutput[i]),Arrays.toString(actualOutput[i]));
        }
    }

    @Test
    public void sample2() {
        int[][] input = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0,}};
        int[][] actualOutput = new FlippingAnImage().flipAndInvertImage(input);
        int[][] expectedOutput = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};

        assertEquals(expectedOutput.length, actualOutput.length);
        for (int i=0;i<actualOutput.length; i++) {
            assertEquals(Arrays.toString(expectedOutput[i]),Arrays.toString(actualOutput[i]));
        }
    }
}