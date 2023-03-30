package com.OOP.CustomCollection;

public class LLMergeSort {


    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
        }
    }
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left= sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                tail.next = node1;
                node1 = node1.next;
                tail =tail.next;
            } else {
                tail.next = node2;
                node2 = node2.next;
                tail=tail.next;
            }
        }
        tail.next = (node1 != null) ? node1 : node2;
        return dummyHead.next;
    }
    ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }


}