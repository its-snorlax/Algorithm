package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertBinaryNumberInALinkedListToIntegerTest {
    @Test
    public void SampleTest() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(0);
        head.next = node1;
        ListNode node2 = new ListNode(1);
        node1.next = node2;

        assertEquals(5, new ConvertBinaryNumberInALinkedListToInteger().getDecimalValue(head));
    }

    @Test
    public void SampleTest1() {
        ListNode head = new ListNode(0);
        assertEquals(0, new ConvertBinaryNumberInALinkedListToInteger().getDecimalValue(head));
    }

    @Test
    public void SampleTest2() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(0);
        head.next = node1;
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        node2.next = new ListNode(1);
        assertEquals(9, new ConvertBinaryNumberInALinkedListToInteger().getDecimalValue(head));
    }


}