package com.Java_Classes;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer>ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        ll.add(2,15);
        System.out.println(ll);
        ll.addFirst(80);
        ll.addLast(100);
        System.out.println(ll);
        ll.add(10);
        ll.offer(20); //work same as add but show false rather than throwing exception when error occured
        System.out.println(ll.contains(10));
        System.out.println(ll.getFirst());
        System.out.println("Peek "+ll.peek());
        System.out.println(ll);
        System.out.println("polls  "+ll.poll());
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);
    }
}
