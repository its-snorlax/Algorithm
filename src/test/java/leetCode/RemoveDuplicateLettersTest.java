package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateLettersTest {
    @Test
    public void sample1() {
        assertEquals("abc",new RemoveDuplicateLetters().removeDuplicateLetters("bcabc"));
    }

    @Test
    public void sample2() {
        assertEquals("acdb",new RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc"));
    }

}