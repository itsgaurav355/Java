package com.gaurav;

import java.util.Scanner;

class InvalidPassword extends Exception {
    int i;

    InvalidPassword(int i) {
        this.i = i;
    }

    String alert() {
        switch (i) {
            case 1:
                return "Password should contain at least one special character";
            case 2:
                return "Password Exceed limit exception it should be of 8 letters only";


        }
        return "";
    }
}
public class test01 {
    static void check(String password) throws InvalidPassword {
        if(password.length()==8){
            if(password.contains("@") || password.contains("$") || password.contains("&")){
                System.out.println("Login Successfully");
            } else {
               throw new InvalidPassword(1);
            }
        }else {
            throw new InvalidPassword(2);
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Username: ");
        String username=sc.next();
        System.out.println("Enter Your Password ");
        String password=sc.next();
        try{
            check(password);
        }catch(InvalidPassword e){
            System.out.println(e.alert());
        }
        System.out.println("Exiting Main");
    }
}
