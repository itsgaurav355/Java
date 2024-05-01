package com.Java_Classes;
//Composed objects Heart and Brain
class Heart
{
    Heart()
    {
        System.out.println("Heart is Created ");
    }
    void checkHeart()
    {
        System.out.println("Heart is Working");
    }
}
class  Brain
{
    Brain()
    {
        System.out.println("Brain is Created");
    }
    void checkBrain()
    {
        System.out.println("Brain is Working");
    }
}
//Aggregated Object Car
class Car
{
    Car()
    {
        System.out.println("The car is Created");
    }
    void checkCar()
    {
        System.out.println("the car is Ready to Use");
    }
}
class Human
{
    Heart h1=new Heart();
    Brain b=new Brain();
    Human()
    {
        System.out.println("Human is Created With Heart And Brain");
    }
    void hasA(Car c)
    {
        System.out.println("The Car is Working ");
    }
}
public class DeligationInJava {
    public static void main(String[] args) {
        Human h=new Human();
        Car c=new Car();
        h.b.checkBrain();
        h.h1.checkHeart();
        c.checkCar();
        h=null;
//        h.b.checkBrain();
//        h.h1.checkHeart();
        c.checkCar();


    }
}
