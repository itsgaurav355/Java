package com.OOP.CustomCollection;

public class LLQuestions {
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode head=null;
        ListNode currNode=head;
        if(head == null && node1.val < node2.val){
            head.val = node1.val;
            head.next=null;
            node1=node1.next;
        }
        if(head == null && node2.val < node1.val){
            head.val = node2.val;
            head.next=null;
            node2=node2.next;
        }
        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
                ListNode node = new ListNode(node1.val);
                currNode.next = node;
                node1 = node1.next;
            }else {
                ListNode node = new ListNode(node2.val);
                currNode.next = node;
                node2 = node2.next;
            }
        }
        while(node1.next != null ){
            ListNode node = new ListNode(node1.val);
            currNode.next = node;
            node1 = node1.next;
        }
        while(node2.next != null ){
            ListNode node = new ListNode(node2.val);
            currNode.next = node;
            node2 = node2.next;
        }
        return head;
    }
    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next !=null){
            fast =fast.next.next;
            slow = slow.next;
            if(fast == slow){
               ListNode temp = slow;
               int length= 0;
              do{
                  temp = temp.next;
                   length++;
               } while(temp.next != fast);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next !=null){
            fast =fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        //find the start
        ListNode f = head;
        ListNode s =head;

        while(length > 0){
            s = s.next;
            length--;
        }

        //keep moving both forward and they will meet at cycle start
        while(f != s){
            f = f.next;
            s = s.next;
        }
    return s;
    }
//Happy Number
        public static boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do{
                slow = findSquare(slow);
                fast = findSquare(findSquare(fast));
            }while( slow != fast);
            if(slow == 1){
                return true;
            }
            return false;
        }
        private static int findSquare(int number){
            int ans = 0;
            while(number > 0){
                int rem = number % 10;
                ans += rem * rem;
                number /= 10;
            }
            return ans;
        }

    //Reverse LL 2
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        //Skip the first left-1 nodes
        ListNode curr =head;
        ListNode prev = null;
        for (int i = 0;curr!= null && i < left-1; i++) {
            prev = curr;
            curr = curr.next;

        }

        ListNode last =prev ;
        ListNode newEnd = curr;
        
        //reverse btn left and right
        ListNode next = curr.next;
        for (int i = 0;curr != null && i < right -left + 1 ; i++) {
            curr.next = prev ;
            prev = curr;
            curr = next ;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null ){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }
    //25. Reverse Nodes in k-Group-> Remain to reverse the remaining element too
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        ListNode curr =head;
        ListNode prev = null;

        while(true){

            ListNode last =prev ;
            ListNode newEnd = curr;

            //reverse btn left and right
            ListNode next = curr.next;
            for (int i = 0;curr != null && i < k ; i++) {
                curr.next = prev ;
                prev = curr;
                curr = next ;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null ){
                last.next = prev;
            }else{
                head = prev;
            }
            prev = newEnd;
            newEnd.next = curr;
            if(curr == null){
                break;
            }

        }
        return head;
    }
    //Reverse an alternate k group
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        ListNode curr =head;
        ListNode prev = null;

        while(curr != null){

            ListNode last =prev ;
            ListNode newEnd = curr;

            //reverse btn left and right
            ListNode next = curr.next;
            for (int i = 0;curr != null && i < k ; i++) {
                curr.next = prev ;
                prev = curr;
                curr = next ;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null ){
                last.next = prev;
            }else{
                head = prev;
            }
            prev = newEnd;
            newEnd.next = curr;

            //skip the k nodes
            for (int i = 0;curr != null && i < k; i++) {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    //Palindromic LL
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while( fast!=null && fast.next != null ){
            fast=fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null ){
            present.next = prev ;
            prev = present;
            present = next ;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond= reverseList(mid);
        ListNode rereverseHead = headSecond;

        //Compare both the halves
        while(head!= null && headSecond !=null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }
    //143. Reorder List
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        //Re- Arrange
        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next =hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        //next Of tail to null
        if(hf != null){
            hf.next =null;
        }
    }
    //61 Rotate the list
    public ListNode rotateRight(ListNode head, int k) {
        if(k<= 0 || head==null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int length =1;
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        curr.next =head;
        int rotation = k%length;
        int skip = length - rotation;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }
    public static void main(String[] args) {
        System.out.println(LLQuestions.isHappy(25));
    }

}
