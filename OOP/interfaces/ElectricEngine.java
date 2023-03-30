package com.OOP.interfaces;

public class ElectricEngine implements Engine{
    public ElectricEngine() {
        System.out.println("Electric engine Created Successfully");
    }

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine is Accelerating");
    }
}
