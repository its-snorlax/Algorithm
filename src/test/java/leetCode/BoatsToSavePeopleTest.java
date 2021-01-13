package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoatsToSavePeopleTest {
    @Test
    public void sample1() {
        int[] input = {1, 2};
        int actualOutput = new BoatsToSavePeople().numRescueBoats(input, 3);

        assertEquals(1, actualOutput);
    }

    @Test
    public void sample2() {
        int[] input = {3, 2, 2, 1};
        int actualOutput = new BoatsToSavePeople().numRescueBoats(input, 3);

        assertEquals(3, actualOutput);
    }

    @Test
    public void sample3() {
        int[] input = {3, 5, 3, 4};
        int actualOutput = new BoatsToSavePeople().numRescueBoats(input, 5);

        assertEquals(4, actualOutput);
    }

    @Test
    public void sample4() {
        int[] input = {3, 8, 7, 1, 4};
        int actualOutput = new BoatsToSavePeople().numRescueBoats(input, 9);

        assertEquals(3, actualOutput);
    }
    @Test
    public void sample5() {
        int[] input = {2,4};
        int actualOutput = new BoatsToSavePeople().numRescueBoats(input, 5);

        assertEquals(2, actualOutput);
    }
}