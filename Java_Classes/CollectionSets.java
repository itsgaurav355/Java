package com.Java_Classes;

import java.util.TreeSet;

public class CollectionSets {
    public static void main(String[] args) {
        TreeSet<Object> t=new TreeSet<>();//Give output in ascending order
        t.add(90);//Uses Red-Black algorithm
        t.add(35);
        t.add(5);
        t.add(75);
        t.add((45));
        t.add(100);
        t.add(15);
        t.add(25);
        System.out.println(t);
        System.out.println(t.descendingSet());
        System.out.println(t.headSet(35));
        System.out.println(t.tailSet(45));
        System.out.println(t.floor(20));//value less then required
        System.out.println(t.ceiling(50));
 //it supports enhanced for loop as well as iterator
        System.out.println(t.higher(45));

    }
}
