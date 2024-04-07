package com.Practice;

import java.util.Arrays;
import java.util.Stack;

public class removeStars {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
    public static String removeStars(String s) {
        char [] a = s.toCharArray();
        String res = "";
        Stack<Character> mystack = new Stack<Character>();

        for (char c : a) {
            mystack.push(c);
        }
        int stars =0 ;
        for (int i = 0; i < mystack.size(); i++) {
            char c = mystack.get(i);
            if (mystack.peek() == '*') {
                stars++;
                mystack.pop();
            }
            if (stars != 0) {
                mystack.pop();
                stars--;
            } else {
                res += mystack.pop();
            }
        }
        System.out.println(res);
        return res.toString();
    }
    private static void reverse(char [] a, int n){
        int i = 0 ,j = n-1;
        while(i<n/2){
            char temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
    }
}
