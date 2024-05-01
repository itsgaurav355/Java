package com.Java_Classes;
/*class Demo5{
    int a,b;
    static int count;
    Demo5(){
        count++;
    }
}
public class NoOfObjects {
    public static void main(String[] args) {
        Demo5 d1=new Demo5();
        Demo5 d2=new Demo5();
        Demo5 d3=new Demo5();
        Demo5 d4=new Demo5();
        Demo5 d5=new Demo5();
        System.out.println("The no. of Object is :  "+ Demo5.count);

    }
}

 */
//Modified -->1
/*
class Demo5{
    int a,b;
    static int count;
    Demo5(){
        count++;
    }
    Demo5(int x){
        a=x;
        b=10;
        count++;

    }
    Demo5(int x,int y){
        a=x;
        b=y;
        count++;
    }
}
public class NoOfObjects {
    public static void main(String[] args) {
        Demo5 d1=new Demo5();
        Demo5 d2=new Demo5();
        Demo5 d3=new Demo5();
        Demo5 d4=new Demo5(5);
        Demo5 d5=new Demo5(5,10);
        System.out.println("The no. of Object is :  "+ Demo5.count);

    }
}

 */
//Modified 2-->Best one or Efficient to implement DRY
class Demo5{
    int a,b;
    static int count;
    //Non static block
    {
        count++;
    }
    Demo5(){

    }
    Demo5(int x){
        a=x;
        b=10;
    }
    Demo5(int x,int y){
        a=x;
        b=y;
    }
}
public class NoOfObjects {
    public static void main(String[] args) {
        Demo5 d1=new Demo5();
        Demo5 d2=new Demo5();
        Demo5 d3=new Demo5();
        Demo5 d4=new Demo5(5);
        Demo5 d5=new Demo5(5,10);
        System.out.println("The no. of Object is :  "+ Demo5.count);

    }
}

