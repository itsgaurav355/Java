package com.OOP.CustomCollection;

public class SingleLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public SingleLinkedList() {
        this.size =0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail =head;
        }
        size += 1;
    }

    public void display(){
        Node temp =head;
        while(temp!= null){
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            size++;
            return ;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return ;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next =node;

        size++;
    }

    //insert using the recursion
    public void insertRec(int val,int index,Node currNode){

        if(currNode == null){
            return;
        }
        if(index==0){
            Node node=new Node(val);
            head= node;
            head.next=null;
            size++;
            return ;
        }
        if(index == 1){
             Node node =new Node(val);
             node.next= currNode.next;
             currNode.next=node;
             size++;
             return ;
         }else if(index>1){

            currNode=currNode.next;
            insertRec(val,index-1,currNode);
        }
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next = null;
        return val;
    }
//Recursion Reverse The linkedList
    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next =node;
        tail = node;
        tail.next = null;
    }
    //iterative approach for reversing the LL
     public void reverse(){
        if(size < 2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null ){
            present.next = prev ;
            prev = present;
            present = next ;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
     }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index -1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value){
        Node node= head;
        while(node != null){
            if(node.value == value){
               return node;
            }else{
                node= node.next;
            }
        }
        return null;
    }

    public Node get(int index){
        Node node= head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public void bubbleSort(){
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second= get(col+1);

            if(first.value > second.value){
                //swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    Node prev = get(col-1);
                    prev.next =second;
                    tail = first;
                    first.next =null;
                    second.next = tail;
                }else{
                    Node prev = get(col-1);
                    prev.next = second ;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row,col+1);
        }else{
            bubbleSort(row-1, 0);
        }
    }



    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirst(34);
        list.insertFirst(32);
        list.insertFirst(35);
        list.insert(100,3);
        list.insertFirst(33);
        list.insertFirst(99);

        list.display();

        list.bubbleSort();
        list.display();

    }
}
