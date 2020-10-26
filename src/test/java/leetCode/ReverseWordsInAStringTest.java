package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringTest {
    @Test
    public void sample1() {
        String actual = new ReverseWordsInAString().reverseWords("the sky is blue");
        assertEquals("blue is sky the", actual);
    }

    @Test
    public void sample2() {
        String actual = new ReverseWordsInAString().reverseWords("  hello world  ");
        assertEquals("world hello", actual);
    }

    @Test
    public void sample3() {
        String actual = new ReverseWordsInAString().reverseWords("a good   example");
        assertEquals("example good a", actual);
    }

    @Test
    public void sample4() {
        String actual = new ReverseWordsInAString().reverseWords("  Bob    Loves  Alice   ");
        assertEquals("Alice Loves Bob", actual);
    }

    @Test
    public void sample5() {
        String actual = new ReverseWordsInAString().reverseWords("Alice does not even like bob");
        assertEquals("bob like even not does Alice", actual);
    }
}