package Aarrrmor;

import org.junit.Assert;
import org.junit.Test;

public class Question3Test {
    @Test
    public void findModulo() {
        Assert.assertEquals(1, Question3.findModulo(1, 100000));
        Assert.assertEquals(5, Question3.findModulo(2, 100000));
        Assert.assertEquals(32, Question3.findModulo(3, 100000));
        Assert.assertEquals(288, Question3.findModulo(4, 100000));
        Assert.assertEquals(3413, Question3.findModulo(5, 100000));
        Assert.assertEquals(50069, Question3.findModulo(6, 100000));
    }
}