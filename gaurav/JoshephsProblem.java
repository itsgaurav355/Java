package com.gaurav;

public class JoshephsProblem {
 /*  public static Node head;
   public static int size=0;
   JoshephsProblem(){
       head=null;
   }
    class Node{
        private String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public static void skip(int n){
        Node lastNode=head;
        Node currNode=head.next;
        Node nextNode=currNode.next;
        for(int i=0;i>=0;i++){
           if(size!=1 && i%n==0){
               System.out.println(currNode.data +" is killed");
               lastNode.next=currNode.next;
               currNode=lastNode.next;
           }else if(size==1){
               if(currNode.data!=null){
                   System.out.println(currNode.data + " is Winner");
                   break;
               }

           }else{
               lastNode=lastNode.next;
               currNode=currNode.next;
               nextNode=nextNode.next;
           }
        }

    }
    public void addFirst(String data) {
       Node newNode = new Node(data);
        if (head == null) {
            head=newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void setLast(){
        if(head ==null ) {
            System.out.println("List is empty ");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            currNode =currNode.next;
        }
        currNode.next=head;
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

    public static void main(String[] args) {
        JoshephsProblem j=new JoshephsProblem();
        j.addFirst("Gaurav");
        j.addFirst("Aditi");
        j.addFirst("Jay");
        j.addFirst("Sammit");
        j.addFirst("Boobin");
        j.setLast();
        j.skip(3);



    }

  */
}
