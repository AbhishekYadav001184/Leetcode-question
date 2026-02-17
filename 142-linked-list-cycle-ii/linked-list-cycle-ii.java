class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {  // cycle found
                
                // Phase 2: Find cycle start
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }

        return null; // no cycle
    }
}
