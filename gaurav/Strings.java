package com.gaurav;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        /*String declaration
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        System.out.println(name1);//For single word
        String name2=sc.nextLine();
        System.out.println(name2);
        String name="Tony";


        //Concatenation-->Addition of strings
        String firstname="Tony";
        String lastname="Stark";
        String fullname=firstname+ " "+lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }


        //for comparing string
        String name1="Tony";
        String name2 ="Tony2";
        //1 s1>s2 :+ve value || when String 1 is greater than string 2
        //2 s1==s2:0
        //s1<s2: -ve value ||value will be random no.
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equal");
        }

         */
        //Substring -->Small part of the string
        String Line="I am IRONMAN";
        String name=Line.substring(5,Line.length());//5 is biggning index and other is for last
        System.out.println(name);
    }
}
