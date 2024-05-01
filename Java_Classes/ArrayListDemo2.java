package com.Java_Classes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList  al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        ArrayList all=new ArrayList();
        all.add("pentagon");
        all.add("Space");
      //  all.addAll(al);
        System.out.println(all);
        al.add(0,35);
        al.add(2,all);
        System.out.println(al);
  /*      for(int i=0;i<al.size();i++){
            System.out.println("Elelmet "+(i+1)+"->"+al.get(i));
        }

   */
     /*   int  count=0;
        while(count<al.size()){
            System.out.println("Elelmet "+(count+1)+"->"+al.get(count));
            count++;
        }

      */
        for(Object i:al){
            System.out.println(i);
        }
     /*   Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());//fail first /fail safe mechanism best for retrieving data
        }

      */

    }
}
