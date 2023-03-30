package com.DSA;

import java.util.ArrayList;
//Subsequence stands for String Subset stands for numbers
public class SubSeq {
    //p for processed up for unprocessed
    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //including the current character
        subseq(p+ch ,up.substring(1) );
        //excluding the current character
        subseq(p ,up.substring(1) );

    }
    //For printing ascii value
    static void subseqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //including the current character
        subseqAscii(p+ch ,up.substring(1) );
        //excluding the current character
        subseqAscii(p ,up.substring(1) );
        //for ascii value;
        subseqAscii(p+(ch+0),up.substring(1));

    }
    //Using ArrayList
    static ArrayList<String> subseqAL(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //including the current character
        ArrayList<String> left=  subseqAL(p+ch ,up.substring(1));
        //excluding the current character
        ArrayList<String> right= subseqAL(p ,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
//        ArrayList<String>  hi=  subseqAL("","abc");
//        System.out.println(hi);
        subseqAscii("","abc");
    }
}
