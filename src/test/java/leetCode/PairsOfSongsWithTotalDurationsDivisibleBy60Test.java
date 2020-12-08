package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    @Test
    public void sample1() {
        int[] input = {30, 20, 150, 100, 40};
        assertEquals(3,
                new PairsOfSongsWithTotalDurationsDivisibleBy60()
                        .numPairsDivisibleBy60(input));
    }

    @Test
    public void sample2() {
        int[] input = {60, 60, 60};
        assertEquals(3,
                new PairsOfSongsWithTotalDurationsDivisibleBy60()
                        .numPairsDivisibleBy60(input));
    }
}