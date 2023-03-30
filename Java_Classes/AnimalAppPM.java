package Java_Classes;
//
class Animal2 {
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
    class Tiger1 extends Animal2 {
        void eat() {
            System.out.println("Tiger Hunts and then eats");
        }

        void sleep() {
            System.out.println("Tiger is Sleeping");
        }

        void breath() {
            System.out.println("Tiger is breathing");
        }
    }

    class Deer1 extends Animal2 {
        void eat() {
            System.out.println("Deer Graze and eat");
        }

        void sleep() {
            System.out.println("Deer is Sleeping");
        }

        void breath() {
            System.out.println("Deer is breathing");
        }
    }

    class Monkey1 extends Animal2 {
        void eat() {
            System.out.println("Monkey Steals and eats");
        }

        void sleep() {
            System.out.println("Monkey is Sleeping");
        }

        void breath() {
            System.out.println("Monkey is breathing");
        }
    }

    class Forest {
        void allowAnimal(Animal2 ref) {
            ref.eat();
            ref.sleep();
            ref.breath();
        }
    }

    public class AnimalAppPM {
        public static void main(String[] args) {
            Tiger1 t = new Tiger1();
            Deer1 d = new Deer1();
            Monkey1 m = new Monkey1();
            Forest f = new Forest();
            f.allowAnimal(t);
            System.out.println();
            f.allowAnimal(d);
            System.out.println();
            f.allowAnimal(m);
        }
    }

