package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
    @Test
    public void sample1() {
        MinimumDeletionsToMakeCharacterFrequenciesUnique minimumDeletionsToMakeCharacterFrequenciesUnique = new MinimumDeletionsToMakeCharacterFrequenciesUnique();
        int i = minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("bbcebab");
        assertEquals(2, i);
    }

    @Test
    public void sample2() {
        MinimumDeletionsToMakeCharacterFrequenciesUnique minimumDeletionsToMakeCharacterFrequenciesUnique
                = new MinimumDeletionsToMakeCharacterFrequenciesUnique();
        int i = minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("aab");
        assertEquals(0, i);
    }

    @Test
    public void sample3() {
        MinimumDeletionsToMakeCharacterFrequenciesUnique minimumDeletionsToMakeCharacterFrequenciesUnique
                = new MinimumDeletionsToMakeCharacterFrequenciesUnique();
        int i = minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("aaabbbcc");
        assertEquals(2, i);
    }

    @Test
    public void sample4() {
        MinimumDeletionsToMakeCharacterFrequenciesUnique minimumDeletionsToMakeCharacterFrequenciesUnique
                = new MinimumDeletionsToMakeCharacterFrequenciesUnique();
        int i = minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("ceabaacb");
        assertEquals(2, i);
    }




}