package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameIIITest {
    @Test
    public void sample1() {
        assertTrue(new JumpGameIII().canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5));
    }

    @Test
    public void sample2() {
        assertTrue(new JumpGameIII().canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 0));
    }

    @Test
    public void sample3() {
        assertFalse(new JumpGameIII().canReach(new int[]{3, 0, 2, 1, 2}, 2));
    }
}