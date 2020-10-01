package leetCode;

import linkedList.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertBinaryNumberInALinkedListToIntegerTest {
    @Test
    public void SampleTest() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(0);
        head.next = node1;
        LinkedListNode node2 = new LinkedListNode(1);
        node1.next = node2;

        assertEquals(5, new ConvertBinaryNumberInALinkedListToInteger().getDecimalValue(head));
    }

    @Test
    public void SampleTest1() {
        LinkedListNode head = new LinkedListNode(0);
        assertEquals(0, new ConvertBinaryNumberInALinkedListToInteger().getDecimalValue(head));
    }

    @Test
    public void SampleTest2() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(0);
        head.next = node1;
        LinkedListNode node2 = new LinkedListNode(0);
        node1.next = node2;
        node2.next = new LinkedListNode(1);
        assertEquals(9, new ConvertBinaryNumberInALinkedListToInteger().getDecimalValue(head));
    }


}