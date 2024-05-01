package com.Java_Classes;
class Os
{
    Os()
    {
        System.out.println("Os is Installed");
    }
    void checkOs()
    {
        System.out.println("Os is Still Executing");
    }
}
class Charger
{
    String name;
    Charger(String n)
    {
        name=n;
        System.out.println("Charger Created of "+name);
    }
    void getCharger()
    {
        System.out.println("Charger can be Used for Charging ");
    }
}
class Mobile
{
    Os o=new Os();
    Mobile()
    {
        System.out.println("Mobile is Created WIth Os Installed ");
    }
    void hasA(Charger c)
    {
        System.out.println("Charger Acquired");
        System.out.println("Charger Used for Charging ");
    }
}
public class Delegation {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        Charger c=new Charger("IPhone");
        m.hasA(c);
        m.o.checkOs();
        c.getCharger();
        m=null;
       // m.o.checkOs();Throw Exception Because Mobile destroyed so Os is also destroyed
        c.getCharger();
    }
}
