package com.gaurav;
import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        /*for  HashSet
        //for all operation the time complexity is O(1)
        //Creation
        HashSet<Integer> set=new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//will not add because no duplicate element allowed
        System.out.println(set);

        //search
        if(set.contains(1)){
            System.out.println("true");
        }
        if(!set.contains(6)){
            System.out.println("false");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not Contain 1 it is deleted");
            //Iterator
            Iterator itr=set.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+"-->");
            }
            System.out.print("null");
        }

         */
        //HashMap O(1)
        HashMap <String,Integer> map=new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        //Search
        if(map.containsKey("Indonesia")){
            //return true or false
            System.out.println("China is Present in map");
        }else{
            System.out.println("No china");
        }
        System.out.println(map.get("China"));//key exist
        System.out.println(map.get("Indonesia"));//not exist ==> null
        //for printing one by one set of hashmap
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys =map.keySet();
        for(String  key: keys){
            System.out.println(key +"  "+map.get(key));
        }

        map.remove("China");
        System.out.println(map);

    }
}
