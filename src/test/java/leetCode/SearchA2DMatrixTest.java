package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchA2DMatrixTest {
    @Test
    public void sample1() {
        assertFalse(new SearchA2DMatrix().searchMatrix(new int[][]{}, 0));
    }

    @Test
    public void sample2() {
        assertFalse((new SearchA2DMatrix().
                searchMatrix(
                        new int[][]{{
                                1, 3, 5, 7},
                                {10, 11, 16, 20},
                                {23, 30, 34, 60}}, 13)));
    }

    @Test
    public void sample3() {
        assertTrue((new SearchA2DMatrix().
                searchMatrix(
                        new int[][]{{
                                1, 3, 5, 7},
                                {10, 11, 16, 20},
                                {23, 30, 34, 60}}, 3)));
    }

    @Test
    public void sample4() {
        assertTrue((new SearchA2DMatrix().
                searchMatrix(
                        new int[][]{{
                                1, 3, 5}}, 1)));
    }
}