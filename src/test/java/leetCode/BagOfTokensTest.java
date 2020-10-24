package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BagOfTokensTest {
    @Test
    public void sample1() {
        int[] tokens = {100};
        assertEquals(0, new BagOfTokens().bagOfTokensScore(tokens, 50));
    }

    @Test
    public void sample2() {
        int[] tokens = {100, 200};
        assertEquals(1, new BagOfTokens().bagOfTokensScore(tokens, 150));
    }

    @Test
    public void sample3() {
        int[] tokens = {100, 200, 300, 400};
        assertEquals(2, new BagOfTokens().bagOfTokensScore(tokens, 200));
    }
}