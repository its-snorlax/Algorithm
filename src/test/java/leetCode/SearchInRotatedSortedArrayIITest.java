package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayIITest {
    @Test
    public void sample1() {
        assertTrue(new SearchInRotatedSortedArrayII().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
    }

    @Test
    public void sample2() {
        assertFalse(new SearchInRotatedSortedArrayII().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }

    @Test
    public void sample3() {
        assertFalse(new SearchInRotatedSortedArrayII().search(new int[]{1, 3}, 0));
    }

    @Test
    public void sample4() {
        assertTrue(new SearchInRotatedSortedArrayII().search(new int[]{1, 1}, 1));
    }

    @Test
    public void sample5() {
        assertTrue(new SearchInRotatedSortedArrayII().search(new int[]{2, 2, 2, 0, 1}, 0));
    }
}