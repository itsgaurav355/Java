package com.Java_Classes;
class Try
{
    void func1()
    {
        System.out.println("Entering func1 ");
        func2();
        System.out.println("Exiting func 1");
    }
    void func2()
    {
        System.out.println("Entering func2 ");
        int a,b,c;
        a=10;
        b=0;
        c=a/b;
        System.out.println(c);
    }
}
public class DuckingInJava {
    public static void main(String[] args) {
        Try t=new Try();
        try{
            t.func1();
        }catch(Exception e)
        {
            System.out.println("Exception  "+e);
        }

    }
}
