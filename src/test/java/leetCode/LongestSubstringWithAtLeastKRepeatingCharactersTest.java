package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithAtLeastKRepeatingCharactersTest {
    @Test
    public void sample1() {
        assertEquals(3,
                new LongestSubstringWithAtLeastKRepeatingCharacters()
                        .longestSubstring("aaabb", 3));
    }

    @Test
    public void sample2() {
        assertEquals(5,
                new LongestSubstringWithAtLeastKRepeatingCharacters()
                        .longestSubstring("ababbc", 2));
    }
}