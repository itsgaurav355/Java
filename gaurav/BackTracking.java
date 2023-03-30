package com.gaurav;

public class BackTracking {
    public static void nextString(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            nextString(newString,perm+currChar,idx+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        nextString(str,"",0);
    }
}
