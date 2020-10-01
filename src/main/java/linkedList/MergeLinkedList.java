package linkedList;

public class MergeLinkedList {

    public static LinkedListNode mergeListsInSortedManner(LinkedListNode head1, LinkedListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.data < head2.data) {
            head1.next = mergeListsInSortedManner(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeListsInSortedManner(head1,head2.next);
            return head2;
        }
    }
}
