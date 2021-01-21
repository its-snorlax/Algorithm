package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindTheMostCompetitiveSubsequenceTest {
    @Test
    public void sample1() {
        assertEquals(Arrays.toString(new int[]{2, 6}),
                Arrays.toString(new FindTheMostCompetitiveSubsequence()
                        .mostCompetitive(new int[]{3, 5, 2, 6}, 2)));
    }

    @Test
    public void sample2() {
        assertEquals(Arrays.toString(new int[]{2, 3, 3, 4}),
                Arrays.toString(new FindTheMostCompetitiveSubsequence()
                        .mostCompetitive(new int[]{2, 4, 3, 3, 5, 4, 9, 6}, 4)));
    }
}