package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Base10IntegerComplementTest {
    @Test
    public void sampleTest1() {
        assertEquals(2, new Base10IntegerComplement().bitwiseComplement(5));
    }

    @Test
    public void sampleTest2() {
        assertEquals(0, new Base10IntegerComplement().bitwiseComplement(7));
    }

    @Test
    public void sampleTest3() {
        assertEquals(5, new Base10IntegerComplement().bitwiseComplement(10));
    }

}