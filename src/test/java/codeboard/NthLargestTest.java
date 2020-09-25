package codeboard;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthLargestTest {

    @Test
    public final void testNthLargestItem1() {
        int[] input = {1, 2, 3, 4};
        assertEquals(3, NthLargest.findNthLargest(input, 2));
    }

    @Test
    public final void testNthLargestItem2() {
        int[] input = {6, 2, 4};
        assertEquals(4, NthLargest.findNthLargest(input, 2));
    }

    @Test
    public final void testNthLargestItem13() {
        int[] input = {1, 2, 3, 4, 3};
        assertEquals(3, NthLargest.findNthLargest(input, 2));
    }

}