package com.Java_Classes;

class Try1
{
    void func1()
    {
        System.out.println("Entering func1 ");
        try{
            func2();
        }catch(Exception e)
        {
            System.out.println(e);
            throw e;
        }
      //  System.out.println("Exiting func 1");
    }
    void func2()
    {
        System.out.println("Entering func2 ");
        int a,b,c;
        a=10;
        b=0;
        try{
            c=a/b;
           // System.out.println(c);
        }catch(Exception e)
        {
          // System.out.println(e);
           throw e;
        }

    }
}
public class ThrowDemo {

    public static void main(String[] args) {
        Try t=new Try();
        try{
            t.func1();
        }catch(Exception e)
        {
            System.out.println("Exception is "+e);
        }
        System.out.println("Exited Normally");
    }
}


