package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanPlaceFlowerTest {
    @Test
    public void sample1() {
        int[] flowerBed = {1, 0, 0, 0, 1};
        assertTrue(new CanPlaceFlower().canPlaceFlowers(flowerBed, 1));
    }

    @Test
    public void sample2() {
        int[] flowerBed = {1, 0, 0, 0, 1};
        assertFalse(new CanPlaceFlower().canPlaceFlowers(flowerBed, 2));
    }

    @Test
    public void sample3() {
        int[] flowerBed = {1, 0, 0, 0, 0, 1};
        assertFalse(new CanPlaceFlower().canPlaceFlowers(flowerBed, 2));
    }

    @Test
    public void sample4() {
        int[] flowerBed = {0, 1, 0};
        assertFalse(new CanPlaceFlower().canPlaceFlowers(flowerBed, 1));
    }

    @Test
    public void sample5() {
        int[] flowerBed = {0};
        assertTrue(new CanPlaceFlower().canPlaceFlowers(flowerBed, 1));
    }

    @Test
    public void sample6() {
        int[] flowerBed = {0, 0, 1, 0};
        assertTrue(new CanPlaceFlower().canPlaceFlowers(flowerBed, 1));
    }
}