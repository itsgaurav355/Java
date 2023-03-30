package com.gaurav;
//Q1 send a given character into the last of the string
/*
public class RecursionProblem {
    public static void moveAll(String str,int index,int count,String newString)
    {
        if(index==str.length())
        {
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar =str.charAt(index);
        if(currChar =='x')
        {
            count++;
            moveAll(str,index+1,count,newString);
        }else{
            newString += currChar;
            moveAll(str,index+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str ="axbcxxd";
        moveAll(str,0,0,"");
    }
}

 */
