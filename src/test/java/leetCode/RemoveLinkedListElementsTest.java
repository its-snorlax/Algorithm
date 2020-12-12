package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveLinkedListElementsTest {
    @Test
    public void sample1() {
        ListNode root = new ListNode(1);
        ListNode two = new ListNode(2);
        root.next = two;
        ListNode six = new ListNode(6);
        two.next = six;
        ListNode three = new ListNode(3);
        six.next = three;
        ListNode four = new ListNode(4);
        three.next = four;
        ListNode five = new ListNode(5);
        four.next = five;
        five.next = new ListNode(6);

        ListNode actualOutput = new RemoveLinkedListElements().removeElements(root, 6);

        assertEquals(1, actualOutput.val);
        assertEquals(2, actualOutput.next.val);
        assertEquals(3, actualOutput.next.next.val);
        assertEquals(4, actualOutput.next.next.next.val);
        assertEquals(5, actualOutput.next.next.next.next.val);
    }

    @Test
    public void sample2() {
        ListNode root = new ListNode(1);

        assertNull(new RemoveLinkedListElements().removeElements(root, 1));
    }

    @Test
    public void sample3() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(1);
        assertNull(new RemoveLinkedListElements().removeElements(root, 1));
    }
}