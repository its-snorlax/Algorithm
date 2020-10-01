package linkedList;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MergeLinkedListTest {
    @Test
    public void shouldReturnMergedLinkedListInSortedManner() {
        LinkedListNode head1 = new LinkedListNode(2);
        head1.next = new LinkedListNode(3).next = new LinkedListNode(4).next = new LinkedListNode(5);

        LinkedListNode head2 = new LinkedListNode(1);
        head2.next = new LinkedListNode(3).next = new LinkedListNode(5).next = new LinkedListNode(7);

        assertEquals(head2, MergeLinkedList.mergeListsInSortedManner(head1, head2));
    }
}