package com.OOP.interfaces;

public class Main {
    public static void main(String[] args) {
        //How handle multiple interfaces same method for single Object and do different work with that
        Car gaurav =new Car();
        gaurav.start();
        gaurav.startMusic();
        gaurav.upgradeEngine();
    }
}
