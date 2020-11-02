package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    @Test
    public void sample1() {
        ListNode l1 = new ListNode(2);
        ListNode two = new ListNode(4);
        l1.next = two;
        two.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        ListNode six = new ListNode(6);
        l2.next = six;
        six.next = new ListNode(4);

        ListNode actualOutput = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertEquals(7, actualOutput.val);
        assertEquals(0, actualOutput.next.val);
        assertEquals(8, actualOutput.next.next.val);
        assertNull(actualOutput.next.next.next);
    }
}