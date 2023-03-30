package com.gaurav;
import java.util.Scanner;
public class arrayin2d {
    public static void main(String[] args) {
        //first[] prefer for no. of rows and second [] prefer to no. of culumn
        //The diff. in matrix and array is only is matrix starts from 1 to n
        //but the array always begins with 0 to n
        //Sample question find an element of the matrix and show its index

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        //for input
        //1.for rows
        for (int i = 0; i < rows; i++) {
            //2. for columns
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
//        int x=sc.nextInt();
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                if(matrix[i][j]==x){
//                    System.out.print("Index of the element is "+i+" Row "+j+" Column");
//                }
//            }
//
//        }


        //for output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int in = sc.nextInt();
        int jn = sc.nextInt();
        for (int i = in; i > 0; i++) {
            for (int j = jn; j <= i; j++) {
                System.out.println(matrix[i][j]);
                System.out.println(matrix[i - 1][j] = matrix[i - 1][j] - 1);
                if (matrix[i][j] == 0) {
                    try{
                        System.out.println("Yes");
                    }catch(Exception e){
                        System.out.println(e);
                    }
                } else {
                    try {
                        System.out.println("No");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            }


        }
    }
}