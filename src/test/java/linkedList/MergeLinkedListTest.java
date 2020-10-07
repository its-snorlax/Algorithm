package linkedList;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MergeLinkedListTest {
    @Test
    public void shouldReturnMergedLinkedListInSortedManner() {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(3).next = new ListNode(4).next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3).next = new ListNode(5).next = new ListNode(7);

        assertEquals(head2, MergeLinkedList.mergeListsInSortedManner(head1, head2));
    }
}