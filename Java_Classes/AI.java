package com.Java_Classes;
import javax.sound.sampled.*;
import java.io.IOException;
import java.sql.Time;
import java.util.Scanner;
import java.util.*;
import java.util.TimeZone;

class MethodAI{
    int date,month, year,age;
   String username="abhi";
         String  password="MicroTony";
   MethodAI(String username,String password){
       if(this.username.contentEquals(username) && this.password.contentEquals(password)){
           System.out.println("Hi ,"+ username);
           System.out.println("Enter Your Birthdate Date , Month , Year");
           takeBirthdate();
       }else{
           System.out.println("Wrong Username or Password Try again");
       }

    }
    void takeBirthdate(){
       Scanner sc = new Scanner(System.in);
       date=sc.nextInt();
       month=sc.nextInt();
       year=sc.nextInt();
       calAge(date,month,year);
   }
   void calAge(int date,int month,int year)
   {
       Date t= new Date();
       age= 2022-this.year;
       if(this.month>= t.getMonth()+1){
           if(this.date>=t.getDate()){
               age++;
           }
       }
       System.out.println("Your Age is : "+ age);

   }


}
public class AI {
    public static void main(String[] args) {
        String username,password;
        Scanner sc= new Scanner(System.in);
        int d,m,y;
        System.out.println("Welcome to Marvel AI !!");
        System.out.println("Enter Your Username");
        username=sc.next();
        System.out.println("Enter your Password");
        password=sc.next();
        MethodAI k=new MethodAI(username,password);


    }
}
