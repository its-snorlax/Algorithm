package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortListTest {
    @Test
    public void sample1() {
        ListNode head = new ListNode(4);
        ListNode two = new ListNode(2);
        head.next = two;
        ListNode one = new ListNode(1);
        two.next = one;
        one.next = new ListNode(3);

        ListNode actualOutput = new InsertionSortList().insertionSortList(head);

        assertEquals(1, actualOutput.val);
        assertEquals(2, actualOutput.next.val);
        assertEquals(3, actualOutput.next.next.val);
        assertEquals(4, actualOutput.next.next.next.val);
    }

    @Test
    public void sample2() {
        ListNode head = new ListNode(-1);
        ListNode five = new ListNode(5);
        head.next = five;
        ListNode three = new ListNode(3);
        five.next = three;
        ListNode four = new ListNode(4);
        three.next = four;
        four.next = new ListNode(0);

        ListNode actualOutput = new InsertionSortList().insertionSortList(head);

        assertEquals(-1, actualOutput.val);
        assertEquals(0, actualOutput.next.val);
        assertEquals(3, actualOutput.next.next.val);
        assertEquals(4, actualOutput.next.next.next.val);
        assertEquals(5, actualOutput.next.next.next.next.val);
    }

}