package algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackProblemTest {
    @Test
    public void sample1() {
        int[] weight = {1, 3, 4, 5};
        int[] price = {1, 4, 5, 7};

        assertEquals(9, new KnapsackProblem().findMaxPrice(weight, price, 7));
    }

    @Test
    public void sample2() {
        int[] price = {10, 20, 30};
        int[] weight = {1, 1, 1};
        assertEquals(50, new KnapsackProblem().findMaxPrice(weight, price, 2));
    }

    @Test
    public void sample3() {
        int[] price = {60, 100, 120};
        int[] weight = {10, 20, 30};
        assertEquals(220, new KnapsackProblem().findMaxPrice(weight, price, 50));
    }
}