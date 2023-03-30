package com.Exam;

import java.util.Scanner;
class Rectangle {
    double length;
    double breath;
    Rectangle( double length, double breath)
    {
        this.length=length;
        this.breath=breath;
    }
    double area()
    {
        return length*breath;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l, b ;
        System.out.println("Enter Length and Breath of Rectangle");
        l=sc.nextInt();
        b=sc.nextInt();
        Rectangle r=new Rectangle(l,b);
        System.out.println("The Area of the Rectangle is "+r.area());

    }

}
