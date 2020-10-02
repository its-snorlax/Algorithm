package leetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumTest {
    @Test
    public void sampleTestOne() {
        CombinationSum combinationSum = new CombinationSum();

        List<List<Integer>> actualOutput = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);

        ArrayList<List<Integer>> expectedOutput = new ArrayList<>();
        ArrayList<Integer> items = new ArrayList<>();
        items.add(2);
        items.add(2);
        items.add(3);
        ArrayList<Integer> items1 = new ArrayList<>();
        items1.add(7);
        expectedOutput.add(items);
        expectedOutput.add(items1);

        assertEquals(expectedOutput, actualOutput);
    }
}