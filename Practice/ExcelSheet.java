package com.Practice;

public class ExcelSheet {
    public static void main(String[] args) {
        System.out.println(findIndex("ZZZ"));
    }
    static int findIndex(String str){
       return getIndex(str,0);
    }

    private static int getIndex(String str, int ans) {
        if(str.isEmpty()){
            return ans;
        }
        int temp = str.charAt(0);//AA  A-->65
        if(temp < 65 || temp > 90){
            return 0;
        }
        temp = temp % 64 ;
        ans = 26 * ans + temp;
       return getIndex(str.substring(1),ans);
    }
}
