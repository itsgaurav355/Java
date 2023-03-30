package com.gaurav;

import java.util.ArrayList;

public class calSubset {
    public static void subsets(int n, ArrayList <Integer> subset){
        if(n==0){
            printList(subset);
            return;
        }
        //want to be in
       subset.add(n);
        subsets(n-1,subset);
        //dont want be in
       subset.remove(subset.size()-1);
        subsets(n-1,subset);
    }
    public static void printList(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList <Integer> subset=new ArrayList<>();
        subsets(n,subset);
    }
}
