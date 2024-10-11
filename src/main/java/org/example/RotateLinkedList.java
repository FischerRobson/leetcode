package org.example;

public class RotateLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode res = rotateRight(listNode, 1);
        while (res != null) {
            System.out.print(res.val + " -> ");
            res = res.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        int size = 0;

        ListNode temp = head;

        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        size++;

        int rotations = size - (k % size);

        temp.next = head;

        while (rotations > 0) {
            temp = temp.next;
            rotations--;
        }

        head = temp.next;
        temp.next = null;
        return head;
    }
}
