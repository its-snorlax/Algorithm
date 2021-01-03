package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeautifulArrangementTest {
    @Test
    public void sample1() {
        assertEquals(2, new BeautifulArrangement().countArrangement(2));
    }

    @Test
    public void sample2() {
        assertEquals(1, new BeautifulArrangement().countArrangement(1));
    }
}