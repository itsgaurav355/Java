package com.gaurav;

public class Hw_Problem_L6 {
    public static void main(String[] args) {
   /*Question 1 hollow Butterfly
   int n=4;

   //first half part
        for(int i=1;i<=n;i++ ) {
            if (i == 2 || i == 1) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 2 * (n - i); j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }else if(i==3){
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(" *");
                }
            }
            else if(i==4){
            for(int j=1;j<=8;j++){
                if(j==1||j==4||j==5|| j==8){
                    System.out.print("*");
                }else if(j==2 ||j==3 || j==6 || j==7){
                    System.out.print(" ");
                }
            }
            }
                System.out.println();

        }
        //Second half part
        for(int i=n;i>=1;i-- ) {
            if (i == 2 || i == 1) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 2 * (n - i); j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }else if(i==3){
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(" *");
                }
            }
            else if(i==4){
                for(int j=1;j<=8;j++){
                    if(j==1||j==4||j==5|| j==8){
                        System.out.print("*");
                    }else if(j==2 ||j==3 || j==6 || j==7){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }

    */
       /*Question 2
        int n=5;

        for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i+1;j++){
               System.out.print(" ");
           }
            for(int j=1;j<=n;j++){
                if(i==1 ||i==5){
                    System.out.print("*");
                }else if(j==1||j==5){
                    System.out.print("*");
                }
                else if(j==2||j==3||j==4){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        */
        //Question 4
      /*  int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }

       */
        //Queston 5
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

         */

   }
}

