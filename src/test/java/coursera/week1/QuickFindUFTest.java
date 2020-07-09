package coursera.week1;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickFindUFTest {

    @Test
    public void shouldReturnTrueIfObjectAreConnected() {
        QuickFindUF quickFindUFTest = new QuickFindUF(10);
        quickFindUFTest.union(4, 3);
        quickFindUFTest.union(3, 8);
        quickFindUFTest.union(6, 5);
        quickFindUFTest.union(9, 4);
        quickFindUFTest.union(2, 1);
        quickFindUFTest.union(8, 9);
        quickFindUFTest.union(6, 7);
        assertTrue(quickFindUFTest.connected(8, 4));
        assertTrue(quickFindUFTest.connected(7, 5));
    }
}