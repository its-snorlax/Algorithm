package leetCode;

import linkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersIITest {
    @Test
    public void sample1() {
        ListNode l1 = new ListNode(7);
        ListNode two = new ListNode(2);
        l1.next = two;
        ListNode four = new ListNode(4);
        two.next = four;
        four.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        ListNode six = new ListNode(6);
        l2.next = six;
        six.next = new ListNode(4);

        ListNode actualOutput = new AddTwoNumbersII().addTwoNumbers(l1, l2);
        assertEquals(7, actualOutput.val);
        assertEquals(8, actualOutput.next.val);
        assertEquals(0, actualOutput.next.next.val);
        assertEquals(7, actualOutput.next.next.next.val);
    }

    @Test
    public void sample2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode actualOutput = new AddTwoNumbersII().addTwoNumbers(l1, l2);
        assertEquals(0, actualOutput.val);
    }

    @Test
    public void sample3() {
        ListNode l1 = new ListNode(3);
        ListNode nine1 = new ListNode(9);
        l1.next = nine1;
        ListNode nine2 = new ListNode(9);
        nine1.next = nine2;
        ListNode nine3 = new ListNode(9);
        nine2.next = nine3;
        ListNode nine4 = new ListNode(9);
        nine3.next = nine4;
        ListNode nine5 = new ListNode(9);
        nine4.next = nine5;
        ListNode nine6 = new ListNode(9);
        nine5.next = nine6;
        ListNode nine7 = new ListNode(9);
        nine6.next = nine7;
        ListNode nine8 = new ListNode(9);
        nine7.next = nine8;
        nine8.next = new ListNode(9);

        ListNode l2 = new ListNode(7);

        ListNode actualOutput = new AddTwoNumbersII().addTwoNumbers(l1, l2);
        assertEquals(4, actualOutput.val);
    }
}