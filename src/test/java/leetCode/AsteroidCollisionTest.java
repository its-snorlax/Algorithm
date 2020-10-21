package leetCode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AsteroidCollisionTest {
    @Test
    public void sample1() {
        int[] input = {5, 10, -5};
        int[] output = {5, 10};
        assertEquals(Arrays.toString(output),
                Arrays.toString(new AsteroidCollision().asteroidCollision(input)));
    }

    @Test
    public void sample2() {
        int[] input = {8, -8};
        int[] output = {};
        assertEquals(Arrays.toString(output),
                Arrays.toString(new AsteroidCollision().asteroidCollision(input)));
    }

    @Test
    public void sample3() {
        int[] input = {10, 2, -5};
        int[] output = {10};
        assertEquals(Arrays.toString(output),
                Arrays.toString(new AsteroidCollision().asteroidCollision(input)));
    }

    @Test
    public void sample4() {
        int[] input = {-2, -1, 1, 2};
        int[] output = {-2, -1, 1, 2};
        assertEquals(Arrays.toString(output),
                Arrays.toString(new AsteroidCollision().asteroidCollision(input)));
    }
}