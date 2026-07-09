// Last updated: 09/07/2026, 11:50:32
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0, head); // dummy before head
        ListNode prev = dummy;  // prev points to last node before duplicates
        ListNode curr = head;

        while (curr != null) {
            // move while there are duplicates
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            if (prev.next == curr) {
                // no duplicates detected, move prev
                prev = prev.next;
            } else {
                // duplicates detected, skip them
                prev.next = curr.next;
            }
            curr = curr.next; // move forward
        }

        return dummy.next;
    }
}
