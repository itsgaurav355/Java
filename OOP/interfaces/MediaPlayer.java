package com.OOP.interfaces;

public class MediaPlayer implements Media{


    @Override
    public void start() {
        System.out.println("Starting the Music");
    }

    @Override
    public void stop() {
        System.out.println("Music is Stopped");
    }
}
