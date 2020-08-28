package Aarrrmor;

import org.junit.Assert;
import org.junit.Test;

public class Question2Test {
    @Test
    public void returnTrueNumberIsFibbinary() {
        Assert.assertTrue(Question2.isNumberFibbinary(10));
    }

    @Test
    public void returnFalseNumberIsNotFibbinary() {
        Assert.assertFalse(Question2.isNumberFibbinary(11));
    }
}