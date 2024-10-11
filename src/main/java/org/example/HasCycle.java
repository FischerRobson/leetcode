package org.example;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;

        if(head == null) {
            return false;
        }

        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
