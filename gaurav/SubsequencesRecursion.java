package com.gaurav;

import java.util.HashSet;
//
public class SubsequencesRecursion {
    public static void subsequences(String str,int idx,String newString){
        if(idx==str.length()){
           System.out.println(newString);
           return;
       }
       //Time Complexity 2^n
       char currChar=str.charAt(idx);
        //to be
        subsequences(str,idx+1, newString+currChar);
        //not to be
        subsequences(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str="abc";
        //for avoiding repeatation of  elements
        HashSet<String> set =new HashSet<>();
        subsequences(str,0,"");
    }
}
//
/*
public class SubsequencesRecursion {
    public static void subsequences(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);
        //to be
        subsequences(str,idx+1, newString+currChar,set);
        //not to be
        subsequences(str,idx+1,newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        //for avoiding repeatation of  elements
        HashSet<String> set =new HashSet<>();
        subsequences(str,0,"",set);
    }
}

 */