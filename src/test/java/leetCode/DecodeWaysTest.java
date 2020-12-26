package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeWaysTest {
    @Test
    public void sample1() {
        assertEquals(2, new DecodeWays().numDecodings("12"));
    }

    @Test
    public void sample2() {
        assertEquals(3, new DecodeWays().numDecodings("226"));
    }

    @Test
    public void sample3() {
        assertEquals(0, new DecodeWays().numDecodings("0"));
    }

    @Test
    public void sample4() {
        assertEquals(1, new DecodeWays().numDecodings("1"));
    }

    @Test
    public void sample5() {
        assertEquals(1, new DecodeWays().numDecodings("10"));
    }

    @Test
    public void sample6() {
        assertEquals(1, new DecodeWays().numDecodings("2101"));
    }
}