package leetCode;

import linkedList.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        while (head != null) {
            decimal = decimal * 2;
            decimal += head.val;
            head = head.next;
        }
        return decimal;
    }
}