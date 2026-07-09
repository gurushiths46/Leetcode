// Last updated: 09/07/2026, 11:50:09
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}