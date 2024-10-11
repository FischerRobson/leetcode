package org.example;

import org.w3c.dom.NodeList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode res = reverseList(listNode);
        System.out.println(res);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        ListNode left = null;
        ListNode right = null;
        ListNode cur = head;

        while (cur != null) {
            right = cur.next;
            cur.next = left;
            left = cur;
            cur = right;
        }
        head = left;
        return head;
    }
}
