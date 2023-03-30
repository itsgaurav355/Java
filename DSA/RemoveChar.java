package com.DSA;

public class RemoveChar {
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    //By passing ans as return type
    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
           return skip1(up.substring(1));
        }else{
           return ch + skip1( up.substring(1));
        }
    }
    //For Skipping a particular String
   static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }else{
            return up.charAt(0)+ skipString(up.substring(1));
        }
   }
    public static void main(String[] args) {
        System.out.println(skipString("baccappledah"));
    }
}
