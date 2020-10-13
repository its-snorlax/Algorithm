package linkedList;

public class MergeLinkedList {

    public static ListNode mergeListsInSortedManner(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.val < head2.val) {
            head1.next = mergeListsInSortedManner(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeListsInSortedManner(head1,head2.next);
            return head2;
        }
    }
}
