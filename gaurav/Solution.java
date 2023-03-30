package com.gaurav;

import java.util.Arrays;

// Q1 Remove Nth Node From End of List
public class Solution {
    /*  class Solution {
       public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next==null){
                return null;
            }
            int size=0;
            ListNode curr=head;
            while(curr!=null){
                curr=curr.next;
                size++;
            }
            if(n==size){
                return head.next;
            }
            int indexToSearch =size-n;
            ListNode prev=head;
            int i=1;
            while(i<indexToSearch){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return head;
        }
    }
//Q2 Palindrome Linked List
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode hare=head;
        ListNode turtle =head;
        while(hare.next !=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle =turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode middle= findMiddle(head); //1st half ka end
        ListNode secondHalfStart= reverse(middle.next);

        ListNode firstHalfStart =head;
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                 return false;
            }
               firstHalfStart =firstHalfStart.next;
               secondHalfStart = secondHalfStart.next;

        }
        return true;
    }
}
//Q3 141. Linked List Cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
       ListNode hare = head;
        ListNode turtle=head;
        while( hare!=null  && hare.next != null ){
            hare=hare.next.next;
            turtle =turtle.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;
    }
}
//72. Subtree of Another Tree
class Solution {
    public boolean isIdentical(TreeNode root,TreeNode subRoot){
       if(root==null && subRoot==null){
           return true;
       }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.val==subRoot.val){
            return  isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
       */
/*
    public static int removeDuplicates(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                int j=0;
                while(j<nums.length-i-1){
                    nums[i]=nums[i+1];
                    j++;
                }

            }
        }
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int a[]={ 1,1,2};
        System.out.println(removeDuplicates(a));
    }
}

 */
    //class Solution {
  /*   static int sum=0,rem;
        public static int reverse(int x) {

            if(x>0){
                rem=x%10;
                sum=sum*10+rem;
                reverse(x/10);

            }else if(x<0){
                rem=x%10;
                sum=sum*10+rem;
                reverse(x/10);
            }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println( reverse(-1723));
    }

   */
   static class MedianFinder {
       static  int arr[]=new int[10];
       static  int i=0;

        public static void addNum(int num) {
            arr[i]=num;
            i++;
        }

        public double findMedian() {
            double sum=0;
            int size=0;
            for(int j=0;j<i;j++){
                sum=sum+arr[j];

            }
            double r= sum/(i);
            return r;

        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        System.out.println(medianFinder.findMedian());; // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        System.out.println(medianFinder.findMedian());; // return 2

    }

}
