package sap;

import org.junit.Assert;
import org.junit.Test;

public class DeletingSubStringTest {
    @Test
    public void shouldReturnMaximumNumberOfSubStringFromBothSideIteration() {
        DeletingSubStrings deletingSubStrings = new DeletingSubStrings();
        int actual = deletingSubStrings.maxMoves("aabcbdc", "abc");
        Assert.assertEquals(1, actual);
        actual = deletingSubStrings.maxMoves("aabb", "ab");
        Assert.assertEquals(2, actual);
    }
}
