package com.DP;

import java.util.ArrayList;
//coding ninja frog jump
public class FrogJump2 {
    public static void main(String[] args) {
        int [] heights = {0,2,5,6,7};
        System.out.println(frogJumpRecursion(heights.length-1,heights));
    }
    public static int frogJumpRecursion(int index , int [] heights){
        if(index == 0) return 0;
        int left = frogJumpRecursion(index-1,heights) + Math.abs(heights[index] - heights[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1) right = frogJumpRecursion(index-2,heights) + Math.abs(heights[index] - heights[index-2]);
        return Math.min(left,right);
    }

    public static int frogjump(int index, int [] heights , int [] dp){
        if(index == 0) return 0;
        if(dp[index] != -1) return dp[index];
        int left = frogjump(index-1,heights,dp) + Math.abs(heights[index] - heights[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1) right = frogjump(index-2,heights,dp) + Math.abs(heights[index] - heights[index-2]);
        return Math.min(left,right);
    }

}
