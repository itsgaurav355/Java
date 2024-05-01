package com.Java_Classes;
//Principal: Static block is executed only once because it is independent of no. of object Where non static block is dependent on it.
class Demo4{
    static {
        System.out.println("The static block 1 is executed");
    }
    static {
        System.out.println("The static block 2 is executed");
    }
    static {
        System.out.println("The static block 3 is executed");
    }
    {
        System.out.println("The Non static block 1 is executed");
    }
    {
        System.out.println("The Non static block 2 is executed");
    }
    {
        System.out.println("The Non static block 3 is executed");
    }
}
public class StaticVsNonstatic {
    public static void main(String[] args) {
        Demo4 d1=new Demo4();
        System.out.println();
        Demo4 d2=new Demo4();
        System.out.println();
        Demo4 d3=new Demo4();
    }
}
