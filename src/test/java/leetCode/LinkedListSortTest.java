package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListSortTest {
    @Test
    public void sample1() {
        ListNode head = new ListNode(4);
        ListNode next = new ListNode(2);
        head.next = next;
        ListNode next1 = new ListNode(1);
        next.next = next1;
        ListNode next2 = new ListNode(3);
        next1.next = next2;
        assertEquals(next1.val, new LinkedListSort().sortList(head).val);
        assertEquals(next.val, next1.next.val);
        assertEquals(next2.val, next1.next.next.val);
        assertEquals(head.val, next1.next.next.next.val);
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
        ListNode zero = new ListNode(0);
        four.next = zero;
        assertEquals(head.val, new LinkedListSort().sortList(head).val);
        assertEquals(zero.val, head.next.val);
        assertEquals(three.val, head.next.next.val);
        assertEquals(four.val, head.next.next.next.val);
        assertEquals(five.val, head.next.next.next.next.val);
    }

    @Test
    public void sample3() {
        assertNull(new LinkedListSort().sortList(null));
    }
}