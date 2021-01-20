package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void sample1() {
        assertTrue(new ValidParentheses().isValid("()"));
    }

    @Test
    public void sample2() {
        assertTrue(new ValidParentheses().isValid("()[]{}"));
    }

    @Test
    public void sample3() {
        assertFalse(new ValidParentheses().isValid("(]"));
    }

    @Test
    public void sample4() {
        assertFalse(new ValidParentheses().isValid("([)]"));
    }
    @Test
    public void sample5() {
        assertTrue(new ValidParentheses().isValid("{[]}"));
    }

    @Test
    public void sample6() {
        assertFalse(new ValidParentheses().isValid("(])"));
    }
}