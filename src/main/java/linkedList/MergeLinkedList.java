package linkedList;

public class MergeLinkedList {

    public static LNode mergeListsInSortedManner(LNode head1, LNode head2) {
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

    public static void main(String[] args) {
        LNode head1 = new LNode(1);
        LNode lNode = new LNode(2);
        head1.next = lNode;
        LNode lNode1 = new LNode(3);
        lNode.next = lNode1;
        LNode lNode2 = new LNode(4);
        lNode1.next = lNode2;


        LNode head2 = new LNode(1);
        LNode lNode3 = new LNode(3);
        head2.next = lNode3;
        LNode lNode4 = new LNode(5);
        lNode3.next = lNode4;
        LNode lNode5 = new LNode(7);
        lNode4.next = lNode5;
        LNode lNode6 = mergeListsInSortedManner(head1, head2);
        System.out.println(lNode);
    }

    public static class LNode {
        int data;
        LNode next;

        public LNode() {
            this.next = null;
        }

        public LNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
