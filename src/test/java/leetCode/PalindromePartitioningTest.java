package leetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PalindromePartitioningTest {
    @Test
    public void sample1() {
        List<List<String>> actualList = new PalindromePartitioning().partition("aab");

        ArrayList<List<String>> expectedList = new ArrayList<>();
        ArrayList<String> indexOne = new ArrayList<>();
        indexOne.add("a");
        indexOne.add("a");
        indexOne.add("b");
        ArrayList<String> indexTwo = new ArrayList<>();
        indexTwo.add("aa");
        indexTwo.add("b");
        expectedList.add(indexOne);
        expectedList.add(indexTwo);

        assertEquals(expectedList, actualList);
    }
    @Test
    public void sample2() {
        List<List<String>> actualList = new PalindromePartitioning().partition("a");

        ArrayList<List<String>> expectedList = new ArrayList<>();
        ArrayList<String> indexOne = new ArrayList<>();
        indexOne.add("a");
        expectedList.add(indexOne);

        assertEquals(expectedList, actualList);
    }
}