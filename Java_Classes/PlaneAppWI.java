package com.Java_Classes;
//Plane app Without inheritance not efficient mathode Go to line 80 for efficient method
/*

class CargoPlane{
    void takeOff()
    {
        System.out.println("Plane Took off");
    }
    void fly()
    {
        System.out.println("Plane is Flying");
    }
    void carryCargo()
    {
        System.out.println("Carrying Cargo");
    }
    void land()
    {
        System.out.println("Plane is landing ");
    }
}
class PassengerPlane{
    void takeOff()
    {
        System.out.println("Plane Took off");
    }
    void fly()
    {
        System.out.println("Plane is Flying");
    }
    void carryPassenger()
    {
        System.out.println("Carrying Passenger");
    }
    void land()
    {
        System.out.println("Plane is landing ");
    }
}
class FighterPlane{
    void takeOff()
    {
        System.out.println("Plane Took off");
    }
    void fly()
    {
        System.out.println("Plane is Flying");
    }
    void carryWeapons()
    {
        System.out.println("Carrying Weapons");
    }
    void land()
    {
        System.out.println("Plane is landing ");
    }
}
public class PlaneAppWI {
    public static void main(String[] args) {
        CargoPlane c= new CargoPlane();
        PassengerPlane p= new PassengerPlane();
        FighterPlane f= new FighterPlane();
        c.takeOff();
        c.fly();
        c.carryCargo();
        c.land();
        System.out.println();
        p.takeOff();
        p.fly();
        p.carryPassenger();
        p.land();
        System.out.println();
        f.takeOff();
        f.fly();
        f.carryWeapons();
        f.land();
    }
}
 */
/*
class Plane{
    void takeOff()
    {
        System.out.println(" Plane took off");
    }
    void fly()
    {
        System.out.println("the plane is Flying");
    }
    void land()
    {
        System.out.println("The plane is Landing ");
    }
}
class Cargo extends Plane{
    void carryCargo()
    {
        System.out.println("Carrying Cargo");
    }
}
class Passenger extends Plane{
    void carryPassenger()
    {
        System.out.println("Carrying Passenger");
    }
}
class Fighter extends Plane{
    void carryWeapon()
    {
        System.out.println("Carrying Weapon");
    }
}
public class PlaneAppWI{
    public static void main(String [] args){
        Cargo c=new Cargo();
        Passenger p=new Passenger();
        Fighter f = new Fighter();
        c.takeOff();
        c.fly();
        c.carryCargo();
        c.land();
        System.out.println();
        p.takeOff();
        p.fly();
        p.carryPassenger();
        p.land();
        System.out.println();
        f.takeOff();
        f.fly();
        f.carryWeapon();
        f.land();

    }
}
*/
//Abstraction and overriding in java
abstract class Plane{
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}
class Cargo extends Plane{
    void takeOff()
    {
        System.out.println("Cargo plane Took Off");
    }
    void fly()
    {
        System.out.println("Cargo is Flying");
    }
    void land()
    {
        System.out.println("The cargo is landing ");
    }
}
class Passenger extends Plane{
    void takeOff()
    {
        System.out.println("Passenger plane Took Off");
    }
    void fly()
    {
        System.out.println("Passenger is Flying");
    }
    void land()
    {
        System.out.println("The Passenger is landing ");
    }
}
class Fighter extends Plane{
    void takeOff()
    {
        System.out.println("Fighter plane Took Off");
    }
    void fly()
    {
        System.out.println("Fighter is Flying");
    }
    void land()
    {
        System.out.println("The Fighter is landing ");
    }
}
class Airport {
    void allowPlane(Plane ref)
    {
        ref.fly();
        ref.land();
        ref.takeOff();
    }
}
public class PlaneAppWI{
    public static void main(String [] args){
        Cargo c=new Cargo();
        Passenger p=new Passenger();
        Fighter f = new Fighter();
        c.takeOff();
        c.fly();
        c.land();
        System.out.println();
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
        f.takeOff();
        f.fly();
        f.land();

    }
}