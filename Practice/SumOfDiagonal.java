package com.Practice;

public class SumOfDiagonal {
    public static void main(String [] args){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum of diagonal is : "+ sum(arr));
    }
    static int sum (int [][] arr){
        int sumOfDiagonal=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j < arr[i].length; j++ ){
               if(i==j || (i==0 && j == arr[i].length-1) || (j==0 && i==arr.length-1)){
                   sumOfDiagonal = sumOfDiagonal + arr[i][j];
               }
            }
        }
        return sumOfDiagonal;
    }
}
