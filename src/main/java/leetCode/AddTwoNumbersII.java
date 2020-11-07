package leetCode;

import linkedList.ListNode;

import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new java.util.Stack<>();
        Stack<Integer> stack2 = new java.util.Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            Integer num1 = 0;
            if (!stack1.isEmpty()) {
                num1 = stack1.pop();
            }
            Integer num2 = 0;
            if (!stack2.isEmpty()) {
                num2 = stack2.pop();
            }
            int sum = num1 + num2 + carry;
            carry = 0;
            if (sum >= 10) {
                sum = sum - 10;
                carry = 1;
            }
            if (tail == null) {
                tail = new ListNode(sum);
                head = tail;
            } else {
                ListNode newNode = new ListNode(sum);
                newNode.next = head;
                head = newNode;
            }
        }
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}
