package Java_Classes;
abstract class Bird{
    abstract void fly();
    abstract void eat();
}
class Sparrow extends Bird{
    void fly()
    {
        System.out.println("Sparrow is Flying");
    }
    void eat()
    {
        System.out.println("Sparrow is Eating");
    }
}
class Crow extends Bird{
    void fly()
    {
        System.out.println("Crow is Flying at medium Altitude");
    }
    void eat()
    {
        System.out.println("Crow is Eating");
    }
}
abstract class Eagle extends Bird{
    abstract void eat();
    void fly()
    {
        System.out.println("Eagle is flying on High Altitude");
    }
}
class Serpent extends Eagle{
    void eat()
    {
        System.out.println("Serpent eagle is Eating");
    }
}
class Golden extends Eagle{
    void eat()
    {
        System.out.println("The Golden Eagle is Eating Fish");
    }
}
class Sky{
    void allowBirds(Bird ref)
    {
        ref.eat();
        ref.fly();
    }
}
public class BirdApp {
    public static void main(String[] args) {
        Sparrow s=new Sparrow();
        Crow c=new Crow();
        Serpent s1=new Serpent();
        Golden g=new Golden();
        Sky s2=new Sky();
        s2.allowBirds(s);
        s2.allowBirds(c);
        s2.allowBirds(s1);
        s2.allowBirds(g);


    }
}
