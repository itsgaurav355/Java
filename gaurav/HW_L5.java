package com.gaurav;

public class HW_L5 {
    public static void main(String[] args) {
       // Q1 print Solid rhombus
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//

    /*Question 2 Number Pyramid
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }




     */
   /*Question 3 Palindromic number pyramid
       int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        \
    */


    }
}
