package linkedList;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static linkedList.MergeLinkedList.LNode;

public class MergeLinkedListTest {
    @Test
    public void shouldReturnMergedLinkedListInSortedManner() {
        LNode head1 = new LNode(2);
        head1.next = new LNode(3).next = new LNode(4).next = new LNode(5);

        LNode head2 = new LNode(1);
        head2.next = new LNode(3).next = new LNode(5).next = new LNode(7);

        assertEquals(head2, MergeLinkedList.mergeListsInSortedManner(head1, head2));
    }
}