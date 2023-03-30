package com.gaurav;
import java.util.Scanner;
public class Hw_L12_onStrings {
    public static void main(String[] args) {
        //question 1
        /* Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String []name=new String[size];
       int totallength=0;
       for(int i=0;i<size;i++){
           System.out.println("Enter the string ");
           name[i]=sc.next();
           totallength+=name[i].length();
       }
        System.out.println(totallength);

         */
       //Question 2
        Scanner sc=new Scanner(System.in);
        String input =sc.next();

//        String result="";
//        for(int i=0;i<input.length();i++){
//            if(input.charAt(i)== 'e'){
//                result+='i';
//
//            }else {
//                result += input.charAt(i);
//            }
//        }
//        //Or
//        String result=input.replace('e','i');
//        System.out.println(result);
        System.out.println( input.replace("@gmail.com"," "));;


    }
}
