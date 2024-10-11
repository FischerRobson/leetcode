package org.example;

public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode res = mergeTwoLists(list1, list2);
        System.out.println(res);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList = new ListNode();
        ListNode tail = finalList;

        while(list1 != null && list2 != null) {
            System.out.println("list1: " + list1.val);
            System.out.println("list2: " + list2.val);
            System.out.println("----------------------");

            if(list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 != null) {
            tail.next = list1;
            tail = tail.next;
        }

        if(list2 != null) {
            tail.next = list2;
            tail = tail.next;
        }

        return finalList.next;
    }

}
