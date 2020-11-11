package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidSquareTest {
    @Test
    public void sample1() {
        assertTrue(new ValidSquare().validSquare(new int[]{0, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}));
    }
}