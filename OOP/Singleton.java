package com.OOP;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        //checking whether its instance is being created or not
        if(instance == null ){
            instance = new Singleton();
        }
        return instance;
    }
}
