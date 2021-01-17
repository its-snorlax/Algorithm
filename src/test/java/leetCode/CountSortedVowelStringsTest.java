package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountSortedVowelStringsTest {
    @Test
    public void sample1() {
        assertEquals(5, new CountSortedVowelStrings().countVowelStrings(1));
    }

    @Test
    public void sample2() {
        assertEquals(15, new CountSortedVowelStrings().countVowelStrings(2));
    }

    @Test
    public void sample3() {
        assertEquals(66045, new CountSortedVowelStrings().countVowelStrings(33));
    }
}