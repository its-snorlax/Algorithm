package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestIntegerDivisibleByKTest {
    @Test
    public void sample1() {
        assertEquals(1, new SmallestIntegerDivisibleByK().smallestRepunitDivByK(1));
    }
    @Test
    public void sample2() {
        assertEquals(-1, new SmallestIntegerDivisibleByK().smallestRepunitDivByK(2));
    }
    @Test
    public void sample4() {
        assertEquals(6, new SmallestIntegerDivisibleByK().smallestRepunitDivByK(7));
    }
    @Test
    public void sample3() {
        assertEquals(3, new SmallestIntegerDivisibleByK().smallestRepunitDivByK(3));
    }
    @Test
    public void sample5() {
        assertEquals(-1, new SmallestIntegerDivisibleByK().smallestRepunitDivByK(5));
    }
}