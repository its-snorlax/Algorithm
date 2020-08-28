package Aarrrmor;

import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    @Test
    public void returnFalseIfStringsDontHaveCommonSubString() {
        Assert.assertFalse(Question1.isSubString("Hi", "All"));
    }

    @Test
    public void returnTrueIfStringsHaveCommonSubString() {
        Assert.assertTrue(Question1.isSubString("Hello", "World"));
    }
}
