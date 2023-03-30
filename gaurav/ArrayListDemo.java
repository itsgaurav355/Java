package com.gaurav;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
      //adding elements
        list.add(0);
        list.add(5);
        list.add(8);
        list.add(25);
        list.add(6);
        list.add(62);
        list.add(7);
        System.out.println(list);
        System.out.println(list.get(3));
        list.add(1,4);
        list.set(6,8);
        System.out.println(list);
        list.remove(3);
        int size=list.size();
        list.get(5);
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
