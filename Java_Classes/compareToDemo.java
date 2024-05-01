package com.Java_Classes;
import java.util.Scanner;

public class compareToDemo {
    public static void main(String[] args) {
        int res;
        String s1,s2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String 1");
        s1=scan.next();
        System.out.println("Enter String 2");
        s2=scan.next();
        res= s1.compareTo(s2);
        if(res==0){
            System.out.println("Both the Strings are Equal");
        }else if (res >0){
            System.out.println("String 1 is Greater than String 2");
        }else{
            System.out.println("The String 2 is Greater than String 1");
        }
    }
}
