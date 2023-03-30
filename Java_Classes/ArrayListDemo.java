package Java_Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> a =new ArrayList<>();
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name : ");;
        String name =sc.nextLine();
        a.add(name);
        System.out.println("Enter your dob :");
        String dob=sc.next();
        a.add(dob);
        System.out.println("Enter your address ");
        String address=sc.nextLine();
        address+=sc.nextLine();
        a.add(address);
        System.out.println("Are you Married? ");
        boolean status =sc.nextBoolean();
        a.add(status);
        System.out.println(a);
    }
}
