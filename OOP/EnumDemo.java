package com.OOP;

public class EnumDemo {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        //these are enum constants
        //by default public ,static and final
        //cant create child since its final
        //type is week
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day:Week.values()) {
            System.out.println(day);
        }
    }
}
