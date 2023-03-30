package com.gaurav;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Hw_array2d_L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] marks = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println("The spiral order is : ");
        int rowStart = 0;
        int rowend = n - 1;
        int colstart = 0;
        int colend = m - 1;

        while (rowStart <= rowend && colstart <= colend) {
            for (int col = colstart; col <= colend; col++) {
                System.out.print(marks[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for (int row = rowStart; row <= rowend; row++) {
                System.out.print(marks[row][rowend] + " ");
            }
            colend++;

            //3
            for (int col = colend; col >= colstart; col--) {
                System.out.print(marks[rowend][col] + " ");
            }
            rowend--;
            //4
            for (int row = rowend; row >= rowStart; row--) {
                System.out.print(marks[row][colstart]);
            }
            colstart++;
            System.out.println();
        }
    }
}
