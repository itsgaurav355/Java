package com.gaurav;

public class String_builder {
    public static void main(String[] args) {
      //  StringBuilder sb=new StringBuilder("tony");
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        //for reversing element
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back =sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
//        //char at index 0
//        System.out.println(sb.charAt(0));
//        //set char at index
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//        sb.insert(0,'s');
//        System.out.println(sb);
//        sb.insert(2,'n');
//        System.out.println(sb);
//        //deleting in char
//        sb.delete(2,3);//ending index is non inclusive i.e 3 not includable
//        System.out.println(sb);
//Append ==>Aage Jodna
//        sb.append("e");
//        sb.append("l");
//        sb.append("l");
//        sb.append("o");
//        System.out.println(sb);

    }
}
