package leetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class SummaryRangesTest {
    @Test
    public void sample1() {
        int[] input = {0, 1, 2, 4, 5, 7};
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("0->2");
        expectedOutput.add("4->5");
        expectedOutput.add("7");

        assertEquals(expectedOutput, new SummaryRanges().summaryRanges(input));
    }

    @Test
    public void sample2() {
        int[] input = {0, 2, 3, 4, 6, 8, 9};
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("0");
        expectedOutput.add("2->4");
        expectedOutput.add("6");
        expectedOutput.add("8->9");
        assertEquals(expectedOutput, new SummaryRanges().summaryRanges(input));
    }

    @Test
    public void sample3() {
        int[] input = {};
        assertEquals(Collections.emptyList(), new SummaryRanges().summaryRanges(input));
    }

    @Test
    public void sample4() {
        int[] input = {-1};
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("-1");
        assertEquals(expectedOutput, new SummaryRanges().summaryRanges(input));
    }

    @Test
    public void sample5() {
        int[] input = {0};
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("0");
        assertEquals(expectedOutput, new SummaryRanges().summaryRanges(input));
    }
}