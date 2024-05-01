package com.Java_Classes;
import java.util.Scanner;
//abstraction efficient method --> Impure abstraction= abstract method+concrete methods
import static java.lang.Math.PI;

abstract class Shape{
    float area;
    //abstract methods
    abstract void input();
    abstract void calArea();
    //concrete methods
    void disp()
    {
        System.out.println("Area is : "+area);
    }
}
class Square extends Shape{
    float l;
    Scanner sc =new Scanner(System.in);
    void input()
    {
        System.out.println("Enter side of Square");
        l=sc.nextFloat();
    }
    void calArea()
    {
        area=l*l;
    }

}
class Rectangle extends Shape{
    float l,b;
    Scanner sc =new Scanner(System.in);
    void input()
    {
        System.out.println("Enter Length and Breadth of Rectangle");
        l=sc.nextFloat();
        b=sc.nextFloat();
    }
    void calArea()
    {
        area=l*b;
    }

}
class Circle extends Shape{
    float r;
    Scanner sc =new Scanner(System.in);
    void input()
    {
        System.out.println("Enter Radius of the Circle");
        r=sc.nextFloat();
    }
    void calArea()
    {
        area= 3.14f*r*r;
    }

}
public class Geometry {
    public static void main(String[] args) {
        Square s=new Square();
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        s.input();
        s.calArea();
        s.disp();
        r.input();
        r.calArea();
        r.disp();
        c.input();
        c.calArea();
        c.disp();
    }
}
