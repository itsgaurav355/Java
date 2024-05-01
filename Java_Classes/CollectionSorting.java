package com.Java_Classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSorting {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(25);
        a.add(30);
        a.add(5);
        a.add(15);
        System.out.println(a);
        Collections.sort(a);
        System.out.println("Sorted arraylist: "+a);
    }
}
