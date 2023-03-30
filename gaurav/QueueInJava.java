package com.gaurav;

import java.util.*;

public class QueueInJava {
    //Using Array
   /*     static class Queue{
            static int arr[];
            static int size;
            static int rear=-1;
            Queue(int size){
                arr=new int[size];
                this.size=size;
            }
            public static boolean isEmpty()
            {
            return rear==-1;
            }
            //enqueue
            public static void add(int data){
                if(rear==size-1){
                    System.out.println("Queue overflow");
                    return;
                }
                rear++;
                arr[rear]=data;

            }
            //dequeue
            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue underflow");
                    return -1;
                }
                int front=arr[0];
                for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];
                }
                rear--;
                return front;
            }
            //peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue underflow");
                    return -1;
                }
              return arr[0];
            }
        }
    public static void main(String[] args) {
        Queue q=new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    */
    //Using Linked list;
     /*
     static class Node{
         int data;
         Node next;

         Node(int data){
             this.data=data;
             next=null;
         }
     }
     static class Queue1{
         static Node head=null;
         static Node tail=null;

         public static boolean isEmpty(){
             return head==null & tail==null;
         }
         public static void add(int data){
             Node newNode= new Node(data);
             if(tail==null){
                 tail=head=newNode;
                 return;
             }
             tail.next=newNode;
             tail=newNode;
         }
         public static int remove(){
             if(isEmpty()){
                 System.out.println("Empty Queue");
                 return -1;
             }
             int front =head.data;
             if(head==tail){
                 tail=null;
                 //return front;
             }
             head=head.next;
            return front;
         }
         public static int peek(){
             if(isEmpty()){
                 System.out.println("Empty Queue");
                 return -1;
             }
             return head.data;
         }
     }

     public static void main(String[] args) {
         Queue1 q=new Queue1();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         while(!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
         }
     }

      */
    //Queue using two stacks
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isEmpty(){
            return s1.empty();
        }

        public static void add(int data){
         while(!s1.isEmpty()){
              s2.push(s1.pop());
          }
          s1.push(data);
          while(!s2.isEmpty()){
              s1.push(s2.pop());
          }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        //Using collection framework
//        Queue<Integer> q = new LinkedList<>();
//        Queue<Integer> q = new ArrayDeque<>();
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

         while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
