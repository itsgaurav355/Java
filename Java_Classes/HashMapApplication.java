package com.Java_Classes;

import java.util.*;

public class HashMapApplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Map<String , ArrayList<String>> m=new HashMap<String , ArrayList<String>>();
        ArrayList <String > al;
        for(;;){
            System.out.println("Enter the IMEI number : ");
            String imei=sc.next();
            System.out.println("enter Location travelled: ");
            String loc=sc.next();
            Iterator itr=m.entrySet().iterator();
            if(itr.hasNext()){
                if(m.containsKey(imei)){
                    al =m.get(imei);
                    al.add(loc);
                    m.put(imei,al);
                }else{
                    al=new ArrayList<String>();
                    al.add(loc);
                    m.put(imei,al);
                }
            }else{
                al=new ArrayList<>();
                al.add(loc);
                m.put(imei,al);
            }
            System.out.println("Press 1 to continue / press 0 to Quit");
            int x=sc.nextInt();
            if(x==0){
                for(Map.Entry<String,ArrayList<String>> e:m.entrySet()){
                    System.out.println("IMEI number = "+e.getKey());
                    al=e.getValue();
                    for(Object o: al){
                        System.out.println(o);
                    }
                }
                break;
            }

        }
    }
}
