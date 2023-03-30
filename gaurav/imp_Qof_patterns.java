package com.gaurav;

public class imp_Qof_patterns {
    public static void main(String[] args) {
       /* Question 1 -->Solid Rectangle
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        */
        /*Question 2-->Hollow Rectangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                //cell (i,j)
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         */
        /*Question 3--> Half pyramid
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         */
        /*Question 4-->Inverted Pyramid
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         */
        /* Question 5 pyramid inverted by 180 degree
        for(int i=1;i<=4;i++){
            //inner loop for -->Spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");

            }
            //inner loop for stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }

         */
        /*Question 6
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

         */
        /*Question 7
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */
     //Or can use
       /* int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */
        /*Question 8-->Floyd's Triangle
        int a=1;
        for(int i=1;i<=5;i++){

           for (int j=1;j<=i;j++){
               System.out.print(a+" ");
               a++;
           }
            System.out.println();
        }
         /*
        /*Question 9 0-1 triangle
        for(int i=1;i<=5;i++){
            for(int j=1; j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

         */



    }
}