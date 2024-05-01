package com.Java_Classes;

import java.util.Random;
import java.util.Scanner;
class game {
    public int number;
    public int inputno;
    public int noofguesses=0;//for no. of guesses

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("Guess the no.!!");
        Scanner sc = new Scanner(System.in);
        inputno = sc.nextInt();

    }

    boolean iscorrectnumber() {
        noofguesses++;
        if (inputno==number){
            System.out.println("Congratulations you guessed right the value is "+ number);
            System.out.println("You Got this value in "+ noofguesses+"  times");
            return true;
        }
        else if (inputno<number){
            System.out.println("your choosen value is less than guess value");
        }
        else if (inputno>number){
            System.out.println("Your gussed no. is greater than guess value");
        } return false;
    }
}
public class GuessRandomNo {
    public static void main(String[] args) {
        game Gaurav = new game();
        boolean d= false;
        System.out.println(!d);
        while (!d) {
            Gaurav.takeuserinput();

            d = Gaurav.iscorrectnumber();
            System.out.println(d);
        }
    }
}
