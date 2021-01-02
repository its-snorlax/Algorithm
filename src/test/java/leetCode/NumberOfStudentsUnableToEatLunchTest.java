package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfStudentsUnableToEatLunchTest {
    @Test
    public void sample1() {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};

        assertEquals(0, new NumberOfStudentsUnableToEatLunch().countStudents(students, sandwiches));
    }
    @Test
    public void sample2() {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};

        assertEquals(3, new NumberOfStudentsUnableToEatLunch().countStudents(students, sandwiches));
    }
}