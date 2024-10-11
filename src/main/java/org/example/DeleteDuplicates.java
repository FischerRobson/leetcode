package org.example;

public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(2)));
        ListNode listNode3 = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode res = deleteDuplicates(listNode2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if(cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}
