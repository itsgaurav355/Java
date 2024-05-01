package com.Java_Classes;
class  Demo{
    int a,b;
    static int x,y;
}
public class staticInJava
{
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2 =new Demo();
        Demo d3=new Demo();
        d1.a=10;
        d1.b=20;
        d1.x=30;
        d1.y=40;
        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(d1.x);
        System.out.println(d1.y);
        d2.a=11;
        d2.b=22;
        d2.x=33;
        d2.y=44;
        System.out.println(d2.a);
        System.out.println(d2.b);
        System.out.println(d2.x);
        System.out.println(d2.y);
        d3.a=111;
        d3.b=222;
//        d3.x=333;
//        d3.y=444;
        d1.x=333;//Static Variable
        d1.y=444;
        System.out.println(d3.a);
        System.out.println(d3.b);
        System.out.println(d3.x);
        System.out.println(d3.y);
    }
}
