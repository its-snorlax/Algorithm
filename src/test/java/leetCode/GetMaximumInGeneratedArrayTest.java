package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetMaximumInGeneratedArrayTest {
    @Test
    public void sample1() {
        assertEquals(3, new GetMaximumInGeneratedArray().getMaximumGenerated(7));
    }

    @Test
    public void sample2() {
        assertEquals(1, new GetMaximumInGeneratedArray().getMaximumGenerated(2));
    }

    @Test
    public void sample3() {
        assertEquals(2, new GetMaximumInGeneratedArray().getMaximumGenerated(3));
    }
}