package com.Java_Classes;
import java.util.Scanner;
//String functions In java
public class stringsInJava {
    public static void main(String[] args){
        String s1="RajaRamMohanRoy";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.charAt(5));
        System.out.println(s1.indexOf("R"));
        System.out.println(s1.lastIndexOf("R"));
        System.out.println(s1.substring(7));
        System.out.println(s1.substring(4,10));
    }
}
