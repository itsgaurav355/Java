package com.DSA;

public class Search2DMatrix {
    //74. Search a 2D Matrix
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0; j < matrix[i].length ; j++){
                int temp = matrix[i].length - 1 ;
                if(target > matrix[i][temp]){
                    break;
                }else{
                    return helper(matrix , i , target);
                }
            }
        }
        return false;
    }

    private static boolean helper(int [][] matrix , int row , int target){
        int start = 0;
        int end = matrix[row].length;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] < target){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
