package com.Practice;

public class MergeAlternateString {
    public static void main(String[] args) {
        //1768. Merge Strings Alternately

    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
//                result.append
            }
            i++;
        }
        return result.toString();
    }
}
