package codeboard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountInversionTest {

    @Test
    public final void testPrintHelloWorld() {
        int[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(45, new CountInversion().getInvCount(input));
    }

    @Test
    public final void testPrintHelloWorld2() {
        int[] input = {1, 1, 1};
        assertEquals(0, new CountInversion().getInvCount(input));

    }

    @Test
    public final void testPrintHelloWorld3() {
        int[] input = {6, 2, 3, 4, 3};
        assertEquals(5, new CountInversion().getInvCount(input));

    }
}