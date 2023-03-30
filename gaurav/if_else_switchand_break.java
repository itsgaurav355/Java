package com.gaurav;
import java.util.Scanner;
public class if_else_switchand_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else if(a>b){
            System.out.println("a is greater than b");
        }else {
            System.out.println("a is lesser than b");
        }
        int button= sc.nextInt();
        switch(button){
            case 1 :
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid input ");
        }
        }
    }

