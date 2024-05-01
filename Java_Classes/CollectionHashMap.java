package com.Java_Classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionHashMap {
    public static void main(String[] args) {
        //No duplicate allowed
        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(10,"Sachin");
        m.put(20,"Dravid");
        m.put(30,"Dhoni");
        System.out.println(m);
        System.out.println(m.get(20));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsKey(20));
        m.remove(20);
        System.out.println(m);
        m.replace(10,"Gaurav");
        System.out.println(m);
        //Cannot use Enhanced for loop Directly or iterator as object
         for(Map.Entry e: m.entrySet()){
             System.out.println(e.getKey()+" "+e.getValue());
        }
        Iterator itr=m.entrySet().iterator();
         while(itr.hasNext()){
//             System.out.println(itr.next()); gives in pair not each value
             Map.Entry e=(Map.Entry)itr.next();
             System.out.println(e.getKey()+" "+ e.getValue());
         }
        //to maintain the order of insertion we can use LinkedHashmap too
        //Also we can use it in TreeHashSet for getting sorted value
    }
}
