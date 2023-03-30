package com.DSA;

public class FlipImage {
    public static void main(String[] args) {

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            //reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                //swap the number
                int temp = row[i];
                row[i] = row[image[0].length - i -1];
                row[image[0].length-i-1] =temp;
            }
        }
        return image;
    }
}
