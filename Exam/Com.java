package com.Exam;

import java.util.Scanner;

abstract class Compartment{
    abstract void notice();
}

class FirstClass extends Compartment {

    @Override
    void notice() {
        System.out.println("firstClass");
    }
}

class Ladies extends Compartment{

    @Override
    void notice() {
        System.out.println("Ladies");
    }
}

class General extends Compartment{

    @Override
    void notice() {
        System.out.println("General");
    }
}

class Luggage extends Compartment{

    @Override
    void notice() {
        System.out.println("Luggage");
    }
}

public class Com {
    public static void main(String[] args) {
        Compartment[] comp = new Compartment[10];
        for (int i = 0; i < comp.length; i++) {
            comp[i] = new General();
        }
        comp[2] = new General();
        comp[3] = new Luggage();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n)
        {
            case 3 : {
                for (int i = 0; i < 10; i++) {
                    comp[2].notice();

                }
                break;
            }
            case 4 : {
                for (int i = 0; i < 10; i++) {
                    comp[3].notice();
                }
                break;
            }
            default:{
                for (int i = 0; i < 10; i++) {
                    comp[0].notice();
                }
            }
        }
    }
}
