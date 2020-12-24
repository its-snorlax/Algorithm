package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {
    @Test
    public void sample1() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;
        ListNode three = new ListNode(3);
        two.next = three;
        three.next = new ListNode(4);

        ListNode actualOutput = new SwapNodesInPairs().swapPairs(one);

        assertEquals(2, actualOutput.val);
        assertEquals(1, actualOutput.next.val);
        assertEquals(4, actualOutput.next.next.val);
            assertEquals(3, actualOutput.next.next.next.val);
    }
}