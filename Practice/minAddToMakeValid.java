package com.Practice;

import java.util.Stack;

public class minAddToMakeValid {
    public static void main(String[] args) {

    }
    public int min(String s){
        Stack<Character> stack = new Stack<>();
        int add=0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
                add++;
            }else{
                if(ch == ')'){
                    if(stack.isEmpty() || stack.pop()!= '(' ){
                        add++;
                    }else{
                        add--;
                    }
                }
            }
        }
        return add;
    }

}

