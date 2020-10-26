package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChampagneTowerTest {
    @Test
    public void sample1() {
        double actual = new ChampagneTower().champagneTower(1, 1, 1);
        assertEquals(0, actual, 0);
    }

    @Test
    public void sample2() {
        double actual = new ChampagneTower().champagneTower(2, 1, 1);
        assertEquals(0.50000, actual, 0);
    }

    @Test
    public void sample3() {
        double actual = new ChampagneTower().champagneTower(100000009, 33, 17);
        assertEquals(1.00000, actual, 0);
    }

    @Test
    public void sample4() {
        double actual = new ChampagneTower().champagneTower(25, 6, 1);
        assertEquals(0.18750, actual, 0);
    }
}