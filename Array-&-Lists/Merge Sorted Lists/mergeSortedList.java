class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class mergeSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // temporary head
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes (if any)
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next; // skip the dummy head
    }

    // Helper to build linked list from array
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list1 = buildList(new int[]{1,2,4});
        ListNode list2 = buildList(new int[]{1,3,4});

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}
