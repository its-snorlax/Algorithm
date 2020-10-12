package leetCode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BuddyStringsTest {

    @Test
    public void sample1() {
        assertTrue(new BuddyStrings().buddyStrings("ab", "ba"));
    }

    @Test
    public void sample2() {
        assertFalse(new BuddyStrings().buddyStrings("ab", "ab"));
    }

    @Test
    public void sample3() {
        assertTrue(new BuddyStrings().buddyStrings("aa", "aa"));
    }

    @Test
    public void sample4() {
        assertTrue(new BuddyStrings().buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }

    @Test
    public void sample5() {
        assertFalse(new BuddyStrings().buddyStrings("", "aa"));
    }

    @Test
    public void sample6() {
        assertFalse(new BuddyStrings().buddyStrings("abac", "abad"));
    }
}