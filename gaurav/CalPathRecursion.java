package com.gaurav;
//calculate the no of path to travel from 0 0 to m n
public class CalPathRecursion {
  /*  public static int countPath(int i,int j,int m,int n){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        int rowPath= countPath(i+1,j,m,n);
        int columnPath=countPath(i,j+1,m,n);
                return rowPath+columnPath;
    }

   */
    //Place 1XM size tiles on MXN floor
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }else if(n<m){
            return 1;
        }else{
            //for vetical placement no of ways
            int verPlacement= placeTiles(n-m,m);
            //for horizontal placement no of ways
            int horPlacements=placeTiles(n-1,m);
            return verPlacement+horPlacements;
        }
    }

    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println( placeTiles(n,m));
//        int totalPath= countPath(0,0,m,n);
//        System.out.println(totalPath);
    }
}
