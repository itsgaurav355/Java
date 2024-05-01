package com.Java_Classes;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet <Object> h=new HashSet<>();
      /*  h.add(10);
        System.out.println("Hash code : "+h.hashCode());
        h.add(20);
        System.out.println("Hash code : "+h.hashCode());
        h.add(50);
        System.out.println("Hash code : "+h.hashCode());
        h.add(35);
        System.out.println("Hash code : "+h.hashCode());
        h.add(55);
        System.out.println(h.contains(50));
        System.out.println("Hash code : "+h.hashCode());
        System.out.println(h);

       */
        h.add("Java");
        System.out.println(h.hashCode());
        h.add("Python");
        System.out.println(h.hashCode());
    }
}
