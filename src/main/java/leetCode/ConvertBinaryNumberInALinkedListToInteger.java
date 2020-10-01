package leetCode;

import linkedList.LinkedListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(LinkedListNode head) {
        int decimal = 0;
        while (head != null) {
            decimal = decimal * 2;
            decimal += head.data;
            head = head.next;
        }
        return decimal;
    }
}