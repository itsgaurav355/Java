package Java_Classes;
//Overriding In Java
class Animal{
    void eat()
    {
        System.out.println("The Animal is Eating ");
    }
    void sleep()
    {
        System.out.println("The Animal is Sleeping");
    }
    void breath()
    {
        System.out.println("the animal is Breathing");
    }
}
class Tiger extends Animal{
    void eat()
    {
        System.out.println("Tiger Hunts and then eats");
    }
}
class Deer extends Animal{
    void eat()
    {
        System.out.println("Deer Graze and eat");
    }
}
class Monkey extends Animal{
    void eat()
    {
        System.out.println("Monkey Steals and eats");
    }
}
public class AnimalApp {
    public static void main(String[] args) {
        Tiger t= new Tiger();
        Deer d =new Deer();
        Monkey m= new Monkey();
        t.eat();
        t.sleep();
        t.breath();
        System.out.println();
        d.eat();
        d.sleep();
        d.breath();
        System.out.println();
        m.eat();
        m.sleep();
        m.breath();

    }
}
