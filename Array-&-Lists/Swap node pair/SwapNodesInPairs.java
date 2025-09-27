class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // swapping
            first.next = second.next;
            second.next = first;
            current.next = second;

            // move to the next pair
            current = first;
        }

        return dummy.next;
    }

    // helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: [1,2,3,4]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        System.out.print("Original: ");
        printList(head);

        ListNode result = swapPairs(head);

        System.out.print("Swapped:  ");
        printList(result);
    }
}
