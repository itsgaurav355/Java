package com.DSA;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeList(3, 3,""));
        boolean [][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeObstacle1(0,0,maze,"");
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int down = count(r - 1, c);
        int right = count(r, c - 1);
        return down + right;
    }

    static void maze(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if ( r > 1){
            maze(r - 1, c, p + "D");
        }
        if (c > 1) {
            maze(r, c - 1, p + "R");
        }
    }
//including the diagonal path
    static void mazeDiagonal(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if ( r > 1){
            mazeDiagonal(r - 1, c, p + "D");
        }
        if (c > 1) {
            mazeDiagonal(r, c - 1, p + "R");
        }
        if(c>1 && r>1){
            mazeDiagonal(r-1,c-1,p + "C");
        }
    }
    //Maze With obstacles
    static void mazeObstacle(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r==2 && c==2){
            return;
        }
        if ( r > 1){
            mazeObstacle(r - 1, c, p + "D");
        }
        if (c > 1) {
            mazeObstacle(r, c - 1, p + "R");
        }
    }
//with obstacle using 2d array
static void mazeObstacle1(int r, int c,boolean[][]maze, String p) {
    if (r==maze.length-1 && c==maze[0].length-1) {
        System.out.println(p);
        return;
    }
    if(!maze[r][c]){
        return;
    }
    if ( r<maze.length-1){
        mazeObstacle1(r + 1, c,maze, p + "D");
    }
    if (c < maze[0].length-1) {
        mazeObstacle1(r, c + 1,maze, p + "R");
    }
}

    static ArrayList<String> mazeList(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if ( r > 1){
            list.addAll(mazeList(r - 1, c, p + "D"));
        }
        if (c > 1) {
            list.addAll(mazeList(r, c - 1, p + "R"));
        }
        return list;
    }

    }
