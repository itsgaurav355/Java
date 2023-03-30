package com.OOP.CustomCollection;

public class DoublyLinkedList {
    private Node head;
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
    public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + "-> ");
            node = node.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void displayRev(){
        Node node = head;
        Node last =null;
        while(node != null){
            last =node;
            node = node.next;
        }
       while(last != null){
           System.out.print(last.val+ "-> ");
           last = last.prev;
       }
        System.out.print("HEAD");
        System.out.println();

    }
    public void insertLast(int val){
        Node node =new Node(val);
        Node last =head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return ;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev=last;
    }
    public void insert(int after, int val){
        Node p = find(after);

        if(p == null){
            System.out.println("does not exist");
            return ;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next =node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node ;
        }
    }
    public Node find(int value){
        Node node= head;
        while(node != null){
            if(node.val == value){
                return node;
            }else{
                node= node.next;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insertLast(99);
        list.insert(8,45);
        list.display();
        list.displayRev();
    }
}
