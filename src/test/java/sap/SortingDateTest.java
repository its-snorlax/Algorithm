package sap;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortingDateTest {
    @Test
    public void shouldReturnSortedDate() {
        SortingDates sortingDates = new SortingDates();
        ArrayList<String> dates = new ArrayList<>();
        dates.add("23 Feb 2000");
        dates.add("22 Feb 2000");
        List<String> actual = sortingDates.sortDates(dates);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("22 Feb 2000");
        expected.add("23 Feb 2000");
        Assert.assertEquals(expected, actual);
    }
}
