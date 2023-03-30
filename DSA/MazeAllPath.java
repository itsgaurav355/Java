package com.DSA;

import java.util.Arrays;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][] path =new int[maze.length][maze[0].length];
        allPath(0,0,maze,path,1,"");
    }
    //Backtracking--> The changes made by the function will be reverted back to previous version of changes no new changes will be available
    static void mazeAllPath(int r, int c, boolean[][]maze, String p) {
        if (r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }//I am considering this block in my path
        maze[r][c] =false;
        //For Down
        if ( r<maze.length-1){
            mazeAllPath(r + 1, c,maze, p + "D");
        }
        //For right
        if (c < maze[0].length-1) {
            mazeAllPath(r, c + 1,maze, p + "R");
        }
        //for left
        if(c > 0){
            mazeAllPath(r,c-1,maze,p+"L");
        }
        //for Up
        if(r > 0){
            mazeAllPath(r-1,c,maze,p+"U");
        }
        //this line is where the function is over
        //So before the function is removed ,also remove the changes made by this function
        maze[r][c] =true;
    }

    static void allPath(int r, int c, boolean[][]maze,int [][] path,int step, String p) {
        if (r==maze.length-1 && c==maze[0].length-1) {
            path[r][c]=step;
            for(int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

            return;
        }
        if(!maze[r][c]){
            return;
        }//I am considering this block in my path
        maze[r][c] =false;
        path[r][c]=step;
        //For Down
        if ( r<maze.length-1){
            allPath(r + 1, c,maze, path,step+1,p + "D");
        }
        //For right
        if (c < maze[0].length-1) {
            allPath(r, c + 1,maze,path,step+1, p + "R");
        }
        //for left
        if(c > 0){
            allPath(r,c-1,maze, path,step+1,p+"L");
        }
        //for Up
        if(r > 0){
            allPath(r-1,c,maze, path,step+1,p+"U");
        }
        //this line is where the function is over
        //So before the function is removed ,also remove the changes made by this function
        maze[r][c] =true;
        path[r][c]=0;
    }
}
