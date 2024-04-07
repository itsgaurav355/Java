package com.Practice;

import java.util.*;

public class SortArrayBasedOnFrequency {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr){
        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();

        for (int i =0 ; i< arr.length;i++){
            if(elementCountMap.containsKey(arr[i])){
                elementCountMap.put(arr[i],elementCountMap.get(arr[i])+1);
            }else{
                elementCountMap.put(arr[i],1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> listOfEntry  = new ArrayList<>(elementCountMap.entrySet());
                Collections.sort(listOfEntry,new Comparator<Map.Entry<Integer,Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                }
        );
        System.out.println("Input Array was "+ Arrays.toString(arr));
        System.out.println("Sorted Array elements in descending order of their frequency : ");
        System.out.print("[");
        for (Map.Entry<Integer,Integer > entry :listOfEntry){
            int f = entry.getValue();
            while(f >= 1){
                System.out.print(entry.getKey()+" ");
                f--;
            }
        }
        System.out.println("]");

    }
}
