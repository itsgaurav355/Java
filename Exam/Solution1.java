package com.Exam;

import java.util.Scanner;

class  MarksOutOfBoundsException extends Exception{
    //custom exception creation
    public String getMessage()
    {
        return "MarksOutOfBoundsException: Wrong Marks entered";
    }
}
public class Solution1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan =new Scanner(System.in);
        try{
            System.out.println("Enter Physics marks ");
            a=scan.nextInt();
            System.out.println("Enter Maths marks");
            b=scan.nextInt();
            System.out.println("Enter Chemistry marks");
            c=scan.nextInt();
            if(a<100 && b<100 && c<100)
            {
                System.out.println("Your response has been recorded Successfully");
            }else
            {
                throw new MarksOutOfBoundsException();
            }
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }
        System.out.println("Exiting main Normally");

    }
}
