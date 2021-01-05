package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListIITest {
    @Test
    public void sample1() {
        ListNode listNode = new ListNode(1);
        ListNode two = new ListNode(2);
        listNode.next = two;
        ListNode three = new ListNode(3);
        two.next = three;
        ListNode threeDup = new ListNode(3);
        three.next = threeDup;
        ListNode four = new ListNode(4);
        threeDup.next = four;
        ListNode fourDup = new ListNode(4);
        four.next = fourDup;
        fourDup.next = new ListNode(5);

        ListNode actualOutput =
                new RemoveDuplicatesFromSortedListII().deleteDuplicates(listNode);

        assertEquals(1, actualOutput.val);
        assertEquals(2, actualOutput.next.val);
        assertEquals(5, actualOutput.next.next.val);
    }

    @Test
    public void sample2() {
        ListNode listNode = new ListNode(1);
        ListNode oneDup = new ListNode(1);
        listNode.next = oneDup;
        ListNode oneDupDup = new ListNode(1);
        oneDup.next = oneDupDup;
        ListNode two = new ListNode(2);
        oneDupDup.next = two;
        two.next = new ListNode(3);
        ListNode actualOutput =
                new RemoveDuplicatesFromSortedListII().deleteDuplicates(listNode);

        assertEquals(2, actualOutput.val);
        assertEquals(3, actualOutput.next.val);
    }
}