package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCharactersTest {
    @Test
    public void sample1() {
        assertEquals(2, new ConsecutiveCharacters().maxPower("leetcode"));
    }

    @Test
    public void sample2() {
        assertEquals(5, new ConsecutiveCharacters().maxPower("abbcccddddeeeeedcba"));
    }

    @Test
    public void sample3() {
        assertEquals(5, new ConsecutiveCharacters().maxPower("triplepillooooow"));
    }

    @Test
    public void sample4() {
        assertEquals(11, new ConsecutiveCharacters().maxPower("hooraaaaaaaaaaay"));
    }

    @Test
    public void sample5() {
        assertEquals(1, new ConsecutiveCharacters().maxPower("tourist"));
    }
}