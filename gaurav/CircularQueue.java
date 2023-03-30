package com.gaurav;

public class CircularQueue {
    static class CircularQ{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        CircularQ(int size){
            arr=new int[size];
            this.size=size;
        }
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        //enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue overflow");
                return;
            }
            //1st element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
               rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }else{
                return arr[front];
            }

        }
    }
    public static void main(String[] args) {
        CircularQ q=new CircularQ(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

