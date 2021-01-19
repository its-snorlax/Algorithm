package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    @Test
    public void sample2() {
        assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
    }

    @Test
    public void sample3() {
        assertEquals("a", new LongestPalindromicSubstring().longestPalindrome("a"));
    }
}