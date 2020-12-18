package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondLargestTest {
    @Test
    public void sample1() {
        int[] input = {3, 9, 0, 9};
        assertEquals(3, new SecondLargest().secondLargest(input));
    }
}