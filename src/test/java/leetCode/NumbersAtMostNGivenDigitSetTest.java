package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersAtMostNGivenDigitSetTest {
    @Test
    public void sample1() {
        int actualOutput = new UniqueMorseCodeWords()
                .uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        assertEquals(2, actualOutput);
    }
}