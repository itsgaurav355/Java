package com.Java_Classes;
import java.util.Scanner;
//print even position times even elements
public class EvenPosition {
    public static void main (String [] args){
        int i;
        String s= "a5b3c1";
        String s1="";
        String s2="";
        for(i=1;i<=s.length();i++)
        {
            if(s.charAt(i-1)>=48 && s.charAt(i-1)<=57)
            {
                s1=s1 + s.charAt(i-1);
            }
            else
            {
                s2=s2+s.charAt(i-1);
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        for(i=0;i<s1.length();i++)
        {
            if((i+1)%2==0)
            {

            int element=s1.charAt(i)-48;

            for(int j=0;j<element;j++)
            {

                System.out.print(s2.charAt(i)+" ");
            }
                System.out.println();
            }
            else
            {
                System.out.println(s2.charAt(i));
            }
        }
    }
}
