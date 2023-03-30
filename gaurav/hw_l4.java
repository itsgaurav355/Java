package com.gaurav;
import java.util.Scanner;
public class hw_l4 {
    public static void main(String[] args) {

/*Question 1
Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<=a;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        for(;;){
            System.out.println("Its gaurav");
        }

 */
        /*Question 2
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=a;a<=100;a++) {
            if(a==1){
                System.out.println("Enter your marks");
                int b=sc.nextInt();
                if(b>=90){
                    System.out.println("This is Good");
                }
                else if(89>=b && b>=60){
                    System.out.println("This is also good");
                }
                else if(59>=b && b>=0){
                    System.out.println("This is also Good");
                    System.out.println("because Marks don't matter but our effort does");
                }
            }else if(a==0){
                System.out.println("Program is over");
                break;
            }


        }

         */
        //Prime no. indicator
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i<100;i++){
            if(a==i && (a%i)==0){
                System.out.println("it is an prime no.");
            }
            else if(a%i==0 && a!=i){
                System.out.println("It is not a prime no It is divisible by=  "+ i);
            }
        }


    }
}
