// Last updated: 09/07/2026, 11:50:30

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
               
                current.next = current.next.next;
            } else {
              
                current = current.next;
            }
        }
        return head;
    }
}
