package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoneGameIVTest {
    @Test
    public void sample1() {
        assertTrue(new StoneGameIV().winnerSquareGame(1));
    }

    @Test
    public void sample2() {
        assertTrue(new StoneGameIV().winnerSquareGame(4));
    }

    @Test
    public void sample3() {
        assertFalse(new StoneGameIV().winnerSquareGame(2));
    }

    @Test
    public void sample4() {
        assertFalse(new StoneGameIV().winnerSquareGame(7));
    }

    @Test
    public void sample5() {
        assertFalse(new StoneGameIV().winnerSquareGame(17));
    }

    @Test
    public void sample6() {
        assertTrue(new StoneGameIV().winnerSquareGame(8));
    }
}