package com.gaurav;

public class LinkedList1 {
    Node head;
    private int size;

    LinkedList1(){
       this.size=0;
    }
        class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;
                size++;
            }
        }
            //-add -first,last
            public void addFirst(String data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head=newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }
            public void addLast(String data){
                Node newNode = new Node(data);
                if (head == null) {
                    head=newNode;
                    return;
                }
                Node currNode=head;
                while(currNode.next !=null){
                    currNode =currNode.next;
                }
                currNode.next=newNode;
            }
            //print
    public void printList(){
            if(head ==null ) {
                System.out.println("List is empty ");
                return;
            }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data+ " -> ");
            currNode =currNode.next;
        }
        System.out.println("Null");
    }
    //delete First
    public void deleteFirst(){
            if(head ==null){
                System.out.println("The List is Empty");
                return;
            }
            head =head.next;
            size--;
    }
    public void deleteMiddle(String n){
        Node temp=new Node(n);
        Node lastNode=head;
        Node currNode=head.next;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(lastNode.data== temp.data){
            head=head.next;
            System.out.println("Deleted element: "+lastNode.data);
            return;
        }
        while(currNode.next !=null){
          if(currNode.data== temp.data){
              System.out.println("Deleting element : "+currNode.data);
              size--;
              lastNode.next=currNode.next;
              return;
          }else {
              lastNode=lastNode.next;
              currNode=currNode.next;
          }
        }
        System.out.println("element not found");

    }

   //reverse linkedList Iterative Approach
    public void reverseIterator(){
        if(head==null || head.next==null){
            return;
        }
        Node previous=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next =previous;

            //update
            previous=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=previous;
    }
//reverse using Recursion
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead =reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedList1 list=new LinkedList1();
      list.addLast("Gaurav");
      list.addLast("is");
      list.addLast("a");
      list.addLast("Good");
      list.addLast("Boy");

      list.head= list.reverseRecursive(list.head);
      list.printList();

    }
}
//
//Shortcut
/*
class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<String>();

        list.add("is");
        list.addLast("a");
        list.addLast("List");
        list.addFirst("this");
        System.out.println(list);
        System.out.println(list.size());
    }
}
*/
