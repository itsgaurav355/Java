package com.Practice;

public class isAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagramExist("rat","tar"));
    }

    public static boolean isAnagramExist(String s, String t) {
        int alpha[] =  new int[26];
        for(int i = 0;i < s.length() ;i++) alpha[s.charAt(i) - 'a']++;
        for(int i = 0;i < t.length() ;i++) alpha[t.charAt(i) - 'a']--;
        for(int i : alpha) if(i!=0) return false;
        return true;

    }
}
