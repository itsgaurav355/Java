package com.Java_Classes;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionStack {
    public static void main(String[] args) {

        LinkedList <Object> ll=new LinkedList<>();
        ll.push("Gaurav");
        ll.push("Is");
        ll.push("Good ");
        ll.push("Boy");
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
        for(Object s:ll){
            System.out.println(s);
        }
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        Iterator itr=ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
