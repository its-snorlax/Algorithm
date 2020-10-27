package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListCycleIITest {
    @Test
    public void sample1() {
        ListNode head = new ListNode(3);
        ListNode two = new ListNode(2);
        head.next = two;
        ListNode zero = new ListNode(0);
        two.next = zero;
        ListNode minusFour = new ListNode(-4);
        zero.next = minusFour;
        minusFour.next = two;

        assertEquals(two, new LinkedListCycleII().detectCycle(head));
    }

    @Test
    public void sample2() {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        head.next = two;
        two.next = head;
        assertEquals(head, new LinkedListCycleII().detectCycle(head));
    }

    @Test
    public void sample3() {
        ListNode head = new ListNode(1);
        assertNull(new LinkedListCycleII().detectCycle(head));
    }
}