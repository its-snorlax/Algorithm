package leetCode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RepeatedDNASequencesTest {
    @Test
    public void sample1() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("AAAAACCCCC");
        expected.add("CCCCCAAAAA");
        assertEquals(expected, new RepeatedDNASequences().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    @Test
    public void sample2() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("AAAAAAAAAA");
        assertEquals(expected, new RepeatedDNASequences().findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }
}