package com.Java_Classes;
import java.util.Scanner;

public class OccuranceOfAnCharacter {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        String s;
        char ch;
        System.out.println("Enter a string : ");
        s= scan.next();
        try{
            System.out.println("Enter the character to check : ");
            ch=(char)System.in.read();
            int m,i;
            m=s.length();
            int count=0;
            for(i=0;i<m;i++){
                if(s.charAt(i)==ch){
                    count++;
                }
            }
            System.out.println(count);
        }catch (Exception e ){
            System.out.println();
        }
    }
}
